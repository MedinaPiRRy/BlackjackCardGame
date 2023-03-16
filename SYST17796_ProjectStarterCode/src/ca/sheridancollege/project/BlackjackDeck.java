/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;



/**
 *
 * @author ecemgulec
 * @author danielmedina 
 */
import java.util.Collections;

public class BlackjackDeck extends GroupOfCards {
    public BlackjackDeck() {
        super();
        for (Suit suit : Suit.values()) {
            for (Value value : Value.values()) {
                this.addCard(new Card(suit, value));
            }
        }
        shuffle();
    }

    public Card drawCard() {
        return removeCard(0);
    }

    public void shuffle() {
        Collections.shuffle(this.getCards());
    }
}
