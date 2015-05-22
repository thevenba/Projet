/**
 * 
 */
package fr.iutvalence.java.tp.rushhour.hci;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import fr.iutvalence.java.tp.rushhour.Board;

/**
 * @author thevenba
 *
 */
public class BoardHci extends JPanel
{
	private JButton square;
	
	public BoardHci(ActionListener buttonsListener)
	{
		// TODO Auto-generated constructor stub
		this.setLayout(new GridLayout(Board.NB_ROW, Board.NB_COL));

		for (int colPosition = 0; colPosition < Board.NB_COL; colPosition++)
			for (int rowPosition = 0; rowPosition < Board.NB_ROW; rowPosition++)
				{
					if ((colPosition == 2) && (rowPosition == 5))
					{
						this.square = new JButton("Exit");
						this.square.setFocusable(false);
						this.square.addActionListener(buttonsListener);
						this.add(this.square);
					}
					else
					{
						this.square = new JButton();
						this.square.setFocusable(false);
						this.square.addActionListener(buttonsListener);
						this.add(this.square);
					}
				}
	}

}
