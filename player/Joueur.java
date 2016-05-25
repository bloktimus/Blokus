package player;

public class Joueur {

	private String name;
	private Color color;
	private int statut;
	private boolean ctnue;

	/**
	 * 
	 * @param statut
	 */
	public Joueur(int statut) {
		// TODO - implement Joueur.Joueur
		throw new UnsupportedOperationException();
	}

	public Color getColor() {
		return this.color;
	}

	/**
	 * 
	 * @param color
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * 
	 * @param newName
	 */
	public void setName(String newName) {
		this.name = newName;
	}

	public void listPiece() {
		// TODO - implement Joueur.listPiece
		throw new UnsupportedOperationException();
	}

	public void stop() {
		// TODO - implement Joueur.stop
		throw new UnsupportedOperationException();
	}

}