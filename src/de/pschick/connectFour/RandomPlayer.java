/**
 * 
 */
package de.pschick.connectFour;

/**
 * @author Philipp Schick
 * @version 1.00, 13.03.2019
 *
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
	public void makeMove() {
		// TODO Auto-generated method stub

	}

}
