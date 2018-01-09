package MPPBeans;

import DataStorage.BioPlant;
import DataStorage.Plants;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="DictionaryBean")
@SessionScoped
public class DictionaryBean {
    private List<String> listOfAllPlantNames;
    private String selectedPlant = "";
    private BioPlant plantToShow = new BioPlant("default");
    
    private Plants storage = new Plants(); 
    
    @PostConstruct
    public void init() {
        this.listOfAllPlantNames = storage.getAllPlantNamesWithSynonyms();
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
    
    public String loadPlantFromInput() {
        this.plantToShow = storage.getPlantByName(selectedPlant);
        this.selectedPlant = "";
        return null;
    }
    
    public void loadPlantFromMenu(String plant) {
        this.plantToShow = storage.getPlantByName(plant);
        this.selectedPlant = "";
    }
    //---------------------------------GETTER & SETTER---------------------------------------------------

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

    public BioPlant getPlantToShow() {
        return plantToShow;
    }

    public void setPlantToShow(BioPlant plantToShow) {
        this.plantToShow = plantToShow;
    }
    
}
