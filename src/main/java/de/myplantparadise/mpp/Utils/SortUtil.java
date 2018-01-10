package de.myplantparadise.mpp.Utils;

import java.util.List;

/**
 *
 * @author pst2
 */
public class SortUtil {
    public static List<PlantWithNeighborStats> sortByGoodNeighbor(List<PlantWithNeighborStats> plantList) {
        plantList.sort((object1, object2) -> object1.getPlant().getName().compareTo(object2.getPlant().getName()));
        plantList.sort((object1, object2) -> object1.getGoodNrToCompare().compareTo(object2.getGoodNrToCompare()));
        return plantList;
    }
    
    public static List<PlantWithNeighborStats> sortByBadNeighbor(List<PlantWithNeighborStats> plantList) {
        plantList.sort((object1, object2) -> object1.getPlant().getName().compareTo(object2.getPlant().getName()));
        plantList.sort((object1, object2) -> object1.getBadNrToCompare().compareTo(object2.getBadNrToCompare()));
        return plantList;
    }
}
