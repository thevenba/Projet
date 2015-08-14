package fr.iutvalence.java.tp.rushhour;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author thevenba
 *
 */
public class Level4 extends Board {

	@Override
	protected List<Vehicle> createVehicle() {
		final List<Vehicle> vehicles = new LinkedList<>();
		vehicles.add(new Vehicle(Vehicle.VERTICAL, 3, Color.YELLOW, new Position(2, 0)));
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 2, Color.RED, new Position(2, 2)));
		vehicles.add(new Vehicle(Vehicle.VERTICAL, 2, Color.ORANGE, new Position(5, 5)));
		vehicles.add(new Vehicle(Vehicle.VERTICAL, 3, Color.LIGHT_PURPLE, new Position(2, 3)));
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 3, Color.DARK_BLUE, new Position(3, 5)));
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 3, Color.GREEN, new Position(5, 4)));
		vehicles.add(new Vehicle(Vehicle.VERTICAL, 2, Color.LIGHT_GREEN, new Position(4, 2)));
		return vehicles;
	}

}
