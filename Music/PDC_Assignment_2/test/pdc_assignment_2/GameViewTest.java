/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pdc_assignment_2;

import java.awt.event.ActionListener;
import java.util.Observable;
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
public class GameViewTest {
    
    public GameViewTest() {
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


    @Test
    public void testIniComp() {
        System.out.println("iniComp");
        GameView instance = new GameView();
        instance.iniComp();

    }

  //Testing login screen
    @Test
    public void testLoginScreen() {
        System.out.println("loginScreen");
        GameView instance = new GameView();
        instance.loginScreen();
    }

//Tesint main Menu Screen...
    @Test
    public void testMainMenuScreen() {
        System.out.println("mainMenuScreen");
        GameView instance = new GameView();
        instance.mainMenuScreen();
    }

   
    @Test
    public void testRulesScreen() {
        System.out.println("rulesScreen");
        GameView instance = new GameView();
        instance.rulesScreen();
    }

    @Test
    public void testMultiplierScreen() {
        System.out.println("multiplierScreen");
        GameView instance = new GameView();
        instance.multiplierScreen();

    }

    @Test
    public void testStatPointsScreen() {
        System.out.println("statPointsScreen");
        GameView instance = new GameView();
        instance.statPointsScreen();

    }

    @Test
    public void testMultiplierPointsScreen() {
        System.out.println("multiplierPointsScreen");
        GameView instance = new GameView();
        instance.multiplierPointsScreen();
    }

   
    @Test
    public void testBattleScreen() {
        System.out.println("battleScreen");
        GameView instance = new GameView();
        instance.battleScreen();

    }
    @Test
    public void testGameOverScreen() {
        System.out.println("gameOverScreen");
        GameView instance = new GameView();
        instance.gameOverScreen();
    }


    //checking updates on the view of the specified GUI
    
    @Test
    public void testUpdateMultiplier() {
        System.out.println("updateMultiplier");
        int hp = 0;
        int dmg = 0;
        int luck = 0;
        GameView instance = new GameView();
        instance.updateMultiplier(hp, dmg, luck);
 
    }

    @Test
    public void testUpdateRules() {
        System.out.println("updateRules");
        String rules = "";
        GameView instance = new GameView();
        instance.updateRules(rules);

    }


    @Test
    public void testUpdateStatPoint() {
        System.out.println("updateStatPoint");
        int points = 1;
        int hp = 1;
        int dmg = 1;
        int luck = 1;
        GameView instance = new GameView();
        instance.updateStatPoint(points, hp, dmg, luck);
    }


    @Test
    public void testUpdateMultiPoint() {
        System.out.println("updateMultiPoint");
        int points = 1;
        int hp = 1;
        int dmg = 1;
        int luck = 1;
        GameView instance = new GameView();
        instance.updateMultiPoint(points, hp, dmg, luck);
    }

    @Test
    public void testUpdateBattle() {
        System.out.println("updateBattle");
        int playerHp = 1;
        int playerDmg = 1;
        int playerLuck = 1;
        int monsterHp = 1;
        int monsterDmg = 1;
        int monsterLuck = 1;
        int battleNumber = 1;
        GameView instance = new GameView();
        instance.updateBattle(playerHp, playerDmg, playerLuck, monsterHp, monsterDmg, monsterLuck, battleNumber);
    }

    @Test
    public void testAddActionListener() {
        System.out.println("addActionListener");
        ActionListener listener = null;
        GameView instance = new GameView();
        instance.addActionListener(listener);
    }

    
}
