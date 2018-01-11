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
    private List<PlantWithAmount> plantListAmount;
    
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
        
        this.plantListAmount = new ArrayList();
        plantListAmount.add(new PlantWithAmount(this.bohne, 2));
        plantListAmount.add(new PlantWithAmount(this.brokkoli, 4));
        plantListAmount.add(new PlantWithAmount(this.gurke, 3));
        plantListAmount.add(new PlantWithAmount(this.tomate, 1));
    }
    
    /**
     * Test of sortByGoodNeighbor method, of class SortUtil.
     */
    @Test
    public void testSortByGoodNeighbor() {
        System.out.println("sortByGoodNeighbor");
        this.plantList = SortUtil.sortByGoodNeighbor(this.plantList);
        Assert.assertEquals(this.gurke.getName(), plantList.get(0).getPlant().getName());
        Assert.assertEquals(this.bohne.getName(), plantList.get(1).getPlant().getName());
        Assert.assertEquals(this.brokkoli.getName(), plantList.get(2).getPlant().getName());
        Assert.assertEquals(this.tomate.getName(), plantList.get(3).getPlant().getName());
    }

    /**
     * Test of sortByBadNeighbor method, of class SortUtil.
     */
    @Test
    public void testSortByBadNeighbor() {
        System.out.println("sortByBadNeighbor");
        this.plantList = SortUtil.sortByBadNeighbor(this.plantList);
        Assert.assertEquals(this.gurke.getName(), plantList.get(0).getPlant().getName());
        Assert.assertEquals(this.bohne.getName(), plantList.get(1).getPlant().getName());
        Assert.assertEquals(this.brokkoli.getName(), plantList.get(2).getPlant().getName());
        Assert.assertEquals(this.tomate.getName(), plantList.get(3).getPlant().getName());
    }
    
    @Test
    public void testSortByAmount() {
        System.out.println("sortByAmount");
        this.plantListAmount = SortUtil.sortByAmount(this.plantListAmount);
        Assert.assertEquals(this.brokkoli.getName(), plantListAmount.get(0).getPlant().getName());
        Assert.assertEquals(this.gurke.getName(), plantListAmount.get(1).getPlant().getName());
        Assert.assertEquals(this.bohne.getName(), plantListAmount.get(2).getPlant().getName());
        Assert.assertEquals(this.tomate.getName(), plantListAmount.get(3).getPlant().getName());
    }
    
}
