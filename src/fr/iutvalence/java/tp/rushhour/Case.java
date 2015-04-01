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
	 * la case est la sortie ou non
	 */
	private boolean estSortie;
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
		this.estSortie = false;
	}

	/**
	 * Construire une nouvelle case à l'etat donne
	 * 
	 * @param estVide l'etat voulu
	 * @param estSortie si la case est la sortie
	 */
	public Case(boolean estVide, boolean estSortie)
	{
		this.estVide = estVide;
		this.estSortie = estSortie;
	}

	/**
	 * @return estVide l'etat de la case
	 */
	public boolean obtenirEstVide()
	{
		return this.estVide;
	}
	
	/**
	 * @param estSortie l'etat estSortie de la case a modifier
	 */
	public void modifierEstSortie(boolean estSortie)
	{
		this.estSortie = estSortie;
	}

	/**
	 * @param estVide l'etat estVide de la case a modifier
	 */
	public void modifierEstVide(boolean estVide)
	{
		this.estVide = estVide;
	}

	public String toString()
	{
		if (this.estVide == VIDE)
		{
			if (this.estSortie == true)
				return "|__";
			return "|_|";
		}
		else
			if (this.estSortie == true)
				return "|X_";
		return "|X|";
	}
	
	
	
}
