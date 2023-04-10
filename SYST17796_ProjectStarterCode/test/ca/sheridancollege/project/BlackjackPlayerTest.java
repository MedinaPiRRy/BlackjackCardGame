/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

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
 */
public class BlackjackPlayerTest {
    
    public BlackjackPlayerTest() {
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
     * Test of hit method, of class BlackjackPlayer.
     */
    @Test
    public void testHit() {
        System.out.println("Can player hit? ");
        BlackjackDeck deck = new BlackjackDeck();
        BlackjackPlayer instance = new BlackjackPlayer("Test Player");
        
        //Player hand
        Hand playerHand = instance.getHand();
        List<Card> expectedCards = new ArrayList();
        
        //Player should have a card after choose hit option.
        int expectedNumOfCard = 1;
        instance.hit(deck);
        
       expectedCards = playerHand.getCards();
       
       if(expectedCards.size() == expectedNumOfCard){
           //if player recieve one card from the deck
           System.out.println("Player can hit. Test passed");
       }else{
           fail("Player cannot hit. They didn't recieve a card.");
       }
       
        
    }

    /**
     * Test of getHandValueBoundary method with less than 21 , of class BlackjackPlayer.
     */
    @Test
    public void testGetHandValueBad() {
        System.out.println("Can player see her/his hand value?");
        BlackjackPlayer instance = new BlackjackPlayer("Test Player");
        
        //Generating test hand's cards manually
        Card c1 = new Card(Suit.CLUBS, Value.ACE);
        Card c2 = new Card(Suit.DIAMONDS, Value.TWO);
        Card c3 = new Card(Suit.HEARTS, Value.FOUR);
        
        //filling player's hand with generated particular cards.
        instance.getHand().addCard(c1);
        instance.getHand().addCard(c2);
        instance.getHand().addCard(c3);
        
        //expected hand value for player hand
        int expResult = 17;
        
        //Calculate hand value form the method.
        int result = instance.getHandValue();
        assertEquals(expResult, result);
        
        if(result ==expResult){
            System.out.println("Player can see his/her hands value(17) calculated and saw correctly.");
        }else{
          fail("Player cannot see his/her hand value(17).");
        }
    }
        
        /**
        * Test of getHandValue method with total 21 value, of class BlackjackPlayer.
        */
        @Test
        public void testGetHandValueBoundary() {
        System.out.println("Can player see her/his hand value?");
        BlackjackPlayer player = new BlackjackPlayer("Test Player");
        
        //Generating test hand's cards manually
        Card c1 = new Card(Suit.CLUBS, Value.ACE);
        Card c2 = new Card(Suit.DIAMONDS, Value.SIX);
        Card c3 = new Card(Suit.HEARTS, Value.FOUR);
        
        //filling player's hand with generated particular cards.
        player.getHand().addCard(c1);
        player.getHand().addCard(c2);
        player.getHand().addCard(c3);
        
        //expected hand value for player hand
        int expectedResult = 21;
        
        //Calculate hand value form the method.
        int resultBoundary = player.getHandValue();
        assertEquals(expectedResult, resultBoundary);
        
        if(resultBoundary ==expectedResult){
            System.out.println("Player can see his/her hand value(21) calculated and saw correctly.");
        }else{
          fail("Player cannot see his/her hand value(21).");
        }
     
    }
         /**
        * Test of getHandValue method with total 22 value, of class BlackjackPlayer.
        */
        @Test
        public void testGetHandValueGood() {
        System.out.println("Can player see her/his hand value?");
        BlackjackPlayer player = new BlackjackPlayer("Test Player");
        
        //Generating test hand's cards manually
        Card c1 = new Card(Suit.CLUBS, Value.TWO);
        Card c2 = new Card(Suit.DIAMONDS, Value.TEN);
        Card c3 = new Card(Suit.HEARTS, Value.QUEEN);
        
        //filling player's hand with generated particular cards.
        player.getHand().addCard(c1);
        player.getHand().addCard(c2);
        player.getHand().addCard(c3);
        
        //expected hand value for player hand
        int expectedResult = 22;
        
        //Calculate hand value form the method.
        int resultBoundary = player.getHandValue();
        assertEquals(expectedResult, resultBoundary);
        
        if(resultBoundary ==expectedResult){
            System.out.println("Player can see his/her hand value(22) calculated and saw correctly.");
        }else{
          fail("Player cannot see his/her hand value(22).");
        }
     
    }
        
    
    }
