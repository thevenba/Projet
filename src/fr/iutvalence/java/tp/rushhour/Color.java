package fr.iutvalence.java.tp.rushhour;

/**
 * Enum of vehicles colors
 * 
 * @author thevenba
 * @version 1.0.0
 */
public enum Color
{
	/**
	 * Red color
	 */
	RED,
	
	/**
	 * Light blue color
	 */
	LIGHT_BLUE,
	
	/**
	 * Dark blue color
	 */
	DARK_BLUE,
	
	/**
	 * Yellow color
	 */
	YELLOW,
	
	/**
	 * orange color
	 */
	ORANGE,
	
	/**
	 * Light green color
	 */
	LIGHT_GREEN,
	
	/**
	 * Dark green color
	 */
	DARK_GREEN,
	
	/**
	 * Purple color
	 */
	PURPLE;
	
	/**
	 * @see java.lang.Enum#toString()
	 */
	public String toString()
	{
		switch (this)
		{
			case RED: 
				return "R ";
			case LIGHT_BLUE: 
				return "lb";
			case DARK_BLUE:
				return "db";
			case YELLOW:
				return "y ";
			case ORANGE:
				return "o ";
			case LIGHT_GREEN:
				return "lg";
			case DARK_GREEN:
				return "dg";
			case PURPLE:
				return "p ";
			default:
				return null;
		}
	}
}
