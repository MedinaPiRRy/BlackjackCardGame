/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author ecemgulec
 */
public class Hand extends GroupOfCards {
    private ArrayList<Card> cards;
    private int size;
    private Card firstCard;
    private Card secondCard;
    private int handValue;
    
   public Hand(int size, ArrayList<Card> cards){
       super(size);
       this.cards=cards;
   }

    /**
     * @return the cards
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    /**
     * @param cards the cards to set
     */
    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the firstCard
     */
    public Card getFirstCard() {
        return firstCard;
    }

    /**
     * @param firstCard the firstCard to set
     */
    public void setFirstCard(Card firstCard) {
        this.firstCard = firstCard;
    }

    /**
     * @return the secondCard
     */
    public Card getSecondCard() {
        return secondCard;
    }

    /**
     * @param secondCard the secondCard to set
     */
    public void setSecondCard(Card secondCard) {
        this.secondCard = secondCard;
    }

    /**
     * @return the handValue
     */
    public int getHandValue() {
        return handValue;
    }
   
}
