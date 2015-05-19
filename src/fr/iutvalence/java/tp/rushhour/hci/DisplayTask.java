/**
 * 
 */
package fr.iutvalence.java.tp.rushhour.hci;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.WindowConstants;

import fr.iutvalence.java.tp.rushhour.interfaces.ControlOfRushHour;

/**
 * @author thevenba
 *
 */
public class DisplayTask implements ActionListener, Runnable
{
	private final ControlOfRushHour controller;
	
	private JFrame window;
	
	private JButton resetButton;
	
	private BoardHci boardHci;
	
	private JSplitPane splitPane;

	/**
	 * 
	 */
	public DisplayTask(ControlOfRushHour controller)
	{
		this.controller = controller;
	}
	
	public void initGraphicInterface()
	{
		this.window = new JFrame();
		this.window.setTitle("Rush Hour");
		this.window.setSize(600, 600);
		this.window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.window.setResizable(false);
		this.resetButton = new JButton();
		this.resetButton.setFocusable(false);
		this.resetButton.addActionListener(this);
		this.boardHci = new BoardHci(this);
		this.splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, this.boardHci, this.resetButton);
		this.splitPane.setEnabled(false);
		this.splitPane.setResizeWeight(1.0);
		this.window.setVisible(true);
	}
	
	public void run()
	{
		this.initGraphicInterface();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}
