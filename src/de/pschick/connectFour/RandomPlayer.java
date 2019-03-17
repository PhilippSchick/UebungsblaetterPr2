/**
 * 
 */
package de.pschick.connectFour;

/**
 * @author Philipp Schick
 * @version 1.00, 13.03.2019
 * 
 *          RandomPlayer is an AI which does moves based on pseudo random
 *          numbers
 */
public class RandomPlayer extends Player {

	/**
	 * Creates an instance of RandomPlayer and sets the PlayerName to Computer and
	 * the current Field
	 *
	 * @param field The current Field
	 */
	public RandomPlayer(Field field) {
		this.playerName = "Computer";
		this.field = field;
	}

	@Override
	public void moveBehavior() {
		// Random column
		int ranColumn;

		do {
			// TODO Qualität des Zufalls fraglich
			ranColumn = (int) Math.random() * (field.getColumns() + 1);
		} while (!field.makeMove(ranColumn, playerNumber));
	}

}
