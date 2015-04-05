package fr.iutvalence.java.tp.rushhour;

/**
 * Represente un vehicule sur un plateau
 * 
 * @author thevenba
 * @version 1.0.0
 */
public class Vehicule 
{
	/** L'orientation horizontale */
	public static final boolean HORIZONTALE = true;
	/** L'orientation verticale */
	public static final boolean VERTICALE = false;
	/** L'orientation du vehicule (HORIZONTALE ou VERTICALE) */
	private final boolean orientation;
	/** La taille du vehiucle */
	private final int taille;
	/** La couleur du vehicule */
	private final Couleur couleur;
	/** Les positions du vehicule*/
	private Position[] positions;

	/**
	 * Construire un vehicule d'orientation, de taille, de couleur et de position de tete données 
	 * (la tete est a droite si l'orientation est horizontale, en bas si l'orientation est verticale)
	 * @param orientation l'orientation
	 * @param taille la taille
	 * @param couleur la couleur
	 * @param positionTete la position de tete
	 */
	public Vehicule(boolean orientation, int taille, Couleur couleur, Position positionTete)
	{
		this.orientation = orientation;
		this.taille = taille;
		this.couleur = couleur;
		this.positions = new Position[taille];
		this.positions[0] = positionTete;
		if (orientation == HORIZONTALE)
			for (int indicePos = 1; indicePos < taille; indicePos++)
				this.positions[indicePos] = new Position(this.positions[0].obtenirNumLigne(), this.positions[0].obtenirNumColonne()-indicePos);
		else
			for (int indicePos = 1; indicePos < taille; indicePos++)
				this.positions[indicePos] = new Position(this.positions[0].obtenirNumLigne()-indicePos, this.positions[0].obtenirNumColonne());
	}

	/**
	 * Obtenir la taille de la voiture
	 * @return la taille de la voiture
	 */
	public int obtenirTaille()
	{
		return this.taille;
	}

	/**
	 * Obtenir la position dans le tableau a un indice donne
	 * @param indice l'indice
	 * @return la position dans le tableau a l'indice donne
	 */
	public Position obtenirPositions(int indice)
	{
		return this.positions[indice];
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return this.couleur.toString();
	}
}
