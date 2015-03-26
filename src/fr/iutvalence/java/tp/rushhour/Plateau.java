package fr.iutvalence.java.tp.rushhour;

/**
 * Classe permettant de representer un plateau
 * 
 * @author duboitho
 *
 */
public class Plateau
{
	/**
	 * Nombre de colonnes d'un plateau soit 6
	 */
	public final static int NB_COL = 6;
	/**
	 * Nombre de lignes d'un plateau soit 6
	 */
	public final static int NB_LIG = 6;
	
	/**
	 * Les cases d'un plateau
	 */
	private Case[][] plateau;
	/**
	 */
	public Plateau()
	{
		this.plateau = new Case[NB_LIG][NB_COL];
	}
	
	
	
	
}
