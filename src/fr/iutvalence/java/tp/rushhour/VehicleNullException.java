/**
 * 
 */
package fr.iutvalence.java.tp.rushhour;

/**
 * This exception is used to indicate that it was impossible to move a vehicle
 * because there was no vehicle at the given position.
 * 
 * @author thevenba
 *
 */
public class VehicleNullException extends Exception
{

	/**
	 * @param message
	 *            the message to display
	 */
	public VehicleNullException(String message)
	{
		super(message);
	}

}
