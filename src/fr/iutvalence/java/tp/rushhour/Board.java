package fr.iutvalence.java.tp.rushhour;

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
    protected Square[][] squares;
    /** Board's vehicles */
    protected Vehicle[] vehicles;
    /** Number of vehicles on the board */
    protected int nbVehicles;

    /** Build a new board. */
    public Board() {
        this.squares = new Square[NB_ROW][NB_COL];
        for (int indexR = 0; indexR < NB_ROW; indexR++) 
            for (int indexC = 0; indexC < NB_COL; indexC++)
            	this.squares[indexR][indexC] = new Square();
        this.createVehicle();
        for (int indexVehicle = 0; indexVehicle < this.nbVehicles; indexVehicle++)
        {
        	for (int indexSize = 0; indexSize < this.vehicles[indexVehicle].getSize(); indexSize++)
            	this.addVehicle(this.vehicles[indexVehicle].getPositions(indexSize), this.vehicles[indexVehicle]);
        }
    }
    
    /**
     * Build board's vehicles
     */
    public abstract void createVehicle();

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
    public void addVehicle(Position position, Vehicle vehicle)
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
