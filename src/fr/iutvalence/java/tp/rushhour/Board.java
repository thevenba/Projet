package fr.iutvalence.java.tp.rushhour;

import java.util.List;

/**
 * Game's board.
 *
 * @author duboitho
 * @version 1.1.0
 */
public abstract class Board {
    /** Number of columns. */
    public static final int NB_COL = 6;
    /** Number of rows. */
    public static final int NB_ROW = 6;
    /** Board. */
    private Square[][] squares;

    /** Build a new board. */
    protected Board() {
        this.squares = new Square[NB_ROW][NB_COL];
        for (int indexR = 0; indexR < NB_ROW; indexR++) 
            for (int indexC = 0; indexC < NB_COL; indexC++)
            	this.squares[indexR][indexC] = new Square();
        
        final List<Vehicle> vehicles = this.createVehicle();
        for (final Vehicle vehicle : vehicles) {
        	for (final Position position : vehicle.getPositions()) {
        		this.addVehicle(position, vehicle);
        	}
        }
    }
    
    /**
     * Build board's vehicles
     */
    public abstract List<Vehicle> createVehicle();

	/**
     * Get the board's square from a given position
     * @param position the position
     * @return the board's square from the given position
     */
    public Square getSquare(Position position)
    {
    	return this.squares[position.getNoRow()][position.getNoColumn()];
    }
    
    /**
     * Put a given vehicle on the square from a given position
     * @param position the position
     * @param vehicle the vehicle
     */
    private void addVehicle(Position position, Vehicle vehicle)
    {
    	this.getSquare(position).setVehicle(vehicle);
    }
 
    /**
     * @see java.lang.Object#toString()
     */
    public String toString() {
        /* TODO String vs StringBuffer vs StringBuilder. */
        String asciiArtBoard = "------------------------\n";

        for (int indexR = 0; indexR < NB_ROW; indexR++) 
        {
            for (int indexC = 0; indexC < NB_COL; indexC++) 
            	asciiArtBoard += this.getSquare(new Position(indexR,indexC));
            asciiArtBoard += "\n------------------------\n";
        }
        return asciiArtBoard;
    }
}