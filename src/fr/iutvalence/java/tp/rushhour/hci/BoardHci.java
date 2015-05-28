/**
 * 
 */
package fr.iutvalence.java.tp.rushhour.hci;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import fr.iutvalence.java.tp.rushhour.Board;
import fr.iutvalence.java.tp.rushhour.Color;
import fr.iutvalence.java.tp.rushhour.Position;

/**
 * @author thevenba
 *
 */
public class BoardHci extends JPanel
{
	private RhButton[][] buttonsTable;
	private Board boardToDisplay;
	
	public BoardHci(ActionListener buttonsListener, Board boardToDisplay)
	{
		this.buttonsTable = new RhButton[Board.NB_ROW][Board.NB_COL];
		this.boardToDisplay = boardToDisplay;
		this.setLayout(new GridLayout(Board.NB_ROW, Board.NB_COL));

		for (int colPosition = 0; colPosition < Board.NB_COL; colPosition++)
			for (int rowPosition = 0; rowPosition < Board.NB_ROW; rowPosition++)
				{
					if ((colPosition == 2) && (rowPosition == 5))
					{
						this.buttonsTable[rowPosition][colPosition] = new RhButton("Exit", rowPosition, colPosition);
						this.add(this.buttonsTable[rowPosition][colPosition]);
						this.buttonsTable[rowPosition][colPosition].addActionListener(buttonsListener);
					}
					else
					{
						this.buttonsTable[rowPosition][colPosition] = new RhButton(rowPosition, colPosition);
						this.add(this.buttonsTable[rowPosition][colPosition]);
						this.buttonsTable[rowPosition][colPosition].addActionListener(buttonsListener);
					}
				}
		this.refreshBoard();
	}

	public void refreshBoard()
	{
		for (int colPosition = 0; colPosition < Board.NB_COL; colPosition++)
			for (int rowPosition = 0; rowPosition < Board.NB_ROW; rowPosition++)
				if (this.boardToDisplay.getSquare(new Position(colPosition, rowPosition)).getVehicle() == null)
				{
					this.buttonsTable[rowPosition][colPosition].removeAll();
					this.buttonsTable[rowPosition][colPosition].setBackground(java.awt.Color.WHITE);
				}
				else if (this.boardToDisplay.getSquare(new Position(colPosition, rowPosition)).getVehicle().getColor() == Color.BLACK)
				{
					this.buttonsTable[rowPosition][colPosition].removeAll();
					this.buttonsTable[rowPosition][colPosition].setBackground(java.awt.Color.BLACK);
				}
				else if (this.boardToDisplay.getSquare(new Position(colPosition, rowPosition)).getVehicle().getColor() == Color.DARK_BLUE)
				{
					this.buttonsTable[rowPosition][colPosition].removeAll();
					this.buttonsTable[rowPosition][colPosition].setBackground(java.awt.Color.BLUE.darker());
				}
				else if (this.boardToDisplay.getSquare(new Position(colPosition, rowPosition)).getVehicle().getColor() == Color.DARK_GREEN)
				{
					this.buttonsTable[rowPosition][colPosition].removeAll();
					this.buttonsTable[rowPosition][colPosition].setBackground(java.awt.Color.GREEN.darker());
				}
				else if (this.boardToDisplay.getSquare(new Position(colPosition, rowPosition)).getVehicle().getColor() == Color.LIGHT_BLUE)
				{
					this.buttonsTable[rowPosition][colPosition].removeAll();
					this.buttonsTable[rowPosition][colPosition].setBackground(java.awt.Color.BLUE.brighter());
				}
				else if (this.boardToDisplay.getSquare(new Position(colPosition, rowPosition)).getVehicle().getColor() == Color.LIGHT_GREEN)
				{
					this.buttonsTable[rowPosition][colPosition].removeAll();
					this.buttonsTable[rowPosition][colPosition].setBackground(java.awt.Color.GREEN.brighter());
				}
				else if (this.boardToDisplay.getSquare(new Position(colPosition, rowPosition)).getVehicle().getColor() == Color.LIGHT_PURPLE)
				{
					this.buttonsTable[rowPosition][colPosition].removeAll();
					this.buttonsTable[rowPosition][colPosition].setBackground(java.awt.Color.MAGENTA.brighter());
				}
				else if (this.boardToDisplay.getSquare(new Position(colPosition, rowPosition)).getVehicle().getColor() == Color.ORANGE)
				{
					this.buttonsTable[rowPosition][colPosition].removeAll();
					this.buttonsTable[rowPosition][colPosition].setBackground(java.awt.Color.ORANGE);
				}
				else if (this.boardToDisplay.getSquare(new Position(colPosition, rowPosition)).getVehicle().getColor() == Color.PINK)
				{
					this.buttonsTable[rowPosition][colPosition].removeAll();
					this.buttonsTable[rowPosition][colPosition].setBackground(java.awt.Color.PINK);
				}
				else if (this.boardToDisplay.getSquare(new Position(colPosition, rowPosition)).getVehicle().getColor() == Color.DARK_PURPLE)
				{
					this.buttonsTable[rowPosition][colPosition].removeAll();
					this.buttonsTable[rowPosition][colPosition].setBackground(java.awt.Color.MAGENTA.darker());
				}
				else if (this.boardToDisplay.getSquare(new Position(colPosition, rowPosition)).getVehicle().getColor() == Color.RED)
				{
					this.buttonsTable[rowPosition][colPosition].removeAll();
					this.buttonsTable[rowPosition][colPosition].setBackground(java.awt.Color.RED);
				}
				else if (this.boardToDisplay.getSquare(new Position(colPosition, rowPosition)).getVehicle().getColor() == Color.YELLOW)
				{
					this.buttonsTable[rowPosition][colPosition].removeAll();
					this.buttonsTable[rowPosition][colPosition].setBackground(java.awt.Color.YELLOW);
				}
		this.revalidate();
	}

	/**
	 * @param boardToDisplay the boardToDisplay to set
	 */
	public void setBoardToDisplay(Board boardToDisplay)
	{
		this.boardToDisplay = boardToDisplay;
		this.refreshBoard();
	}

	
}
