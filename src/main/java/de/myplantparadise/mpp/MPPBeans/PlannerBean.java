package de.myplantparadise.mpp.MPPBeans;

import de.myplantparadise.mpp.DataStorage.Plant;
import de.myplantparadise.mpp.DataStorage.PlantStorage;
import de.myplantparadise.mpp.Utils.ArrayUtil;
import de.myplantparadise.mpp.Utils.PlantWithAmount;
import de.myplantparadise.mpp.Utils.SortUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named(value = "PlannerBean")
@SessionScoped
public class PlannerBean {
    ArrayUtil array_util = new ArrayUtil();
    private PlantStorage storage = new PlantStorage(); 
    
    List<String> listOfAllPlantNames = new ArrayList<>();
    private String selectedPlant = "";
    
    private List<PlantWithAmount> selectedPlants = new ArrayList();
    List<String> plantRows = new ArrayList<>();
    
    private final String GREEN = "rgba(0, 153, 0, 0.8)";
    private final String YELLOW = "rgba(255, 255, 128, 0.7)";
    private final String RED = "rgba(139, 0, 0, 0.8)";
    
    @PostConstruct
    public void init() {
        this.listOfAllPlantNames = storage.getAllPlantNamesWithSynonyms();
    }
    //---------------------------------FUNCTIONS--------------------------------------------------------

    public List<String> completeText(String query) {
        List<String> results = new ArrayList<>();
        for(String plantName : listOfAllPlantNames) {
            if(plantName.toLowerCase().contains(query.toLowerCase())){
                results.add(plantName);
            }
        }
        return results;
    }
    
    public String loadPlantForTable() {
        Plant plantToAdd = storage.getPlantByName(selectedPlant);
        boolean plantAlreadyAdded = false;
        if(plantToAdd != null) {
            for(PlantWithAmount plant : selectedPlants) {
                if(plant.getPlant().equals(plantToAdd)) {
                    plant.addToAmount(1);
                    plantAlreadyAdded = true;
                    break;
                }
            }
            if(!plantAlreadyAdded) {
                selectedPlants.add(new PlantWithAmount(plantToAdd, 1));
            }
            actualizeRowTable();
        }
        selectedPlant = "";
        return null;
    }
    
    public String actualizePlantRows(int index, int value){
        selectedPlants.get(index).addToAmount(value);
        if(selectedPlants.get(index).getAmount() == 0) {
            selectedPlants.get(index).setAmount(1);
        }
        actualizeRowTable();
        return null;
    }
    
    public void actualizeRowTable(){
        //prepare data
        plantRows.clear();
        List<Plant> unsortedPlantRows = getAllPlantRows(); //used for backup if sorting fails
        
        //in this case we will use amount for the evaluation value
        List<Plant> evaluatedPlantRows = evaluate(unsortedPlantRows);
        
        //run through plantList until a combination is found
        int numberOfTurns = 0;
        while(!evaluatedPlantRows.isEmpty() && numberOfTurns <= unsortedPlantRows.size()) {
            numberOfTurns++;
            
            //add first element to list and evaluate again
            plantRows.add(evaluatedPlantRows.get(0).getName());
            evaluatedPlantRows.remove(0);
            
            while(!evaluatedPlantRows.isEmpty()) {
                evaluatedPlantRows = evaluate(evaluatedPlantRows);
                boolean foundNeighborThisTurn = false;
                //search for good neighbor
                for(Plant plant : evaluatedPlantRows) {
                    if(plant.getGoodNeighbors().contains(plantRows.get(plantRows.size() - 1))) {
                        plantRows.add(GREEN);
                        plantRows.add(plant.getName());
                        evaluatedPlantRows.remove(plant);
                        foundNeighborThisTurn = true;
                        break;
                    }
                }
                //search for neutral neighbor if no good one was found
                if(!foundNeighborThisTurn) {
                    for(Plant plant : evaluatedPlantRows) {
                        if(!plant.getBadNeighbors().contains(plantRows.get(plantRows.size() - 1))) {
                            plantRows.add(YELLOW);
                            plantRows.add(plant.getName());
                            evaluatedPlantRows.remove(plant);
                            foundNeighborThisTurn = true;
                            break;
                        }
                    }
                }
                //if numberOfTurns equals size of plantList there is no solution without bad neighborhoods
                if(numberOfTurns == unsortedPlantRows.size() && !foundNeighborThisTurn) {
                    plantRows.add(RED);
                    plantRows.add(evaluatedPlantRows.get(0).getName());
                    evaluatedPlantRows.remove(0);
                    foundNeighborThisTurn = true;
                }
                //no neighbor was found so start a new turn
                if(!foundNeighborThisTurn){
                    break;//break while loop
                }
            }
            //move first element to end of list as start-setup for next turn if no final version found
            if(!evaluatedPlantRows.isEmpty()) {
                evaluatedPlantRows = evaluate(unsortedPlantRows);
                evaluatedPlantRows.add(evaluatedPlantRows.get(0));
                evaluatedPlantRows.remove(0);
                plantRows.clear();
            }
        }
    }
    
    private List<Plant> evaluate(List<Plant> plants){
        List<PlantWithAmount> sortedPlantList = new ArrayList();
        for(Plant plant : plants) {
            int evaluationValue = 0; //high value will indicate a bad neighbor
            for(Plant comparationPlant : plants) {
                if (comparationPlant.getBadNeighbors().contains(plant.getName())) {
                    evaluationValue += 2;
                } else if (!comparationPlant.getGoodNeighbors().contains(plant.getName())) {
                    evaluationValue += 1;
                }
            }
            sortedPlantList.add(new PlantWithAmount(plant, evaluationValue));
        }
        
        sortedPlantList = SortUtil.sortByAmount(sortedPlantList);
        
        List<Plant> returnList = new ArrayList();
        for(PlantWithAmount plant : sortedPlantList) {
            returnList.add(plant.getPlant());
        }
        //list is sorted with good neighbors first so we need to reverse it
        Collections.reverse(returnList);
        return returnList;
    }
    
    private List<Plant> getAllPlantRows() {
        List<Plant> tmp = new ArrayList();
        for(PlantWithAmount plant : selectedPlants) {
            for(int i = 0; i < plant.getAmount(); i++) {
                tmp.add(plant.getPlant());
            }
        }
        return tmp;
    }
    
     public String remove(int index) {
        selectedPlants.remove(index);
        actualizeRowTable();
        return null;
    }
    
    public String reset() {
        this.listOfAllPlantNames = storage.getAllPlantNamesWithSynonyms();
        selectedPlant = "";
        selectedPlants.clear();
        plantRows = new ArrayList<>();
        return null;
    }
    
    //GETTERS

    public List<String> getListOfAllPlantNames() {
        return listOfAllPlantNames;
    }

    public String getSelectedPlant() {
        return selectedPlant;
    }

    public List<PlantWithAmount> getSelectedPlants() {
        return selectedPlants;
    }

    public List<String> getPlantRows() {
        return plantRows;
    }
    
    //SETTER

    public void setSelectedPlant(String selectedPlant) {
        this.selectedPlant = selectedPlant;
    }
    
}
