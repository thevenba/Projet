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
		this.squares = new Square[NB_ROW][NB_COL];
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
	 * 
	 * @return List<Vehcile> the board's vehicles
	 */
	protected abstract List<Vehicle> createVehicle();

	/**
	 * Get the board's square from a given position.
	 *
	 * @param position
	 *            the position
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
	 * @param position
	 *            the position
	 */
	private void delVehicle(Position position)
	{
		this.getSquare(position).setVehicle(null);
	}

	/**
	 * Move a vehicle from a given position to an other one through a number of
	 * squares.
	 * 
	 * @param position
	 *            the position
	 * @param numberOfSquares
	 *            the number of squares
	 * @throws VehicleNullException
	 *             if the vehicle could not move because this one did not exist.
	 * @throws ObstructingVehicleException
	 *             if the vehicle could not move because the destination was
	 *             already in use.
	 * @throws PositionOutsideBoundaryException
	 *             if the vehicle could not move because the destination was
	 *             outside of the board.
	 * @throws InvalidPositionException
	 *             if the vehicle could not move because vehicle's position was
	 *             outside of the board.
	 */
	public void moveVehicle(Position position, int numberOfSquares)
			throws VehicleNullException, ObstructingVehicleException,
			PositionOutsideBoundaryException, InvalidPositionException
	{
		if ((position.getNoColumn() > 5) || (position.getNoRow() > 5)
				|| (position.getNoColumn() < 0) || (position.getNoRow() < 0))
			throw new InvalidPositionException(
					"This position isn't in the board it must be between 0,0 and 5,5");
		Vehicle vehicleToMove = getSquare(position).getVehicle();
		if (vehicleToMove == null)
			throw new VehicleNullException("There is no vehicle right here !");

		if (numberOfSquares >= 0)
		{
			for (int indexSquare = 0; indexSquare < numberOfSquares; indexSquare++)
			{
				Position[] initialPositions = vehicleToMove.getPositions();
				Position[] finalPositions = initialPositions.clone();
				if (vehicleToMove.isOrientation() == Vehicle.HORIZONTAL)
				{
					if (initialPositions[0].getNoColumn() + 1 >= NB_COL)
						throw new PositionOutsideBoundaryException(
								"This move is forbidden, you are going to crash into the wall !");
					if (getSquare(
							new Position(initialPositions[0].getNoRow(), 0,
									initialPositions[0].getNoColumn(), 1))
							.getVehicle() != null)
						throw new ObstructingVehicleException(
								"This move is forbidden, a vehicle is getting in the way !");
					for (int indexPosition = 0; indexPosition < finalPositions.length; indexPosition++)
						finalPositions[indexPosition] = new Position(
								finalPositions[indexPosition].getNoRow(), 0,
								finalPositions[indexPosition].getNoColumn(), 1);
					moveVehicleOnTheBoard(vehicleToMove, initialPositions,
							finalPositions);
				} else
				{
					if (initialPositions[0].getNoRow() + 1 >= NB_ROW)
						throw new PositionOutsideBoundaryException(
								"This move is forbidden, you are going to crash into the wall !");
					if (getSquare(
							new Position(initialPositions[0].getNoRow(), 1,
									initialPositions[0].getNoColumn(), 0))
							.getVehicle() != null)
						throw new ObstructingVehicleException(
								"This move is forbidden, a vehicle is getting in the way !");
					for (int indexPosition = 0; indexPosition < finalPositions.length; indexPosition++)
						finalPositions[indexPosition] = new Position(
								finalPositions[indexPosition].getNoRow(), 1,
								finalPositions[indexPosition].getNoColumn(), 0);
					moveVehicleOnTheBoard(vehicleToMove, initialPositions,
							finalPositions);
				}
			}
		} else
		{
			for (int indexSquare = 0; indexSquare > numberOfSquares; indexSquare--)
			{
				Position[] initialPositions = vehicleToMove.getPositions();
				Position[] finalPositions = initialPositions.clone();
				if (vehicleToMove.isOrientation() == Vehicle.HORIZONTAL)
				{
					if (initialPositions[initialPositions.length - 1]
							.getNoColumn() - 1 < 0)
						throw new PositionOutsideBoundaryException(
								"This move is forbidden, you are going to crash into the wall !");
					if (getSquare(
							new Position(
									initialPositions[initialPositions.length - 1]
											.getNoRow(),
									0,
									initialPositions[initialPositions.length - 1]
											.getNoColumn(), -1)).getVehicle() != null)
						throw new ObstructingVehicleException(
								"This move is forbidden, a vehicle is getting in the way !");
					for (int indexPosition = 0; indexPosition < finalPositions.length; indexPosition++)
						finalPositions[indexPosition] = new Position(
								finalPositions[indexPosition].getNoRow(), 0,
								finalPositions[indexPosition].getNoColumn(), -1);
					moveVehicleOnTheBoard(vehicleToMove, initialPositions,
							finalPositions);
				} else
				{
					if (initialPositions[initialPositions.length - 1]
							.getNoRow() - 1 < 0)
						throw new PositionOutsideBoundaryException(
								"This move is forbidden, you are going to crash into the wall !");
					if (getSquare(
							new Position(
									initialPositions[initialPositions.length - 1]
											.getNoRow(),
									-1,
									initialPositions[initialPositions.length - 1]
											.getNoColumn(), 0)).getVehicle() != null)
						throw new ObstructingVehicleException(
								"This move is forbidden, a vehicle is getting in the way !");
					for (int indexPosition = 0; indexPosition < finalPositions.length; indexPosition++)
						finalPositions[indexPosition] = new Position(
								finalPositions[indexPosition].getNoRow(), -1,
								finalPositions[indexPosition].getNoColumn(), 0);
					moveVehicleOnTheBoard(vehicleToMove, initialPositions,
							finalPositions);
				}
			}
		}
	}

	/**
	 * Move a given vehicle from its initial positions to its final positions.
	 * 
	 * @param vehicleToMove
	 *            the vehicle to move
	 * @param initialPositions
	 *            the initial positions
	 * @param finalPositions
	 *            the final positions
	 */
	private void moveVehicleOnTheBoard(Vehicle vehicleToMove,
			Position[] initialPositions, Position[] finalPositions)
	{
		vehicleToMove.setPositions(finalPositions);
		for (int indexInitPosition = 0; indexInitPosition < initialPositions.length; indexInitPosition++)
			this.delVehicle(initialPositions[indexInitPosition]);
		for (int indexFinalPositions = 0; indexFinalPositions < finalPositions.length; indexFinalPositions++)
			this.addVehicle(finalPositions[indexFinalPositions], vehicleToMove);
	}

	@Override
	public String toString()
	{
		String asciiArtBoard = "    x  |0 ||1 ||2 ||3 ||4 ||5 |\n y     ------------------------\n       ------------------------\n";
		for (int indexR = 0; indexR < NB_ROW; indexR++)
		{
			asciiArtBoard += "|" + indexR + " |  |";
			for (int indexC = 0; indexC < NB_COL; indexC++)
			{
				asciiArtBoard += this.getSquare(new Position(indexR, indexC));
			}
			asciiArtBoard += "\n       ------------------------\n";
		}
		return asciiArtBoard;
	}
}
