package fr.iutvalence.java.tp.rushhour;

/**
 * Position at the intersection of a row and a column.
 *
 * @author thevenba
 * @version 1.0.0
 */
public class Position
{
	/** Number of row. */
	private final int noRow;
	/** Number of column. */
	private final int noColumn;

	/**
	 * Build a new position, from a given row/column intersection.
	 *
	 * @param noRow
	 *            the number of row
	 * @param noColumn
	 *            the number of column
	 */
	public Position(int noRow, int noColumn)
	{
		this.noRow = noRow;
		this.noColumn = noColumn;
	}

	/**
	 * Build a new position, from a given row+row delta/column + column delta
	 * intersection.
	 * 
	 * @param noRow
	 *            the number of row
	 * @param noRowDelta
	 *            the number of row delta
	 * @param noColumn
	 *            the number of column
	 * @param noColumnDelta
	 *            the number of column delta
	 */
	public Position(int noRow, int noRowDelta, int noColumn, int noColumnDelta)
	{
		this.noRow = noRow + noRowDelta;
		this.noColumn = noColumn + noColumnDelta;
	}

	/**
	 * Get the number of row.
	 *
	 * @return the number of row
	 */
	public int getNoRow()
	{
		return this.noRow;
	}

	/**
	 * Get the number of column.
	 *
	 * @return the number of column
	 */
	public int getNoColumn()
	{
		return this.noColumn;
	}
}
