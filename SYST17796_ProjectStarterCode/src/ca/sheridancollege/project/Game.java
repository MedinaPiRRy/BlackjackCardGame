
package ca.sheridancollege.project;

/**
 *
 * @author MedinaPiRRy
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

