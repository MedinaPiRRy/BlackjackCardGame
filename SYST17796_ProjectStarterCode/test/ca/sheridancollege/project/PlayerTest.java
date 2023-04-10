
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package SYST17796_ProjectStarterCode.test.ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ca.sheridancollege.project.BlackjackPlayer;
import ca.sheridancollege.project.Player;

import static org.junit.Assert.*;

/**
 *
 * @author ecemgulec
 * @editor MedinaPiRRy
 */
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetName() {
        System.out.println("Test for player can enter his/her name or not.");
        String name = "TestName";
        Player instance = new BlackjackPlayer("Test");
        instance.setName(name);
        if (instance.getName()==name){
        System.out.println("Test passed");
        }else {
        fail("Test failed");
        }
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Player instance = new BlackjackPlayer("TestPlayer");
        String expResult = "TestPlayer";
        String result = instance.getName();
      assertEquals(expResult, result);
       if(expResult==result){
       System.out.println("getName method test passed.");
       }else{
        fail("The test case is a prototype.");
        }
    }



    }

    
