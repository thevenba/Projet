package fr.iutvalence.java.tp.rushhour;

/**
 * A vehicle on the board
 * 
 * @author thevenba
 * @version 1.0.0
 */
public class Vehicle 
{
	/** Horizontal orientation */
	public static final boolean HORIZONTAL = true;
	/** Vertical orientation */
	public static final boolean VERTICAL = false;
	/** Vehicle orientation (HORIZONTAL or VERTICAL) */
	private final boolean orientation;
	/** Vehicle's size */
	private final int size;
	/** Vehicle's color */
	private final Color color;
	/** Vehicle's positions */
	private Position[] positions;

	/**
	 * Build a vehicle with given orientation, size, color and head position 
	 * (head is on the right if the orientation is horizontal, downcast if the orientation is vertical)
	 * @param orientation the orientation
	 * @param size the size
	 * @param color the color
	 * @param headPosition the head position
	 */
	public Vehicle(boolean orientation, int size, Color color, Position headPosition)
	{
		this.orientation = orientation;
		this.size = size;
		this.color = color;
		this.positions = new Position[size];
		this.positions[0] = headPosition;
		if (orientation == HORIZONTAL)
			for (int indexPos = 1; indexPos < size; indexPos++)
				this.positions[indexPos] = new Position(this.positions[0].getNoRow(), this.positions[0].getNoColumn()-indexPos);
		else
			for (int indexPos = 1; indexPos < size; indexPos++)
				this.positions[indexPos] = new Position(this.positions[0].getNoRow()-indexPos, this.positions[0].getNoColumn());
	}

	/** JAVADOC.
	 * 
	 * @return
	 */
	public Position[] getPositions() {
		return this.positions;
	}
	/**
	 * Get the vehicle's size
	 * @return The vehicle's size
	 */
	public int getSize()
	{
		return this.size;
	}

	/**
	 * Get the position in the array from a given index
	 * @param index the index
	 * @return the position in the array from the given index
	 */
	public Position getPositions(int index)
	{
		return this.positions[index];
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return this.color.toString();
	}
}
