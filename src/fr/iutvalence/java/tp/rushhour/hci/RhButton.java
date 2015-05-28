/**
 * 
 */
package fr.iutvalence.java.tp.rushhour.hci;

import javax.swing.JButton;

/**
 * @author thevenba
 *
 */
public class RhButton extends JButton
{
	private int row;
	private int column;
	
	/**
	 * 
	 */
	public RhButton(int row, int column)
	{
		super();
		this.row = row;
		this.column = column;
	}

	/**
	 * @param text
	 */
	public RhButton(String text, int row, int column)
	{
		super(text);
		this.row = row;
		this.column = column;
	}



	/**
	 * @return the row
	 */
	public int getRow()
	{
		return this.row;
	}

	/**
	 * @return the column
	 */
	public int getColumn()
	{
		return this.column;
	}

	
}
