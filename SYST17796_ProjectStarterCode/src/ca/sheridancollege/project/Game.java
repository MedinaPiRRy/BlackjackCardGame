/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Game {

    public abstract void play();

    protected void start() {
        System.out.println("Starting the game...");
    }

    protected void endRound(String playerBusted) {
        System.out.println(playerBusted + " busted. Ending the round.");
    }

    protected void end() {
        System.out.println("Ending the game.");
    }
}

