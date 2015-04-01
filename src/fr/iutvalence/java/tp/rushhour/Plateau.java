/* TODO JAVADOC. */
package fr.iutvalence.java.tp.rushhour;

/**
 * Plateau de jeu.
 *
 * @author duboitho
 * @version 1.0.0
 */
public abstract class Plateau {
    /** Nombre de colonnes. */
    public static final int NB_COL = 6;
    /** Nombre de lignes. */
    public static final int NB_LIG = 6;
    /** Plateau. */
    protected Case[][] cases;

    /** Construire un nouveau plateau vide. */
    public Plateau() {
        cases = new Case[NB_LIG][NB_COL];
        for (int indiceL = 0; indiceL < NB_LIG; indiceL++) {
            for (int indiceC = 0; indiceC < NB_COL; indiceC++) { cases[indiceL][indiceC] = new Case(Case.VIDE); }
        }
        cases[2][5].modifierEstSortie(true);
    }

    @Override
    public String toString() {
        /* TODO String vs StringBuffer vs StringBuilder. */
        String plateauAsciiArt = "";

        for (int indiceL = 0; indiceL < NB_LIG; indiceL++) {
            for (int indiceC = 0; indiceC < NB_COL; indiceC++) { plateauAsciiArt += cases[indiceL][indiceC]; }
            plateauAsciiArt += "\n";
        }

        return plateauAsciiArt;
    }
}
