package de.myplantparadise.mpp.MPPBeans;

import de.myplantparadise.mpp.DataStorage.BioPlant;
import de.myplantparadise.mpp.DataStorage.Plants;
import de.myplantparadise.mpp.Utils.BioPlantWithNeighborStats;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named(value = "EvaluatorBean")
@SessionScoped
public class EvaluatorBean {
    private int evaluationValue;
    private int red;
    private int green;
    
    private List<String> listOfAllPlantNames;
    private String selectedPlant = "";
    
    private List<BioPlant> selectedPlants = new ArrayList();
    private String[][] neighborTable = new String[0][0];
    private List<BioPlantWithNeighborStats> goodSuggestions = new ArrayList();
    private List<BioPlantWithNeighborStats> badSuggestions = new ArrayList();
    
    private Plants storage = new Plants(); 
    
    @PostConstruct
    public void init() {
        this.listOfAllPlantNames = storage.getAllPlantNamesWithSynonyms();
        evaluate();
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
            evaluate();
            updateSuggestions();
            actualizeNeighborTable();
        }
        selectedPlant = "";
        return null;
    }
    
    public void updateSuggestions(){
        //get good and bad neighbor stats of the selected plants
        List<BioPlantWithNeighborStats> neighborStats = new ArrayList();
        for(BioPlant plant : selectedPlants) {
            //count occurance as good neighbor
            for(String gn : plant.getGoodNeighbors()) {
                boolean foundEntry = false;
                for(BioPlantWithNeighborStats entry : neighborStats) {
                    if(entry.getPlant().getName().equals(gn)) {
                        entry.addToGoodNr(1);
                        foundEntry = true;
                    }
                }
                if(!foundEntry) {
                    neighborStats.add(new BioPlantWithNeighborStats(storage.getPlantByName(gn), 1, 0));
                }
            }
            //count occurance as bad neighbor
            for(String bn : plant.getBadNeighbors()) {
                boolean foundEntry = false;
                for(BioPlantWithNeighborStats entry : neighborStats) {
                    if(entry.getPlant().getName().equals(bn)) {
                        entry.addToBadNr(1);
                        foundEntry = true;
                    }
                }
                if(!foundEntry) {
                    neighborStats.add(new BioPlantWithNeighborStats(storage.getPlantByName(bn), 0, 1));
                }
            }
        }
        //filter entries
        goodSuggestions.clear();
        badSuggestions.clear();
        for(BioPlantWithNeighborStats plant : neighborStats) {
            if(plant.getGoodNr() >= (int) (selectedPlants.size()/2) && plant.getBadNr() <= (int) (selectedPlants.size()/4)) {
                goodSuggestions.add(plant);
            }
            if(plant.getBadNr() >= (int) (selectedPlants.size()/2) && plant.getGoodNr() <= (int) (selectedPlants.size()/4)) {
                badSuggestions.add(plant);
            }
        }
        //sort the result Lists so that extreme values come first
        //goodSuggestions.sort(Comparator.comparingInt(BioPlantWithNeighborStats::getSortIndicatorGood));
        Collections.reverse(goodSuggestions);
        //badSuggestions.sort(Comparator.comparingInt(BioPlantWithNeighborStats::getSortIndicatorBad));
        Collections.reverse(badSuggestions);
    }
    
    public void evaluate(){
        int sum = 0;
        int counter = 0;
        for(BioPlant plant : selectedPlants) {
            for(BioPlant comparePlant : selectedPlants) {
                if(!plant.equals(comparePlant)) {
                    if(plant.getBadNeighbors().contains(comparePlant.getName())) {
                        counter += selectedPlants.size();
                    } else if (plant.getGoodNeighbors().contains(comparePlant.getName())) {
                        sum += 100 * selectedPlants.size();
                        counter += selectedPlants.size();
                    } else {
                        sum += 50;
                        counter++;
                    }
                }
            }
        }
        if(counter == 0) {
            evaluationValue = 50;
        } else { 
            evaluationValue = Math.round(sum/counter);
        }
        if(evaluationValue > 50){
            red = Math.round(255-evaluationValue*(255/100));
        }else{
            red = 255;
        }
        if(evaluationValue < 50){
            green = Math.round(255-(100-evaluationValue)*(255/100));
        }else{
            green = 255;
        }
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
        evaluate();
        updateSuggestions();
        actualizeNeighborTable();
        return null;
    }
    
    public String reset() {
        this.listOfAllPlantNames = storage.getAllPlantNamesWithSynonyms();
        this.selectedPlant = "";

        this.selectedPlants = new ArrayList();
        this.neighborTable = new String[0][0];
        this.goodSuggestions = new ArrayList();
        this.badSuggestions = new ArrayList();

        evaluate();
        updateSuggestions();
        actualizeNeighborTable();
        
        return null;
    }
    
    //---------------------------------GETTER & SETTER---------------------------------------------------

    public int getEvaluationValue() {
        return evaluationValue;
    }

    public void setEvaluationValue(int evaluationValue) {
        this.evaluationValue = evaluationValue;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public List<String> getListOfAllPlantNames() {
        return listOfAllPlantNames;
    }

    public void setListOfAllPlantNames(List<String> listOfAllPlantNames) {
        this.listOfAllPlantNames = listOfAllPlantNames;
    }

    public String getSelectedPlant() {
        return selectedPlant;
    }

    public void setSelectedPlant(String selectedPlant) {
        this.selectedPlant = selectedPlant;
    }

    public List<BioPlant> getSelectedPlants() {
        return selectedPlants;
    }

    public void setSelectedPlants(List<BioPlant> selectedPlants) {
        this.selectedPlants = selectedPlants;
    }

    public String[][] getNeighborTable() {
        return neighborTable;
    }

    public void setNeighborTable(String[][] neighborTable) {
        this.neighborTable = neighborTable;
    }

    public List<BioPlantWithNeighborStats> getGoodSuggestions() {
        return goodSuggestions;
    }

    public void setGoodSuggestions(List<BioPlantWithNeighborStats> goodSuggestions) {
        this.goodSuggestions = goodSuggestions;
    }

    public List<BioPlantWithNeighborStats> getBadSuggestions() {
        return badSuggestions;
    }

    public void setBadSuggestions(List<BioPlantWithNeighborStats> badSuggestions) {
        this.badSuggestions = badSuggestions;
    }
    
    
}
