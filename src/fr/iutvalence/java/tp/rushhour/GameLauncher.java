package fr.iutvalence.java.tp.rushhour;

import java.util.Scanner;

import javax.swing.plaf.BorderUIResource.CompoundBorderUIResource;

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
        Board currentBoard = new Level2();
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
    		System.out.println("mouvement :\n");
    		Scanner movement = new Scanner (System.in);
    		int moveToDo = movement.nextInt();
    		try
    		{
    			currentBoard.moveVehicle(new Position(ordonnee, abscisse), moveToDo);
    		} catch (vehicleNullException | obstructingVehicleException | positionOutsideBoundary | invalidPositionException e)
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
