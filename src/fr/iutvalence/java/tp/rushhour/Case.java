package fr.iutvalence.java.tp.rushhour;

/**
 * Case du plateau.
 *
 * @author duboitho
 * @version 1.0.0
 * @see Plateau
 */
public class Case {
    /** Case a l'etat vide. */
    public static final boolean VIDE = true;
    /** Case a l'etat plein. */
    public static final boolean PLEINE = false;
    /** La case est la sortie ou non. */
    private boolean estSortie;
    /** L'etat de la case VIDE ou PLEINE. */
    private boolean estVide;

    /** Construire une nouvelle case a l'etat donne.
     *
     * @param estVide l'etat voulu
     */
    public Case(boolean estVide) {
        this(estVide, false);
    }

    /**
     * Construire une nouvelle case (éventuelle de sortie) à l'etat donne.
     *
     * @param estVide   l'etat voulu
     * @param estSortie si la case est la sortie
     */
    public Case(boolean estVide, boolean estSortie) {
        this.estVide = estVide;
        this.estSortie = estSortie;
    }

    /** L'etat de la case. */
    public boolean obtenirEstVide() {
        return estVide;
    }

    /* TODO Une case peut devenir une sortie ? */
    /**
     * @param estSortie l'etat estSortie de la case a modifier
     */
    public void modifierEstSortie(boolean estSortie) {
        this.estSortie = estSortie;
    }

    /**
     * @param estVide l'etat estVide de la case a modifier
     */
    public void modifierEstVide(boolean estVide) {
        this.estVide = estVide;
    }

    public String toString() {
        if (estVide == VIDE) {
            if (estSortie == true) { return "|__"; }
            return "|_|";
        }
        else { if (estSortie == true) { return "|X_"; } }
        return "|X|";
    }


}
