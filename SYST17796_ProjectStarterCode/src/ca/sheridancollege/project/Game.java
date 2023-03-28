
package ca.sheridancollege.project;

/**
 *
 * @author MedinaPiRRy
 */
public abstract class Game {

    // play void
    public abstract void play();

    // start game void
    protected void start() {
        System.out.println("Starting the game...");
    }

    // endRound - for when player has exceed the 21 value with his hand
    protected void endRound(String playerBusted) {
        System.out.println(playerBusted + " busted. Ending the round.");
    }

    // end void for finilazing the game
    protected void end() {
        System.out.println("Ending the game.");
    }
}

