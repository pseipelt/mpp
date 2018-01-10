package de.myplantparadise.mpp.MPPBeans;

import de.myplantparadise.mpp.DataStorage.Plant;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pst2
 */
public class DictionaryBeanTest {
    
    public DictionaryBeanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of init method, of class DictionaryBean.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        DictionaryBean instance = new DictionaryBean();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of completeText method, of class DictionaryBean.
     */
    @Test
    public void testCompleteText() {
        System.out.println("completeText");
        String query = "";
        DictionaryBean instance = new DictionaryBean();
        List<String> expResult = null;
        List<String> result = instance.completeText(query);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadPlantFromInput method, of class DictionaryBean.
     */
    @Test
    public void testLoadPlantFromInput() {
        System.out.println("loadPlantFromInput");
        DictionaryBean instance = new DictionaryBean();
        String expResult = "";
        String result = instance.loadPlantFromInput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadPlantFromMenu method, of class DictionaryBean.
     */
    @Test
    public void testLoadPlantFromMenu() {
        System.out.println("loadPlantFromMenu");
        String plant = "";
        DictionaryBean instance = new DictionaryBean();
        instance.loadPlantFromMenu(plant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListOfAllPlantNames method, of class DictionaryBean.
     */
    @Test
    public void testGetListOfAllPlantNames() {
        System.out.println("getListOfAllPlantNames");
        DictionaryBean instance = new DictionaryBean();
        List<String> expResult = null;
        List<String> result = instance.getListOfAllPlantNames();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListOfAllPlantNames method, of class DictionaryBean.
     */
    @Test
    public void testSetListOfAllPlantNames() {
        System.out.println("setListOfAllPlantNames");
        List<String> listOfAllPlantNames = null;
        DictionaryBean instance = new DictionaryBean();
        instance.setListOfAllPlantNames(listOfAllPlantNames);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedPlant method, of class DictionaryBean.
     */
    @Test
    public void testGetSelectedPlant() {
        System.out.println("getSelectedPlant");
        DictionaryBean instance = new DictionaryBean();
        String expResult = "";
        String result = instance.getSelectedPlant();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedPlant method, of class DictionaryBean.
     */
    @Test
    public void testSetSelectedPlant() {
        System.out.println("setSelectedPlant");
        String selectedPlant = "";
        DictionaryBean instance = new DictionaryBean();
        instance.setSelectedPlant(selectedPlant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlantToShow method, of class DictionaryBean.
     */
    @Test
    public void testGetPlantToShow() {
        System.out.println("getPlantToShow");
        DictionaryBean instance = new DictionaryBean();
        Plant expResult = null;
        Plant result = instance.getPlantToShow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlantToShow method, of class DictionaryBean.
     */
    @Test
    public void testSetPlantToShow() {
        System.out.println("setPlantToShow");
        Plant plantToShow = null;
        DictionaryBean instance = new DictionaryBean();
        instance.setPlantToShow(plantToShow);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
