/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pdc_assignment_2;

import java.util.Random;
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
    private Monster m;
    private Player p;
    private Character c;

    public GameModelTest() {
        int HpMulti;
        int DmgMulti;
        int LuckMulti;

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
     * Test of checkName method, of class GameModel.
     */
    @Test
    public void testCheckName() {
        System.out.println("checkName");
        String username = "a";
        String password = "a";
        GameModel g = new GameModel();
        g.checkName(username, password);
        //works         
    }

    @Test
    public void testAttack() {
        System.out.println("attack");
        int dmg = 1;
        int luck = 1;
        int luckMulti = 0;
        int expResult = 1;
        Random rand = new Random();
        GameModel instance = new GameModel();

        expResult = dmg + (luck * luckMulti);

        int result = instance.attack(dmg, luck, luckMulti);

        assertEquals(expResult, result);
    }

    @Test
    public void testAddStatPoints() {
        System.out.println("addStatPoints");
        int points = 0;
        GameModel instance = new GameModel();
        instance.addStatPoints(points);
    }

}
