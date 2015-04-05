package fr.iutvalence.java.tp.rushhour;

/**
 * Enumeration des couleurs dont peuvent etre fait les vehicules
 * 
 * @author thevenba
 * @version 1.0.0
 */
public enum Couleur
{
	/**
	 * La couleur rouge
	 */
	ROUGE,
	
	/**
	 * La couleur bleu clair
	 */
	BLEU_CLAIR,
	
	/**
	 * La couleur bleu fonce
	 */
	BLEU_FONCE,
	
	/**
	 * La couleur jaune
	 */
	JAUNE,
	
	/**
	 * La couleur orange
	 */
	ORANGE,
	
	/**
	 * La couleur vert clair
	 */
	VERT_CLAIR,
	
	/**
	 * La couleur vert fonce
	 */
	VERT_FONCE,
	
	/**
	 * La couleur violet
	 */
	VIOLET;
	
	/**
	 * @see java.lang.Enum#toString()
	 */
	public String toString()
	{
		switch (this)
		{
			case ROUGE: 
				return "R ";
			case BLEU_CLAIR: 
				return "bc";
			case BLEU_FONCE:
				return "bf";
			case JAUNE:
				return "j ";
			case ORANGE:
				return "o ";
			case VERT_CLAIR:
				return "vc";
			case VERT_FONCE:
				return "vf";
			case VIOLET:
				return "v ";
			default:
				return null;
		}
	}
}
