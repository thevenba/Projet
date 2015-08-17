/**
 * 
 */
package fr.iutvalence.java.tp.rushhour.hci;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.event.ChangeListener;

/**
 * @author thevenba
 *
 */
public class ControlButtonsHci extends JPanel
{
	private final JButton resetButton;
	
	private final JSpinner changeLevelSpinner;
	
	private final SpinnerListModel listLevel;
	
	public ControlButtonsHci(ActionListener buttonsListener, ChangeListener changeListener)
	{
		this.setLayout(new FlowLayout());
		
		this.resetButton = new JButton("Reset level");
		this.resetButton.setFocusable(false);
		this.resetButton.addActionListener(buttonsListener);
		
		String[] levels = {"Level 1", "Level 2", "Level 3", "Level 4", "Level 5", "Level 6", "Level 7", "Level 8", "Level 9", "Level 10"};
		this.listLevel = new SpinnerListModel(levels);
		
		this.changeLevelSpinner = new JSpinner(this.listLevel);
		this.changeLevelSpinner.addChangeListener(changeListener);
		this.add(this.resetButton);
		this.add(this.changeLevelSpinner);
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
	public JSpinner getChangeLevelButton()
	{
		return changeLevelSpinner;
	}
}
