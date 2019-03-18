/**
 * 
 */
package de.pschick.connectFour;

/**
 * @author Philipp Schick
 * @version 1.00, 13.03.2019
 *
 *          The Field to play, X represents player 0, O represents player 1
 */
public class Field {
	/**
	 * The field
	 */
	private String[][] field = new String[7][6];

	/**
	 * Keeps the symbol for player 0 at <code>playerSymbol[0]</code> and for player
	 * 1 at <code>playerSymbol[0]</code>
	 */
	private String[] playerSymbol = { "X", "O" };

	/**
	 * A Move which places a new token on the field. Before you do this, you should
	 * check if the game isn't over yet, use checkWinner() for this.
	 * 
	 * @param column The column in which the token should be dropped
	 * @param player The Player which makes the move
	 * @return true if the move was successful
	 */
	public boolean makeMove(int column, int player) {
		if (!(field[column][0] == null)) {
			return false;
		}

		int row = 0;
		// go a row down if the lower row is empty
		while ((row + 1) < field[0].length && (field[column][row + 1] == null)) {
			row++;
		}
		field[column][row] = playerSymbol[player];
		return true;
	}

	/**
	 * Checks if someone has won
	 * 
	 * @return 0 : Game continues, 1 : Player 0 wins, 2 : Player 1 wins, 3 : Nobody
	 *         wins
	 */
	public int checkWinner() {
		// TODO Generate Method
		return -1;
	}

	/**
	 * Returns the number of columns of the field
	 * 
	 * @return
	 */
	public int getColumns() {
		return this.field.length;
	}

	/**
	 * Returns a String representation of the field
	 * 
	 * @return The field as a String
	 */
	public String toString() {
		// The return value
		String ret = "";

		for (int r = 0; r < field[0].length; r++) {
			for (int c = 0; c < field.length; c++) {
				if (field[c][r] == null) {
					ret = ret + "[]";
				} else {
					ret = ret + "[" + field[c][r] + "]";
				}
			}
			ret += "\n";
		}

		return ret;
	}
}
