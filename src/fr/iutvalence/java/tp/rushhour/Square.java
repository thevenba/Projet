package fr.iutvalence.java.tp.rushhour;

/**
 * Board's square.
 *
 * @author duboitho
 * @version 1.1.0
 * @see Board
 */
public class Square
{
	/** Vehicle put on the square (<tt>null</tt> in case empty square). */
	private Vehicle vehicle;

	/** Build a new empty square. */
	public Square()
	{
		this.vehicle = null;
	}

	/**
	 * Get the vehicle put on the square.
	 *
	 * @return the vehicle put on the square, or <tt>null</tt> if there is no
	 *         vehicle
	 */
	public Vehicle getVehicle()
	{
		return this.vehicle;
	}

	/**
	 * Set a vehicle on the square.
	 *
	 * @param vehicle
	 *            the vehicle to set
	 */
	public void setVehicle(Vehicle vehicle)
	{
		this.vehicle = vehicle;
	}

	@Override
	public String toString()
	{
		final String squareDelimiter = "|";
		if (this.vehicle == null)
		{
			return squareDelimiter + "  " + squareDelimiter;
		}
		return squareDelimiter + this.vehicle + squareDelimiter;
	}
}
