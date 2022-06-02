/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pdc_assignment_2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lukey
 */
public class GameDatabaseTest {
    private GameData d;
    private GameModel m;
    public GameDatabaseTest() {
   
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
     * Test of dbsetup method, of class GameDatabase.
     */
    @Test
    public void testDbsetup() {
        System.out.println("dbsetup");
        GameDatabase instance = new GameDatabase();
        instance.dbsetup();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of checkName method, of class GameDatabase.
     */
    @Test
    public void testCheckName() {
        System.out.println("checkName");
        String username = "";
        String password = "";
        GameDatabase instance = new GameDatabase();
        GameData expResult = null;
        GameData result = instance.checkName(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of saveDB method, of class GameDatabase.
     */
    @Test
    public void testSaveDB() {
        System.out.println("saveDB");
        int hpMulti = 0;
        int dmgMulti = 0;
        int luckMulti = 0;
        String username = "";
        int multiPoints = 0;
        GameDatabase instance = new GameDatabase();
        instance.saveDB(hpMulti, dmgMulti, luckMulti, username, multiPoints);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
