/**
 * 
 */
package de.pschick.connectFour;

/**
 * @author Philipp Schick
 * @version 1.00, 13.03.2019
 *
 */
public class HumanPlayer extends Player {

	/**
	 * Creates a new instance of HumanPlayer and sets the playerName to 'Human' and
	 * sets the current field
	 * 
	 * @param field The current Field
	 */
	public HumanPlayer(Field field) {
		this.playerName = "Human";
		this.field = field;
	}

	@Override
	public void makeMove() {
		// TODO Auto-generated method stub

	}

}
