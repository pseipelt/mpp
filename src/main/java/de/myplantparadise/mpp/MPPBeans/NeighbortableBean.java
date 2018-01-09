package MPPBeans;

import DataStorage.BioPlant;
import DataStorage.Plants;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="NeighbortableBean")
@SessionScoped
public class NeighbortableBean {
    
    private List<String> listOfAllPlantNames;
    private String selectedPlant = "";
    
    private List<BioPlant> selectedPlants = new ArrayList();
    private String[][] neighborTable = new String[0][0];
    
    private Plants storage = new Plants(); 
    
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
        BioPlant plantToAdd = storage.getPlantByName(selectedPlant);
        if(plantToAdd != null && !selectedPlants.contains(plantToAdd)){
            selectedPlants.add(plantToAdd);
            actualizeNeighborTable();
        }
        selectedPlant = "";
        return null;
    }
    
    public void actualizeNeighborTable(){
        if(!this.selectedPlants.isEmpty()) {
            this.neighborTable = new String[this.selectedPlants.size() + 1][this.selectedPlants.size() + 1];
            this.neighborTable[0][0] = "";
            
            //fill row and column names 
            int counter = 1;
            for(BioPlant plant : this.selectedPlants){
                this.neighborTable[0][counter] = plant.getName();
                this.neighborTable[counter][0] = plant.getName();
                counter++;
            }
            
            int row = 1;
            for(BioPlant plantRow : this.selectedPlants){
                int column = 1;
                for(BioPlant plantColumn : this.selectedPlants){
                    if(plantRow.equals(plantColumn)){
                        this.neighborTable[row][column] = "equal";
                    }
                    else if(plantRow.getBadNeighbors().contains(plantColumn.getName())){
                        this.neighborTable[row][column] = "bad";
                    }
                    else if(plantRow.getGoodNeighbors().contains(plantColumn.getName())){
                        this.neighborTable[row][column] = "good";
                    }
                    else {
                        this.neighborTable[row][column] = "ok";
                    }
                    column++;
                }
                row++;
            }
        }
        else { 
            this.neighborTable = new String[0][0];
        }
    }
    
    public String remove(int index) {
        selectedPlants.remove(index);
        actualizeNeighborTable();
        return null;
    }
    
    public String reset() {
        this.listOfAllPlantNames = storage.getAllPlantNamesWithSynonyms();
        selectedPlant = "";
        selectedPlants.clear();
        neighborTable = new String[0][0];
        return null;
    }
    
    //GETTERS

    public List<String> getListOfAllPlantNames() {
        return listOfAllPlantNames;
    }

    public String getSelectedPlant() {
        return selectedPlant;
    }

    public List<BioPlant> getSelectedPlants() {
        return selectedPlants;
    }

    public String[][] getNeighborTable() {
        return neighborTable;
    }
    
    //SETTERS

    public void setSelectedPlant(String selectedPlant) {
        this.selectedPlant = selectedPlant;
    }
}
