package fr.iutvalence.java.tp.rushhour;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.SwingUtilities;

import fr.iutvalence.java.tp.rushhour.hci.DisplayTask;

/**
 * Launch a game.
 *
 * @author duboitho
 * @version 1.1.0
 */
public class GameLauncher
{
	/** Private and empty constructor. */
	private GameLauncher()
	{ /* NOTHING. */
	}

	/**
	 * Where the application starts.
	 *
	 * @param args
	 *            not used
	 */
	public static void main(final String... args)
	{
		DisplayTask displayTask = new DisplayTask(new Level1());
		SwingUtilities.invokeLater(displayTask);
		selectLevel();
	}

	/**
	 * Select the board you want to play.
	 */
	private static void selectLevel()
	{
		
		Board currentBoard;
		System.out.println("Choose your level, from 1 to 40");
		Scanner level = new Scanner(System.in);
		int levelToLoad = 0;
		try
		{
			levelToLoad = level.nextInt();
		} catch (InputMismatchException e)
		{
		}
		switch (levelToLoad)
		{
			case 1:
				currentBoard = new Level1();
				break;
			case 2:
				currentBoard = new Level2();
				break;
			case 3:
				currentBoard = new Level3();
				break;
			default:
				currentBoard = new Level1();
		}
		System.out.println(currentBoard);
		play(currentBoard);
	}

	/**
	 * Play the game on a current board.
	 * 
	 * @param currentBoard
	 *            the current board
	 */
	private static void play(Board currentBoard)
	{
		while (true)
		{
			if ((currentBoard.getSquare(new Position(2, 5)).getVehicle() != null)
					&& (currentBoard.getSquare(new Position(2, 5)).getVehicle()
							.getColor() == Color.RED))
			{
				System.out
						.println("WTF !? It seems you've just won...hopefully, the next level will get you down on your knees !");
				selectLevel();
			}
			System.out.println("Position x:\n");
			Scanner x = new Scanner(System.in);
			int abscisse = 0;
			try
			{
				abscisse = x.nextInt();
			} catch (InputMismatchException e)
			{
			}
			System.out.println("Position y:\n");
			Scanner y = new Scanner(System.in);
			int ordonnee = 0;
			try
			{
				ordonnee = y.nextInt();
			} catch (InputMismatchException e1)
			{
			}
			System.out.println("Movement (EITHER '+' or 'nothing' to move right or down (depends on horizontal or vertical) OR '-' to move left or up (depends on horizontal or vertical), followed by a number of squares):\n");
			Scanner movement = new Scanner(System.in);
			int moveToDo = 0;
			try
			{
				moveToDo = movement.nextInt();
			} catch (InputMismatchException e2)
			{
			}
			try
			{
				currentBoard.moveVehicle(new Position(ordonnee, abscisse),
						moveToDo);
			} catch (VehicleNullException | ObstructingVehicleException | PositionOutsideBoundaryException | InvalidPositionException e)
			{
				e.printStackTrace();
			}
			System.out.println(currentBoard);

		}
	}

}
