package fr.iutvalence.java.tp.rushhour;

/**
 * Launch a game.
 *
 * @author duboitho
 * @version 1.1.0
 */
public class GameLauncher {
    /** Private and empty constructor. */
    private GameLauncher() { /* NOTHING. */}

    /**
     * Where the application starts.
     *
     * @param args not used
     */
    public static void main(final String... args) {
        System.out.println(new Level1());
    }
}
