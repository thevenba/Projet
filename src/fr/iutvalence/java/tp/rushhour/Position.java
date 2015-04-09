package fr.iutvalence.java.tp.rushhour;

/**
 * Represente une position, a l'intersection, d'une ligne et d'une colonne
 * 
 * @author thevenba
 * @version 1.0.0
 */
public class Position
{
	/** Numero of row */
	private final int noRow;
	/** Numero of column */
	private final int noColumn;
	
	/**
	 * Build a new position, from a given row/column intersection
	 * @param noRow the numero of row
	 * @param noColumn the numero of column
	 */
	public Position(int noRow, int noColumn)
	{
		this.noRow = noRow;
		this.noColumn = noColumn;
	}

	/**
	 * Get the numero of row
	 * @return the numero of row
	 */
	public int getNoRow()
	{
		return this.noRow;
	}

	/**
	 * Get the numero of column
	 * @return the numero of column
	 */
	public int getNoColumn()
	{
		return this.noColumn;
	}
}
