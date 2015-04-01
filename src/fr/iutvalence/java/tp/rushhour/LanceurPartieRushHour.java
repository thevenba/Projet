package fr.iutvalence.java.tp.rushhour;

/**
 * Lance une partie de Rush Hour.
 *
 * @author TODO
 * @version 1.0.0
 */
public class LanceurPartieRushHour {

    /**
     * Le point d'entre de l'application.
     *
     * @param args non utilise
     */
    public static void main(String[] args) {
        Plateau plateau = new Niveau1();
        System.out.println(plateau);
    }
}
