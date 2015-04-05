package fr.iutvalence.java.tp.rushhour;

/**
 * Represente une position, a l'intersection, d'une ligne et d'une colonne
 * 
 * @author thevenba
 * @version 1.0.0
 */
public class Position
{
	/** Le numero de ligne */
	private final int numLigne;
	/** Le numero de colonne */
	private final int numColonne;
	
	/**
	 * Construit une nouvelle position, a l'intersection ligne/colonne donnee
	 * @param numLigne le numero de ligne
	 * @param numColonne le numero de colonne
	 */
	public Position(int numLigne, int numColonne)
	{
		this.numLigne = numLigne;
		this.numColonne = numColonne;
	}

	/**
	 * Obtenir le numero de ligne
	 * @return le numero de ligne
	 */
	public int obtenirNumLigne()
	{
		return this.numLigne;
	}

	/**
	 * Obtenir le numero de ligne
	 * @return le numero de ligne
	 */
	public int obtenirNumColonne()
	{
		return this.numColonne;
	}
}
