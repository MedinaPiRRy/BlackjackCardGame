/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackgame;

/**
 *
 * @author ecemgulec
 */
public class Card {
    private Value value;
    private Suit suit;

    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }
    
    /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }

    /**
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }
    
    
}
