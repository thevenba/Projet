/**
 * 
 */
package fr.iutvalence.java.tp.rushhour;

/**
 * This exception is used to indicate that it was impossible to move there
 * because the destination was already in use.
 * 
 * @author thevenba
 *
 */
public class ObstructingVehicleException extends Exception
{
	/**
	 * @param message
	 *            the message to display
	 */
	public ObstructingVehicleException(String message)
	{
		super(message);
	}
}
