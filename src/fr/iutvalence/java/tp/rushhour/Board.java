package fr.iutvalence.java.tp.rushhour;

import java.util.List;

/**
 * Game's board.
 *
 * @author duboitho
 * @version 1.1.0
 */
public abstract class Board
{
	/** Number of columns. */
	public static final int NB_COL = 6;
	/** Number of rows. */
	public static final int NB_ROW = 6;
	/** Board. */
	private final Square[][] squares;

	/** Build a new board. */
	protected Board()
	{
		squares = new Square[NB_ROW][NB_COL];
		for (int indexR = 0; indexR < NB_ROW; indexR++)
		{
			for (int indexC = 0; indexC < NB_COL; indexC++)
			{
				this.squares[indexR][indexC] = new Square();
			}
		}
		for (final Vehicle vehicle : createVehicle())
		{
			for (final Position position : vehicle.getPositions())
			{
				this.addVehicle(position, vehicle);
			}
		}
	}

	/**
	 * Build board's vehicles.
	 * <p>
	 * TODO Details the contract behind this method (null allowed ? empty
	 * allowed ? and so on…).
	 */
	protected abstract List<Vehicle> createVehicle();

	/**
	 * Get the board's square from a given position.
	 *
	 * @param position
	 *            the position
	 *
	 * @return the board's square from the given position
	 */
	public Square getSquare(Position position)
	{
		return this.squares[position.getNoRow()][position.getNoColumn()];
	}

	/**
	 * Put a given vehicle on the square from a given position.
	 *
	 * @param position
	 *            the position
	 * @param vehicle
	 *            the vehicle
	 */
	private void addVehicle(Position position, Vehicle vehicle)
	{
		this.getSquare(position).setVehicle(vehicle);
	}

	/**
	 * Delete the vehicle on the square from a given position.
	 * 
	 * @param position the position
	 */
	private void delVehicle(Position position)
	{
		this.getSquare(position).setVehicle(null);
	}
	
	/**
	 * @param position
	 * @return
	 * @throws vehicleNullException
	 * @throws obstructingVehicleException 
	 * @throws positionOutsideBoundary 
	 */
	public boolean moveForward(Position position) throws vehicleNullException, obstructingVehicleException, positionOutsideBoundary {
    	Vehicle vehicleToMove = getSquare(position).getVehicle();
    	if (vehicleToMove == null)
    		throw new vehicleNullException("There is no vehicle right here !");
		Position[] initialPositions = vehicleToMove.getPositions();
		Position[] finalPositions = initialPositions;
    	if (vehicleToMove.isOrientation() == Vehicle.HORIZONTAL)
    	{
    		if (getSquare(initialPositions[0]).getVehicle() != null)
	    		throw new obstructingVehicleException("This move is forbidden, a vehicle is getting in the way !");
	    	if (initialPositions[0].getNoColumn() > NB_COL)
	    		throw new positionOutsideBoundary("This move is forbidden, you are going to crash into the wall !");
	    	for (int indexPosition = 0; indexPosition < finalPositions.length; indexPosition++)
	    		finalPositions[indexPosition] = new Position(finalPositions[indexPosition].getNoRow(), 0, finalPositions[indexPosition].getNoColumn(), 1);
	    	for (int indexInitPosition = 0; indexInitPosition < initialPositions.length; indexInitPosition++)
	    		this.delVehicle(initialPositions[indexInitPosition]);
	    	for (int indexFinalPositions = 0; indexFinalPositions < finalPositions.length; indexFinalPositions++)
	    		this.addVehicle(finalPositions[indexFinalPositions], vehicleToMove);
	    	return true;
    	}
    	// TODO faire la même chose que precedement mais si vertical
	    else
	    {
     		for (int indexPosition = 0; indexPosition < finalPositions.length; indexPosition++)
	    		finalPositions[indexPosition] = new Position(finalPositions[indexPosition].getNoRow(), 1, finalPositions[indexPosition].getNoColumn(), 0);
     		return true;
	    }
    }

	@Override
	public String toString()
	{
		/* TODO String vs StringBuffer vs StringBuilder. */
		String asciiArtBoard = "------------------------\n";
		for (int indexR = 0; indexR < NB_ROW; indexR++)
		{
			for (int indexC = 0; indexC < NB_COL; indexC++)
			{
				asciiArtBoard += this.getSquare(new Position(indexR, indexC));
			}
			asciiArtBoard += "\n------------------------\n";
		}
		return asciiArtBoard;
	}
}
