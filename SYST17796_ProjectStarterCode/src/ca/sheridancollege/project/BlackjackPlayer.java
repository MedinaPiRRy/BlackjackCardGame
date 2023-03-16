/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author ecemgulec
 */
public class BlackjackPlayer extends Player {
    public BlackjackPlayer(String name) {
        super(name);
    }

    public void hit(BlackjackDeck deck) {
        getHand().addCard(deck.drawCard());
    }

    public int getHandValue() {
        int handValue = 0;
        int aces = 0;
        for (Card card : getHand().getCards()) {
            handValue += card.getValue().getValue();
            if (card.getValue() == Value.ACE) {
                aces++;
            }
        }

        while (handValue > 21 && aces > 0) {
            handValue -= 10;
            aces--;
        }
        return handValue;
    }
}
