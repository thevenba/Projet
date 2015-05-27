package fr.iutvalence.java.tp.rushhour;

/**
 * Vehicle's colors.
 *
 * @author thevenba
 * @version 1.0.0
 */
public enum Color
{
	/** Red color. */
	RED("R "),
	/** Light blue color. */
	LIGHT_BLUE("lb"),
	/** Dark blue color. */
	DARK_BLUE("db"),
	/** Yellow color. */
	YELLOW("y "),
	/** Orange color. */
	ORANGE("o "),
	/** Light green color. */
	LIGHT_GREEN("lg"),
	/** Dark green color. */
	DARK_GREEN("dg"),
	/** Purple color. */
	DARK_PURPLE("p "),
	/** Light purple color */
	LIGHT_PURPLE("lp"),
	/** Black (non)color */
	BLACK("bl"),
	/** Pink color */
	PINK("pi");
	/** String to display */
	private final String display;

	/**
	 * Build a color with a given display.
	 * 
	 * @param disp
	 *            the displayed text
	 */
	Color(final String disp)
	{
		this.display = disp;
	}

	@Override
	public String toString()
	{
		return this.display;
	}
}
