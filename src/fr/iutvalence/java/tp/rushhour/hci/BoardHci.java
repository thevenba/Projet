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
	
	public BoardHci(ActionListener buttonListener)
	{
		// TODO Auto-generated constructor stub
		this.setLayout(new GridLayout(Board.NB_ROW, Board.NB_COL));
		this.square = new JButton();
		this.square.setFocusable(false);
		this.square.addActionListener(buttonListener);
		for (int layoutPosition = 0; layoutPosition < Board.NB_ROW*Board.NB_COL; layoutPosition++)
			this.add(this.square);
	}

}
