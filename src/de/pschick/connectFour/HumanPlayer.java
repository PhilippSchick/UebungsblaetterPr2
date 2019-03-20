/**
 * 
 */
package de.pschick.connectFour;

import java.util.InputMismatchException;
import java.util.Scanner;

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
	public void moveBehavior() {
		Scanner scan = new Scanner(System.in);
		int column = -1;

		do {
			System.out.println("Please insert a column");
			try {
				column = scan.nextInt();

				// throw Exception if input is out of bound
				if (!(column >= 0 && column < field.getColumns())) {
					throw new InputMismatchException();
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input!");
				moveBehavior();
				return;
			}

		} while (!field.makeMove(column, playerNumber));
	}

}
