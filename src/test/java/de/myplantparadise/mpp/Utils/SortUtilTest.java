package de.myplantparadise.mpp.Utils;

import de.myplantparadise.mpp.DataStorage.Plant;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

/**
 *
 * @author pst2
 */
public class SortUtilTest {
    
    private Plant bohne, brokkoli, gurke, tomate;
    private List<PlantWithNeighborStats> plantList;
    
    @Before
    public void setupClass() {
        this.bohne = new Plant().setName("Bohne");
        this.brokkoli = new Plant().setName("Brokkoli");
        this.gurke = new Plant().setName("Gurke");
        this.tomate = new Plant().setName("Tomate");
        
        this.plantList = new ArrayList();
        
        plantList.add(new PlantWithNeighborStats(this.bohne, 2, 2));
        plantList.add(new PlantWithNeighborStats(this.brokkoli, 2, 2));
        plantList.add(new PlantWithNeighborStats(this.gurke, 3, 3));
        plantList.add(new PlantWithNeighborStats(this.tomate, 1, 1));
    }
    
    /**
     * Test of sortByGoodNeighbor method, of class SortUtil.
     */
    @Test
    public void testSortByGoodNeighbor() {
        System.out.println("sortByGoodNeighbor");
        this.plantList = SortUtil.sortByGoodNeighbor(this.plantList);
        Assert.assertEquals(plantList.get(0).getPlant().getName(), this.gurke.getName());
        Assert.assertEquals(plantList.get(1).getPlant().getName(), this.bohne.getName());
        Assert.assertEquals(plantList.get(2).getPlant().getName(), this.brokkoli.getName());
        Assert.assertEquals(plantList.get(3).getPlant().getName(), this.tomate.getName());
    }

    /**
     * Test of sortByBadNeighbor method, of class SortUtil.
     */
    @Test
    public void testSortByBadNeighbor() {
        System.out.println("sortByBadNeighbor");
        this.plantList = SortUtil.sortByBadNeighbor(this.plantList);
        Assert.assertEquals(plantList.get(0).getPlant().getName(), this.gurke.getName());
        Assert.assertEquals(plantList.get(1).getPlant().getName(), this.bohne.getName());
        Assert.assertEquals(plantList.get(2).getPlant().getName(), this.brokkoli.getName());
        Assert.assertEquals(plantList.get(3).getPlant().getName(), this.tomate.getName());
    }
    
}
