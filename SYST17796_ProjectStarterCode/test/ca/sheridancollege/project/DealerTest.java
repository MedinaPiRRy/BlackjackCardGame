/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package SYST17796_ProjectStarterCode.test.ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ecemgulec
 * @editor MedinaPiRRy
 */
public class DealerTest {
    
    public DealerTest() {
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
     * Test of dealInitialCards method, of class Dealer.
     */
    @Test
    public void testDealInitialCards() {
        System.out.println("Player has 2 cards at the beginning of the game.");
        BlackjackPlayer player = new BlackjackPlayer("Test Player");
        BlackjackDeck deck = new BlackjackDeck();
        Dealer instance = new Dealer();
        instance.dealInitialCards(player, deck);
        Hand playerHand =player.getHand();
        List<Card> cardlist = new ArrayList<>();
               cardlist = playerHand.getCards();
        if(cardlist.size()==2){
            System.out.println("Player had 2 cards.");
        }else{
            fail("Test failed.");
        }
    }
    
}