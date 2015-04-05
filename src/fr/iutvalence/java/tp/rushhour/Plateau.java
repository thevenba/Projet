package fr.iutvalence.java.tp.rushhour;

/**
 * Plateau de jeu.
 *
 * @author duboitho
 * @version 1.1.0
 */
public abstract class Plateau {
    /** Nombre de colonnes. */
    public static final int NB_COL = 6;
    /** Nombre de lignes. */
    public static final int NB_LIG = 6;
    /** Plateau. */
    protected Case[][] cases;
    /** Les vehicules du plateau */
    protected Vehicule[] vehicules;
    /** Le nombre de vehicules du plateau */
    protected int nbVehicules;

    /** Construire un nouveau plateau. */
    public Plateau() {
        this.cases = new Case[NB_LIG][NB_COL];
        for (int indiceL = 0; indiceL < NB_LIG; indiceL++) 
            for (int indiceC = 0; indiceC < NB_COL; indiceC++)
            	this.cases[indiceL][indiceC] = new Case();
        this.creerVehicules();
        for (int indiceVehicule = 0; indiceVehicule < this.nbVehicules; indiceVehicule++)
        {
        	for (int indiceTaille = 0; indiceTaille < this.vehicules[indiceVehicule].obtenirTaille(); indiceTaille++)
            	this.ajouterVehicule(this.vehicules[indiceVehicule].obtenirPositions(indiceTaille), this.vehicules[indiceVehicule]);
        }
    }
    
    /**
     * Construire les vehicules du plateau
     */
    public abstract void creerVehicules();

	/**
     * Obtenir la case du plateau a une position donnee
     * @param position la position
     * @return la case du plateau a la position donnee
     */
    public Case obtenirCase(Position position)
    {
    	return this.cases[position.obtenirNumLigne()][position.obtenirNumColonne()];
    }
    
    /**
     * Pose un vehicule donne sur la case a une position donnee
     * @param position la position
     * @param vehicule le vehicule
     */
    public void ajouterVehicule(Position position, Vehicule vehicule)
    {
    	this.obtenirCase(position).poserVehicule(vehicule);
    }
 
    /**
     * @see java.lang.Object#toString()
     */
    public String toString() {
        /* TODO String vs StringBuffer vs StringBuilder. */
        String plateauAsciiArt = "------------------------\n";

        for (int indiceL = 0; indiceL < NB_LIG; indiceL++) 
        {
            for (int indiceC = 0; indiceC < NB_COL; indiceC++) 
            	plateauAsciiArt += this.obtenirCase(new Position(indiceL,indiceC));
            plateauAsciiArt += "\n------------------------\n";
        }
        return plateauAsciiArt;
    }
}
