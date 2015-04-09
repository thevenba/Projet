package fr.iutvalence.java.tp.rushhour;

/**
 * Level 1 board
 * 
 * @author thevenba
 * @version 1.1.0
 */
public class Level1 extends Board {
	
	/**
	 * 
	 */
	public Level1()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createVehicle()
	{
		this.nbVehicles = 8;
        this.vehicles = new Vehicle[this.nbVehicles];
		this.vehicles[0] = new Vehicle(Vehicle.HORIZONTAL, 2, Color.RED, new Position(2,2));
		this.vehicles[1] = new Vehicle(Vehicle.HORIZONTAL, 2, Color.LIGHT_BLUE, new Position(4,5));
		this.vehicles[2] = new Vehicle(Vehicle.VERTICAL, 3, Color.DARK_BLUE, new Position(3,3));
		this.vehicles[3] = new Vehicle(Vehicle.VERTICAL, 3, Color.YELLOW, new Position(2,5));
		this.vehicles[4] = new Vehicle(Vehicle.VERTICAL, 2, Color.ORANGE, new Position(5,0));
		this.vehicles[5] = new Vehicle(Vehicle.HORIZONTAL, 2, Color.LIGHT_GREEN, new Position(0,1));
		this.vehicles[6] = new Vehicle(Vehicle.HORIZONTAL, 3, Color.DARK_GREEN, new Position(5,4));
		this.vehicles[7] = new Vehicle(Vehicle.VERTICAL, 3, Color.PURPLE, new Position(3,0));
	}
}
