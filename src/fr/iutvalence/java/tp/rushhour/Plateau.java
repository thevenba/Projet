package fr.iutvalence.java.tp.rushhour;

/**
 * Classe permettant de representer un plateau
 * 
 * @author duboitho
 *
 */
public abstract class Plateau
{
	/**
	 * Le nombre de colonnes d'un plateau soit 6
	 */
	public final static int NB_COL = 6;
	
	/**
	 * Le nombre de lignes d'un plateau soit 6
	 */
	public final static int NB_LIG = 6;
	
	/**
	 * Les cases du plateau
	 */
	protected Case[][] cases;
	
	/**
	 * Construire un nouveau plateau vide
	 */
	public Plateau()
	{
		this.cases = new Case[NB_LIG][NB_COL];
		for (int indiceL = 0; indiceL < NB_LIG; indiceL++)
			for (int indiceC = 0; indiceC < NB_COL; indiceC++)
				this.cases[indiceL][indiceC] = new Case(Case.VIDE);
		this.cases[2][5].modifierEstSortie(true);
	}
	
	/**
	 * Obtenir une representation en ASCII-art du plateau, ou chaque cas est représente par un symbole associé à son etat.
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String plateauAsciiArt = "";

		for (int indiceL = 0; indiceL < NB_LIG; indiceL++)
		{
			for (int indiceC = 0; indiceC < NB_COL; indiceC++)
				plateauAsciiArt += this.cases[indiceL][indiceC];
			plateauAsciiArt += "\n";
		}

		return plateauAsciiArt;
	}
	
	
}
