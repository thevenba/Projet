/**
 * 
 */
package fr.iutvalence.java.tp.rushhour.hci;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import fr.iutvalence.java.tp.rushhour.Board;
import fr.iutvalence.java.tp.rushhour.Color;
import fr.iutvalence.java.tp.rushhour.InvalidPositionException;
import fr.iutvalence.java.tp.rushhour.Level1;
import fr.iutvalence.java.tp.rushhour.Level2;
import fr.iutvalence.java.tp.rushhour.Level3;
import fr.iutvalence.java.tp.rushhour.ObstructingVehicleException;
import fr.iutvalence.java.tp.rushhour.Position;
import fr.iutvalence.java.tp.rushhour.PositionOutsideBoundaryException;
import fr.iutvalence.java.tp.rushhour.Vehicle;
import fr.iutvalence.java.tp.rushhour.VehicleNullException;

/**
 * @author thevenba
 *
 */
public class DisplayTask implements ActionListener, Runnable, KeyListener, ChangeListener
{
	/* private final ControlOfRushHour controller;*/
	
	private static final int CLICK_COUNTER_DEFAULT = 0;

	private JFrame window;
	
	private BoardHci boardHci;
	
	private JSplitPane splitPane;

	private ControlButtonsHci controlButtonsHci;
	
	private Board board;
	
	private int clickCounter;
	
	private int selectedRow;
	
	private int selectedColumn;
	
	private int selectedRowDelta;
	
	private int selectedColumnDelta;

	private boolean selectedOrientation;

	/**
	 * 
	 */
	public DisplayTask(Board board)
	{
		this.board = board;
		this.clickCounter = DisplayTask.CLICK_COUNTER_DEFAULT;
	}
	
	public void initGraphicInterface()
	{
		this.window = new JFrame();
		this.window.setTitle("Rush Hour");
		this.window.setSize(600, 600);
		this.window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.window.setResizable(false);
		this.boardHci = new BoardHci(this, this.board);
		this.boardHci.setFocusable(false);
		this.controlButtonsHci = new ControlButtonsHci(this, this);
		this.splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, this.boardHci, this.controlButtonsHci);
		this.splitPane.setEnabled(false);
		this.splitPane.setResizeWeight(1.0);
		this.window.getContentPane().add(this.splitPane);
		this.window.addKeyListener(this);
		this.window.setVisible(true);
	}
	
	public void run()
	{
		this.initGraphicInterface();
	}

	@Override
	public void actionPerformed(ActionEvent event)
	{
		JComponent source = (JComponent) event.getSource();
		if (source == this.controlButtonsHci.getResetButton())
		{
			/* TODO a faire marcher */
			if (this.board instanceof Level1)
			{
				this.board = new Level1();
				this.boardHci.setBoardToDisplay(this.board);
			}
			else if (this.board instanceof Level2)
			{
				this.board = new Level2();
				this.boardHci.setBoardToDisplay(this.board);
			}
			else
			{
				this.board = new Level3();
				this.boardHci.setBoardToDisplay(this.board);
			}
			return;
		}
		if (source instanceof RhButton)
		{
			if (this.clickCounter == 0)
			{
				selectedRow = ((RhButton) source).getRow();
				selectedColumn = ((RhButton) source).getColumn();
				if (this.board.getSquare(new Position(selectedColumn, selectedRow)).getVehicle() == null)
				{
					return;
				}
				selectedOrientation = this.board.getSquare(new Position(selectedColumn, selectedRow)).getVehicle().isOrientation();
				this.clickCounter = 1;
			}
			else
			{
				selectedRowDelta = ((RhButton) source).getRow();
				selectedColumnDelta = ((RhButton) source).getColumn();
					if (this.selectedOrientation == Vehicle.HORIZONTAL)
					{
						if (selectedColumn != selectedColumnDelta)
						{
							this.clickCounter = 0;
							return;
						}
						else
						{
							try
							{
								this.board.moveVehicle(new Position(selectedColumn,selectedRow), selectedRowDelta-selectedRow);
							} catch (VehicleNullException
									| ObstructingVehicleException
									| PositionOutsideBoundaryException
									| InvalidPositionException e)
							{
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(window,
									    e.toString(),
									    "Inane warning",
									    JOptionPane.WARNING_MESSAGE);
								e.printStackTrace();
							}
							this.clickCounter = 0;
							this.boardHci.refreshBoard();
							if ((this.board.getSquare(new Position(2, 5)).getVehicle() != null)
									&& (this.board.getSquare(new Position(2, 5)).getVehicle()
											.getColor() == Color.RED))
							{
								Object[] levels = {"Level 1", "Level 2", "Level 3"};
								String s = (String)JOptionPane.showInputDialog(this.window,
									    "WTF !? It seems you've just won...hopefully, the next level will get you down on your knees !", "Win", JOptionPane.PLAIN_MESSAGE, null, levels, "Level 1");;
							    if (s == "Level 1")
							    {
							    	this.board = new Level1();
							    	this.boardHci.setBoardToDisplay(this.board);
							    }
							    else if (s == "Level 2")
							    {
							    	this.board = new Level2();
							    	this.boardHci.setBoardToDisplay(this.board);
							    }
							    else
							    {
							    	this.board = new Level3();
							    	this.boardHci.setBoardToDisplay(this.board);
							    }
							}
							return;
						}
					}
					else
					{
						if (this.selectedRow != selectedRowDelta)
						{
							this.clickCounter = 0;
							return;
						}
						else
						{
							try
							{
								this.board.moveVehicle(new Position(selectedColumn,selectedRow), selectedColumnDelta - selectedColumn);
							} catch (VehicleNullException
									| ObstructingVehicleException
									| PositionOutsideBoundaryException
									| InvalidPositionException e)
							{
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(window,
									    e.toString(),
									    "Inane warning",
									    JOptionPane.WARNING_MESSAGE);
								e.printStackTrace();
							}
							this.clickCounter = 0;
							this.boardHci.refreshBoard();
							return;
						}
					}
			}
		}
		
	}

	@Override
	public void keyPressed(KeyEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stateChanged(ChangeEvent event)
	{
		// TODO Auto-generated method stub
		JSpinner source = (JSpinner) event.getSource();
		String level = (String) source.getValue();
		if (level == "Level 1")
		{
			this.board = new Level1();
			this.boardHci.setBoardToDisplay(this.board);
		}
		else if (level == "Level 2")
		{
			this.board = new Level2();
			this.boardHci.setBoardToDisplay(this.board);
		}
		else
		{
			this.board = new Level3();
			this.boardHci.setBoardToDisplay(this.board);
		}
		
	}
}
