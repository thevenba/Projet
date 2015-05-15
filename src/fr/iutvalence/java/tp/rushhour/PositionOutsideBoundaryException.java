/**
 * 
 */
package fr.iutvalence.java.tp.rushhour;

/**
 * This exception is used to indicate that it was impossible to move there
 * because the destination was outside of the board.
 * 
 * @author thevenba
 *
 */
public class PositionOutsideBoundaryException extends Exception
{

	/**
	 * @param message
	 *            the message to display
	 */
	public PositionOutsideBoundaryException(String message)
	{
		super(message);
	}
}
