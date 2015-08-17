package fr.iutvalence.java.tp.rushhour;

import java.util.LinkedList;
import java.util.List;

/**
 * Level 1 board.
 *
 * @author thevenba
 * @version 1.1.0
 */
public class Level1 extends Board
{
	@Override
	protected List<Vehicle> createVehicle()
	{
		final List<Vehicle> vehicles = new LinkedList<>();
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 2, Color.RED, new Position(2, 2)));
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 2, Color.LIGHT_BLUE, new Position(4, 5)));
		vehicles.add(new Vehicle(Vehicle.VERTICAL, 3, Color.DARK_BLUE, new Position(3, 3)));
		vehicles.add(new Vehicle(Vehicle.VERTICAL, 3, Color.DARK_YELLOW, new Position(2, 5)));
		vehicles.add(new Vehicle(Vehicle.VERTICAL, 2, Color.ORANGE, new Position(5, 0)));
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 2, Color.LIGHT_GREEN, new Position(0, 1)));
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 3, Color.DARK_CYAN, new Position(5, 4)));
		vehicles.add(new Vehicle(Vehicle.VERTICAL, 3, Color.DARK_PURPLE, new Position(3, 0)));
		return vehicles;
	}
}
