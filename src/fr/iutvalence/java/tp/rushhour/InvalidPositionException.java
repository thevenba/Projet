/**
 * 
 */
package fr.iutvalence.java.tp.rushhour;

/**
 * This exception is used to indicate that it was impossible to move there
 * because the given vehicle's position was outside of the board.
 * 
 * @author duboitho
 *
 */
public class InvalidPositionException extends Exception
{
	/**
	 * @param message
	 *            the message to display
	 */
	public InvalidPositionException(String message)
	{
		super(message);
	}
}
