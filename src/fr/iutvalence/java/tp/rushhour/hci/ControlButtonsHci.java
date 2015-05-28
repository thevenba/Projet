/**
 * 
 */
package fr.iutvalence.java.tp.rushhour.hci;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author thevenba
 *
 */
public class ControlButtonsHci extends JPanel
{
	private final JButton resetButton;
	
	private final JButton changeLevelButton;
	
	public ControlButtonsHci(ActionListener buttonsListener)
	{
		this.setLayout(new FlowLayout());
		this.resetButton = new JButton("Reset level");
		this.resetButton.setFocusable(false);
		this.resetButton.addActionListener(buttonsListener);
		this.changeLevelButton = new JButton("Change level");
		this.changeLevelButton.setFocusable(false);
		this.changeLevelButton.addActionListener(buttonsListener);
		this.add(this.resetButton);
		this.add(this.changeLevelButton);
	}

	/**
	 * @return the resetButton
	 */
	public JButton getResetButton()
	{
		return resetButton;
	}

	/**
	 * @return the changeLevelButton
	 */
	public JButton getChangeLevelButton()
	{
		return changeLevelButton;
	}
}
