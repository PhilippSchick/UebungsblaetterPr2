/**
 * 
 */
package de.pschick.connectFour;

/**
 * @author Philipp Schick
 * @version 1.00, 13.03.2019
 *
 *          The Field to play <code>false</code> represents player 0,
 *          <code>true</code> represents player 1
 */
public class Field {
	/*
	 * The field
	 */
	private boolean[][] field = new boolean[7][6];

	/**
	 * A Move which places a new token on the field. Before you do this, you should
	 * check if the game isn't over yet, use checkWinner() for this.
	 * 
	 * @param column The column in which the token should be dropped
	 * @param player The Player which makes the move
	 */
	public void makeMove(int column, boolean player) {

	}

	/**
	 * Checks if someone has won
	 * 
	 * @return 0 : Game continues, 1 : Player <code>false</code> wins, 2 : Player
	 *         <code>true</code> wins, 3 : Nobody wins
	 */
	public int checkWinner() {
		//TODO Generate Method
		return -1;
	}
	
	/**
	 * Returns a String representation of the field
	 * @return The field as a String
	 */
	public String toString() {
		//TODO Write Method
		return null;
	}
}
