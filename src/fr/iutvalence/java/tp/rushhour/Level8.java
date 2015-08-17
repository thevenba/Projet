package fr.iutvalence.java.tp.rushhour;

import java.util.LinkedList;
import java.util.List;

/**
 * @author thevenba
 *
 */
public class Level8 extends Board {

	@Override
	protected List<Vehicle> createVehicle() {
		// TODO Auto-generated method stub
		final List<Vehicle> vehicles = new LinkedList<>();
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 2, Color.RED, new Position(2, 1)));
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 2, Color.ORANGE, new Position(1, 3)));
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 2, Color.LIGHT_GREEN, new Position(0, 4)));
		vehicles.add(new Vehicle(Vehicle.VERTICAL, 2, Color.PINK, new Position(3, 2)));
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 2, Color.DARK_GREEN, new Position(3, 1)));
		vehicles.add(new Vehicle(Vehicle.VERTICAL, 2, Color.DARK_PURPLE, new Position(3, 3)));
		vehicles.add(new Vehicle(Vehicle.VERTICAL, 2, Color.LIGHT_BLUE, new Position(2, 4)));
		vehicles.add(new Vehicle(Vehicle.VERTICAL, 2, Color.LIGHT_YELLOW, new Position(5, 2)));
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 2, Color.LIGHT_GRAY, new Position(4, 1)));
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 2, Color.DARK_GRAY, new Position(5, 1)));
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 2, Color.BLACK, new Position(3, 5)));
		vehicles.add(new Vehicle(Vehicle.VERTICAL, 3, Color.DARK_YELLOW, new Position(2, 5)));
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 3, Color.LIGHT_PURPLE, new Position(4, 5)));
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 3, Color.DARK_BLUE, new Position(5, 5)));
		return vehicles;
	}

}
