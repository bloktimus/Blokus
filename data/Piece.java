package data;

public class Piece {

	private boolean free;
	private Color color;
	private int[][] shape;

	public Piece() {
		// TODO - implement Piece.Piece
		throw new UnsupportedOperationException();
	}

	public boolean used() {
		// TODO - implement Piece.used
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param color
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	public int[][] getShape() {
		return this.shape;
	}

}