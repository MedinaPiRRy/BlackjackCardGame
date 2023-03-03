/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author ecemgulec
 */
public class CardBJ extends Card {
    private Suit suit;
    private Value value;
    //default modifier for child classes

    public CardBJ(Suit suit, Value value){
    this.suit = suit;
    this.value = value;
    }

    /**
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }
    @Override
    public String toString() {
        
      String info= "Card: " + suit + " " + value;
        return info;
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
