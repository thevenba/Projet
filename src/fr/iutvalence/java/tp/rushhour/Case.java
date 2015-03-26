/**
 * 
 */
package fr.iutvalence.java.tp.rushhour;

/**
 * @author duboitho
 *
 */
public class Case
{
	public final static boolean VIDE = true;
	public final static boolean PLEINE = false;
	
	private boolean estVide;

	/**
	 * @param estVide
	 */
	public Case(boolean estVide)
	{
		this.estVide = estVide;
	}

	/**
	 * 
	 */
	public Case()
	{
		this.estVide = VIDE;
	}
	
	
}
