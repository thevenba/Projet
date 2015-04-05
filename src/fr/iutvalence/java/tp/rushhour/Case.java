package fr.iutvalence.java.tp.rushhour;

/**
 * Case du plateau
 * 
 * @author duboitho
 * @version 1.1.0
 * @see Plateau
 */
public class Case
{
	/** Le vehicule posé sur la case (<tt>null</tt> dans le cas d'une case vide) */
	private Vehicule vehicule;
	
	/** Construire une nouvelle case initialement vide */
	public Case()
	{
		this.vehicule = null;
	}

	/**
	 * Obtenir le vehicule pose sur la case
	 * 
	 * @return le vehicule pose sur la case, ou <tt>null</tt> si il n'y pas de vehicule
	 */
	public Vehicule obtenirVehicule()
	{
		return this.vehicule;
	}

	/**
	 * Poser un vehicule sur la case
	 * @param vehicule le vehicule a poser
	 */
	public void poserVehicule(Vehicule vehicule)
	{
		this.vehicule = vehicule;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String delimiteurCase = "|";
		if (this.vehicule == null)
			return delimiteurCase+"  "+delimiteurCase;
		return delimiteurCase+this.vehicule+delimiteurCase;
	}
}
