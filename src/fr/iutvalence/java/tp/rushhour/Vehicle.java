package fr.iutvalence.java.tp.rushhour;

/**
 * A vehicle on the board.
 *
 * @author thevenba
 * @version 1.0.0
 */
public class Vehicle
{
	/** Vertical orientation. */
	public static final boolean VERTICAL = false;
	/** Horizontal orientation. */
	public static final boolean HORIZONTAL = true;
	/** Vehicle orientation (HORIZONTAL or VERTICAL). */
	private final boolean orientation;
	/** Vehicle's size. */
	private final int size;
	/** Vehicle's color. */
	private final Color color;
	/** Vehicle's positions. */
	private Position[] positions;

	/**
	 * Build a vehicle with given orientation, size, color and head position.
	 * <p>
	 * Head is on the right if the orientation is horizontal, downcast if the
	 * orientation is vertical.
	 *
	 * @param orientation
	 *            the orientation
	 * @param size
	 *            the size
	 * @param color
	 *            the color
	 * @param headPosition
	 *            the head position
	 */
	public Vehicle(boolean orientation, int size, Color color,
			Position headPosition)
	{
		this.orientation = orientation;
		this.size = size;
		this.color = color;
		this.positions = new Position[size];
		this.positions[0] = headPosition;
		if (orientation == HORIZONTAL)
		{
			for (int indexPos = 1; indexPos < size; indexPos++)
			{
				this.positions[indexPos] = new Position(
						this.positions[0].getNoRow(),
						this.positions[0].getNoColumn() - indexPos);
			}
		} else
		{
			for (int indexPos = 1; indexPos < size; indexPos++)
			{
				this.positions[indexPos] = new Position(
						this.positions[0].getNoRow() - indexPos,
						this.positions[0].getNoColumn());
			}
		}
	}

	/**
	 * Get the vehicle's positions.
	 * 
	 * @return the positions
	 */
	public Position[] getPositions()
	{
		return this.positions;
	}

	/**
	 * Set the vehicle's positions.
	 * 
	 * @param positions
	 *            the positions to set.
	 */
	public void setPositions(Position[] positions)
	{
		this.positions = positions;
	}

	/**
	 * Get the vehicle's orientation.
	 * 
	 * @return the orientation
	 */
	public boolean isOrientation()
	{
		return this.orientation;
	}

	@Override
	public String toString()
	{
		return this.color.toString();
	}

	/**
	 * Get the vehicle's color.
	 * 
	 * @return the color
	 */
	public Color getColor()
	{
		return this.color;
	}
}
