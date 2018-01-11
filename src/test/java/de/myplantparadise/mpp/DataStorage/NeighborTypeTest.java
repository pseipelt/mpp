package de.myplantparadise.mpp.DataStorage;

import java.util.ArrayList;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Pascal
 */
public class NeighborTypeTest {

    private PlantStorage storage;
    
    @Test
    @Ignore
    public void testEquality() {
       List<String> plants_in_DB = storage.getAllPlantNames();
       List<String[]> testPlants = new ArrayList<>();
       for(String plant : plants_in_DB) {
            //testPlants.add(DataStorage.PlantStorage.getPlannerInfoFrom(plant));
       }
       for(String[] plant : testPlants) {
           String[] gn = plant[1].split(", ");
           String[] bn = plant[2].split(", ");
           //Check good Neighbors
           for(String type : gn) {
               for(String[] plantToCompare : testPlants) {
                   if(type.equals(plantToCompare[0])) {
                       if(!plantToCompare[1].contains(plant[0])) {System.out.println("Add " + plant[0] + " to " + type + " as Good Neighbors!");}
                   }
               }
           }
           //Check bad Neighbors
           for(String type : bn) {
               for(String[] plantToCompare : testPlants) {
                   if(type.equals(plantToCompare[0])) {
                       if(!plantToCompare[2].contains(plant[0])) {System.out.println("Add " + plant[0] + " to " + type + " as Bad Neighbors!");}
                   }
               }
           }
       }
    }    
    
    @Test
    @Ignore
    public void testNoPlantInGoodAndBad() {
       List<String> plants_in_DB = storage.getAllPlantNames();
       System.out.println(plants_in_DB.toString());
       List<String[]> testPlants = new ArrayList<>();
       for(String plant : plants_in_DB) {
            //testPlants.add(DataStorage.PlantStorage.getPlannerInfoFrom(plant));
       }
       for(String[] plant : testPlants) {
           String[] gn = plant[1].split(", ");
           //Check good Neighbors
           for(String type : gn) {
               if(plant[2].contains(type)) {System.out.println("Check " + plant[0] + ": " + type + " is noted as Good and Bad Neighbor!");}
           }
       }
    }    
}
