/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ecemgulec
 * @author danielmedina 
 */
public class BlackjackDeck extends GroupOfCards {

    private final int SIZE_OF_DECK = 52;
    private ArrayList<Card> cards;

    public BlackjackDeck(int size) {
        super(size);
        for (Suit suit : Suit.values()) {
            cards = new ArrayList();
            for (Value value : Value.values()) {
                CardBJ card = new CardBJ(suit, value);
                cards.add(card);
            }
        }
    }

    /**
     * @return the deck
     */
    @Override
    public ArrayList<Card> getCards() {
        return cards;
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }
    

}
