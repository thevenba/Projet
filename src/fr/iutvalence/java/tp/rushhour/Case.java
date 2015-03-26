/**
 * 
 */
package fr.iutvalence.java.tp.rushhour;

/**
 * Classe representant une case d'un plateau
 * 
 * @author duboitho
 *
 */
public class Case
{
	/**
	 * Une case a l'etat vide
	 */
	public final static boolean VIDE = true;
	
	/**
	 * Une case a l'etat vide
	 */
	public final static boolean PLEINE = false;
	
	/**
	 * L'etat de la case VIDE ou PLEINE
	 */
	private boolean estVide;

	/**
	 * Construire une nouvelle case a l'etat donne
	 * 
	 * @param estVide l'etat voulu
	 */
	public Case(boolean estVide)
	{
		this.estVide = estVide;
	}

	/**
	 * Construire une nouvelle case vide
	 */
	public Case()
	{
		this.estVide = VIDE;
	}

	/**
	 * @return estVide l'etat de la case
	 */
	public boolean obtenirEstVide()
	{
		return this.estVide;
	}


	public String toString()
	{
		if (this.estVide == VIDE)
			return "|_|";
		return "|X|";
	}
	
	
	
}
