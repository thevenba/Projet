package fr.iutvalence.java.tp.rushhour;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Launch a game.
 *
 * @author duboitho
 * @version 1.1.0
 */
public class GameLauncher {
    /** Private and empty constructor. */
    private GameLauncher() { /* NOTHING. */}

    /**
     * Where the application starts.
     *
     * @param args not used
     */
    public static void main(final String... args) {
    	Board currentBoard;
    	System.out.println("Choose your level, from 1 to 40");
    	Scanner level = new Scanner (System.in);
    	int levelToLoad = level.nextInt();
    	switch (levelToLoad)
    	{
    	case 1 : 
    		currentBoard = new Level1();
    		break;
    	case 2 : 
    		currentBoard = new Level2();
    		break;
    	default :
    		currentBoard = new Level1();
    	}
    	System.out.println(currentBoard);
    	while(true)
    	{
    		if ((currentBoard.getSquare(new Position(2, 5)).getVehicle() != null) && (currentBoard.getSquare(new Position(2, 5)).getVehicle().getColor() == Color.RED))
    		{
    			System.out.println("WTF !? It seems you've just won...hopefully, the next level will get you down on your knees !");
    			return;
    		}
    		System.out.println("Position x:\n");
    		Scanner x = new Scanner (System.in);
    		int abscisse = x.nextInt();
    		System.out.println("Position y:\n");
    		Scanner y = new Scanner (System.in);
    		int ordonnee = y.nextInt();
    		System.out.println("Movement (number of cases):\n");
    		Scanner movement = new Scanner (System.in);
    		int moveToDo = 0;
    		try {
    			moveToDo = movement.nextInt();
    		}
    		catch (InputMismatchException e) {
    			// TODO
    		}
    		try
    		{
    			currentBoard.moveVehicle(new Position(ordonnee, abscisse), moveToDo);
    		} catch (vehicleNullException | obstructingVehicleException | positionOutsideBoundaryException | invalidPositionException e)
    		{
    			e.printStackTrace();
    		}
        	System.out.println(currentBoard);
    		
    	}
 /*
    	try
		{
			currentBoard.moveVehicle(new Position(0, 0), 1);
		} catch (vehicleNullException | obstructingVehicleException | positionOutsideBoundary e)
		{
			e.printStackTrace();
		}
    	System.out.println(currentBoard);
    	try
		{
			currentBoard.moveVehicle(new Position(1, 0), -1);
		} catch (vehicleNullException | obstructingVehicleException | positionOutsideBoundary e)
		{
			e.printStackTrace();
		}
    	System.out.println(currentBoard);    	
    	try
		{
			currentBoard.moveVehicle(new Position(5, 0), -1);
		} catch (vehicleNullException | obstructingVehicleException | positionOutsideBoundary e)
		{
			e.printStackTrace();
		}
    	System.out.println(currentBoard);    	
    	try
		{
			currentBoard.moveVehicle(new Position(5, 3), -2);
		} catch (vehicleNullException | obstructingVehicleException | positionOutsideBoundary e)
		{
			e.printStackTrace();
		}
    	System.out.println(currentBoard);    	
    	try
		{
			currentBoard.moveVehicle(new Position(4, 5), -3);
		} catch (vehicleNullException | obstructingVehicleException | positionOutsideBoundary e)
		{
			e.printStackTrace();
		}
    	System.out.println(currentBoard);    	
    	try
		{
			currentBoard.moveVehicle(new Position(1, 3), 2);
		} catch (vehicleNullException | obstructingVehicleException | positionOutsideBoundary e)
		{
			e.printStackTrace();
		}
    	System.out.println(currentBoard);    	
    	try
		{
			currentBoard.moveVehicle(new Position(0, 5), 3);
		} catch (vehicleNullException | obstructingVehicleException | positionOutsideBoundary e)
		{
			e.printStackTrace();
		}
    	System.out.println(currentBoard);    	
    	try
		{
			currentBoard.moveVehicle(new Position(2, 2), 3);
		} catch (vehicleNullException | obstructingVehicleException | positionOutsideBoundary e)
		{
			e.printStackTrace();
		}
    	System.out.println(currentBoard);
    	*/
    }
}
