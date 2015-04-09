package fr.iutvalence.java.tp.rushhour;

/**
 * A vehicle on the board.
 *
 * @author thevenba
 * @version 1.0.0
 */
public class Vehicle {
    /* TODO Why attributes for the "orientation" and the "size". */
    /* TODO Why not an enum ? */
    /** Vertical orientation. */
    public static final boolean VERTICAL   = false;
    /** Horizontal orientation. */
    public static final boolean HORIZONTAL = true;
    /** Vehicle orientation (HORIZONTAL or VERTICAL). */
    private final boolean    orientation;
    /** Vehicle's size. */
    private final int        size;
    /** Vehicle's color. */
    private final Color      color;
    /** Vehicle's positions. */
    private final Position[] positions;

    /**
     * Build a vehicle with given orientation, size, color and head position.
     * <p>
     * Head is on the right if the orientation is horizontal, downcast if the orientation is vertical.
     *
     * @param orientation  the orientation
     * @param size         the size
     * @param color        the color
     * @param headPosition the head position
     */
    public Vehicle(boolean orientation, int size, Color color, Position headPosition) {
        this.orientation = orientation;
        this.size = size;
        this.color = color;
        this.positions = new Position[size];
        this.positions[0] = headPosition;
        /* TODO À simplifier. */
        if (orientation == HORIZONTAL) {
            for (int indexPos = 1; indexPos < size; indexPos++) {
                this.positions[indexPos] = new Position(this.positions[0].getNoRow(),
                                                        this.positions[0].getNoColumn() - indexPos);
            }
        }
        else {
            for (int indexPos = 1; indexPos < size; indexPos++) {
                this.positions[indexPos] = new Position(this.positions[0].getNoRow() - indexPos,
                                                        this.positions[0].getNoColumn());
            }
        }
    }

    /* TODO JAVADOC. */
    public Position[] getPositions() {
        return this.positions;
    }

    @Override
    public String toString() {
        return this.color.toString();
    }
}
