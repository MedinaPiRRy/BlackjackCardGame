/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author ecemgulec
 */
public class Dealer extends Player {
private Hand hand;

    public Dealer(){
        super("Dealer");
    
    }
    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the hand
     */
    public Hand getHand() {
        return hand;
    }

    /**
     * @param hand the hand to set
     */
    public void setHand(Hand hand) {
        this.hand = hand;
    }
    
      public void hit(boolean isHit) {

    }

    public void stand(boolean isStand) {

    }

    public boolean hasBlackjack() {
        boolean blackjack = true;
        return blackjack;
    }
    
}
