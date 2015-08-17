/**
 * 
 */
package fr.iutvalence.java.tp.rushhour;

import java.util.LinkedList;
import java.util.List;

/**
 * @author thevenba
 *
 */
public class Level10 extends Board {

	/* (non-Javadoc)
	 * @see fr.iutvalence.java.tp.rushhour.Board#createVehicle()
	 */
	@Override
	protected List<Vehicle> createVehicle() {
		// TODO Auto-generated method stub
		final List<Vehicle> vehicles = new LinkedList<>();
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 2, Color.RED, new Position(2, 2)));
		vehicles.add(new Vehicle(Vehicle.VERTICAL, 2, Color.ORANGE, new Position(1, 2)));
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 2, Color.LIGHT_GREEN, new Position(0, 1)));
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 2, Color.PINK, new Position(1, 1)));
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 2, Color.DARK_GREEN, new Position(4, 5)));
		vehicles.add(new Vehicle(Vehicle.VERTICAL, 2, Color.DARK_PURPLE, new Position(5, 3)));
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 2, Color.LIGHT_BLUE, new Position(0, 5)));
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 2, Color.LIGHT_GRAY, new Position(5, 5)));
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 2, Color.BLACK, new Position(5, 1)));
		vehicles.add(new Vehicle(Vehicle.VERTICAL, 3, Color.DARK_YELLOW, new Position(3, 5)));
		vehicles.add(new Vehicle(Vehicle.VERTICAL, 3, Color.LIGHT_PURPLE, new Position(4, 0)));
		vehicles.add(new Vehicle(Vehicle.HORIZONTAL, 3, Color.DARK_BLUE, new Position(3, 3)));
		return vehicles;
	}

}
