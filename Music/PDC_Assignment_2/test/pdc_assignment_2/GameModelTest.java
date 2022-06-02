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
public class GameModelTest {
    private GameData data; 
    private GameModel g; 
    private GameDatabase d;
    
    
    public GameModelTest() {
        
        
        
        
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        g.DmgMulti =1;
        g.username = "a";
        g.password = "a";
        g.checkName(g.username, g.password);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkName method, of class GameModel.
     */
    @Test
    public void testCheckName() {
        System.out.println("checkName");
        String username = "";
        String password = "";
        GameModel g = new GameModel();
        data.checkName(username, password);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of battle method, of class GameModel.
     */
    @Test
    public void testBattle() {
        System.out.println("battle");
        GameModel instance = new GameModel();
        boolean expResult = false;
        boolean result = instance.battle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of monsterLvlUp method, of class GameModel.
     */
    @Test
    public void testMonsterLvlUp() {
        System.out.println("monsterLvlUp");
        GameModel instance = new GameModel();
        instance.monsterLvlUp();
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of monsterReset method, of class GameModel.
     */
    @Test
    public void testMonsterReset() {
        System.out.println("monsterReset");
        GameModel instance = new GameModel();
        instance.monsterReset();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of playerReset method, of class GameModel.
     */
    @Test
    public void testPlayerReset() {
        System.out.println("playerReset");
        GameModel instance = new GameModel();
        instance.playerReset();
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of attack method, of class GameModel.
     */
    @Test
    public void testAttack() {
        System.out.println("attack");
        int dmg = 0;
        int luck = 0;
        int luckMulti = 0;
        GameModel instance = new GameModel();
        int expResult = 0;
        int result = instance.attack(dmg, luck, luckMulti);
        assertEquals(expResult, result);
 
    }

    /**
     * Test of addMultiPoints method, of class GameModel.
     */
    @Test
    public void testAddMultiPoints() {
        System.out.println("addMultiPoints");
        int points = 0;
        GameModel instance = new GameModel();
        instance.addMultiPoints(points);

    }

    /**
     * Test of addHpMulti method, of class GameModel.
     */
    @Test
    public void testAddHpMulti() {
        System.out.println("addHpMulti");
        int points = 0;
        GameModel instance = new GameModel();
        instance.addHpMulti(points);

    }

    /**
     * Test of addDmgMulti method, of class GameModel.
     */
    @Test
    public void testAddDmgMulti() {
        System.out.println("addDmgMulti");
        int points = 0;
        GameModel instance = new GameModel();
        instance.addDmgMulti(points);

    }

    /**
     * Test of addLuckMulti method, of class GameModel.
     */
    @Test
    public void testAddLuckMulti() {
        System.out.println("addLuckMulti");
        int points = 0;
        GameModel instance = new GameModel();
        instance.addLuckMulti(points);
      
    }

    /**
     * Test of addStatPoints method, of class GameModel.
     */
    @Test
    public void testAddStatPoints() {
        System.out.println("addStatPoints");
        int points = 0;
        GameModel instance = new GameModel();
        instance.addStatPoints(points);

    }

    /**
     * Test of addHp method, of class GameModel.
     */
    @Test
    public void testAddHp() {
        System.out.println("addHp");
        int points = 0;
        GameModel instance = new GameModel();
        instance.addHp(points);

    }

    /**
     * Test of addDmg method, of class GameModel.
     */
    @Test
    public void testAddDmg() {
        System.out.println("addDmg");
        int points = 0;
        GameModel instance = new GameModel();
        instance.addDmg(points);
  
    }

    /**
     * Test of addLuck method, of class GameModel.
     */
    @Test
    public void testAddLuck() {
        System.out.println("addLuck");
        int points = 0;
        GameModel instance = new GameModel();
        instance.addLuck(points);
      
    }

    /**
     * Test of getHpMulti method, of class GameModel.
     */
    @Test
    public void testGetHpMulti() {
        System.out.println("getHpMulti");
        GameModel instance = new GameModel();
        int expResult = 0;
        int result = instance.getHpMulti();
        assertEquals(expResult, result);

    }

    /**
     * Test of getDmgMulti method, of class GameModel.
     */
    @Test
    public void testGetDmgMulti() {
        System.out.println("getDmgMulti");
        GameModel instance = new GameModel();
        int expResult = 0;
        int result = instance.getDmgMulti();
        assertEquals(expResult, result);

    }

    /**
     * Test of getLuckMulti method, of class GameModel.
     */
    @Test
    public void testGetLuckMulti() {
        System.out.println("getLuckMulti");
        GameModel instance = new GameModel();
        int expResult = 0;
        int result = instance.getLuckMulti();
        assertEquals(expResult, result);
   
    }

    /**
     * Test of getRules method, of class GameModel.
     */
    @Test
    public void testGetRules() {
        System.out.println("getRules");
        GameModel instance = new GameModel();
        String expResult = "";
        String result = instance.getRules();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of save method, of class GameModel.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        GameModel instance = new GameModel();
        instance.save();
    }
    
}
