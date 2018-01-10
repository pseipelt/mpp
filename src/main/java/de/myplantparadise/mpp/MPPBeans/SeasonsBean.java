package de.myplantparadise.mpp.MPPBeans;

import de.myplantparadise.mpp.DataStorage.BioPlant;
import de.myplantparadise.mpp.DataStorage.Plants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "SeasonsBean")
@SessionScoped
public class SeasonsBean {
    private String selectedPlant = "";
    
    private List<String> listOfAllPlantNames;
    private List<BioPlant> selectedPlants = new ArrayList();
    private String[][] seasons = new String[0][0];
    private final String[] dates = {"AJanuar", "MJanuar", "EJanuar", "AFebruar", "MFebruar", "EFebruar",
                              "AMärz", "MMärz", "EMärz", "AApril", "MApril", "EApril", "AMai", "MMai", "EMai",
                              "AJuni", "MJuni", "EJuni", "AJuli", "MJuli", "EJuli", "AAugust", "MAugust", "EAugust",
                              "ASeptember", "MSeptember", "ESeptember", "AOktober", "MOktober", "EOktober",
                              "ANovember", "MNovember", "ENovember", "ADezember", "MDezember", "EDezember",};
    private final String[] dummyArray = new String[36];//used to loop over 36 td's
   
    private Plants storage = new Plants(); 
   
    @PostConstruct
    public void init() {
        this.listOfAllPlantNames = storage.getAllPlantNamesWithSynonyms();
    }
 
    //----------------------------------Functions--------------------------------------------------------
    public String loadSeasonsTable() {
        seasons = new String[selectedPlants.size()][9];
        for(int i = 0; i < selectedPlants.size(); i++){
            seasons[i][0] = selectedPlants.get(i).getName();
            if(!selectedPlants.get(i).getSowing_time_in().equals("")) {
                String[] sowing_time_in = selectedPlants.get(i).getSowing_time_in().split("\\-");
                seasons[i][1] = String.valueOf(Arrays.asList(dates).indexOf(sowing_time_in[0]) + 10);
                seasons[i][2] = String.valueOf(Arrays.asList(dates).indexOf(sowing_time_in[1]) + 10);
            } else {seasons[i][1] = "0"; seasons[i][2] = "0";}
            if(!selectedPlants.get(i).getPlant_time().equals("")) {
                String[] plant_time = selectedPlants.get(i).getPlant_time().split("\\-");
                seasons[i][3] = String.valueOf(Arrays.asList(dates).indexOf(plant_time[0]) + 10);
                seasons[i][4] = String.valueOf(Arrays.asList(dates).indexOf(plant_time[1]) + 10);
            } else {seasons[i][3] = "0"; seasons[i][4] = "0";}
            if(!selectedPlants.get(i).getSowing_time_out().equals("")) {
                String[] sowing_time_out = selectedPlants.get(i).getSowing_time_out().split("\\-");
                seasons[i][5] = String.valueOf(Arrays.asList(dates).indexOf(sowing_time_out[0]) + 10);
                seasons[i][6] = String.valueOf(Arrays.asList(dates).indexOf(sowing_time_out[1]) + 10);
            } else {seasons[i][5] = "0"; seasons[i][6] = "0";}
            if(!selectedPlants.get(i).getHarvest_time().equals("")) {
                String[] harvest_time = selectedPlants.get(i).getHarvest_time().split("\\-");
                seasons[i][7] = String.valueOf(Arrays.asList(dates).indexOf(harvest_time[0]) + 10);
                seasons[i][8] = String.valueOf(Arrays.asList(dates).indexOf(harvest_time[1]) + 10);
            } else {seasons[i][7] = "0"; seasons[i][8] = "0";}
        }
        return null;
    }
    
    public String dateStringToDateInt(String date){
        String intDate;
        intDate = String.valueOf(Arrays.asList(dates).indexOf(date) + 1);
        return intDate;
    }
    
    public String loadPlantForTable() {
        BioPlant plantToAdd = storage.getPlantByName(selectedPlant);
        if(plantToAdd != null && !selectedPlants.contains(plantToAdd)){
            selectedPlants.add(plantToAdd);
            loadSeasonsTable();
        }
        selectedPlant = "";
        return null;
    }

    public String remove(int index) {
        selectedPlants.remove(index);
        loadSeasonsTable();
        return null;
    }
    
    public String reset() {
        this.listOfAllPlantNames = storage.getAllPlantNamesWithSynonyms();
        selectedPlant = "";
        selectedPlants.clear();
        seasons = new String[0][0];
        return null;
    }
    
    public List<String> completeText(String query) {
        List<String> results = new ArrayList<>();
        for(String plantName : listOfAllPlantNames) {
            if(plantName.toLowerCase().contains(query.toLowerCase())){
                results.add(plantName);
            }
        }
        return results;
    }
    
    //---------------------------------GETTER & SETTER---------------------------------------------------

    public String getSelectedPlant() {
        return selectedPlant;
    }

    public void setSelectedPlant(String selectedPlant) {
        this.selectedPlant = selectedPlant;
    }

    public List<String> getListOfAllPlantNames() {
        return listOfAllPlantNames;
    }

    public void setListOfAllPlantNames(List<String> listOfAllPlantNames) {
        this.listOfAllPlantNames = listOfAllPlantNames;
    }

    public List<BioPlant> getSelectedPlants() {
        return selectedPlants;
    }

    public void setSelectedPlants(List<BioPlant> selectedPlants) {
        this.selectedPlants = selectedPlants;
    }

    public String[][] getSeasons() {
        return seasons;
    }

    public void setSeasons(String[][] seasons) {
        this.seasons = seasons;
    }

    public String[] getDummyArray() {
        return dummyArray;
    }
   
}