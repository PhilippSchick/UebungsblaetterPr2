/**
 * 
 */
package de.pschick.connectFour;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Philipp Schick
 * @version 1.00, 13.03.2019
 *
 */
public class Starter {

	/**
	 * The first started Method
	 * 
	 * @param args The start parameter
	 */
	public static void main(String[] args) {
		// The Index of the player Array
		int p = 0;

		// The Field
		Field field = new Field();

		// The Players
		Player[] player = new Player[2];

		System.out.println("Choose Modus \n" + "1 - Human vs. AI\n" + "2 - Human vs. Human\n" + "3 - AI vs. AI");

		// The input
		int in = 0;
		// loop variable
		boolean loop = false;
		// The scanner
		Scanner scan = new Scanner(System.in);

		do {
			try {
				in = scan.nextInt();
				loop = false;
				// throw Exception if input is out of bound
				if (!(in > 0 && in < 4)) {
					throw new InputMismatchException();
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please insert a valid value");
				loop = true;
			}
		} while (loop);

		switch (in) {
		case 1: // Human vs. AI
			Player com = new RandomPlayer(field);
			Player human = new HumanPlayer(field);

			// Randomly assign player numbers
			int ranNum = new Random().nextInt(2);
			player[ranNum] = human;
			human.setPlayerNumber(ranNum);

			if (ranNum == 0) {
				player[1] = com;
				com.setPlayerNumber(1);
			} else {
				player[0] = com;
				com.setPlayerNumber(0);
			}
			break;
		case 2: // Human vs. Human
			player[0] = new HumanPlayer(field);
			player[0].setPlayerNumber(0);
			player[0].setPlayerName("Player 1");
			player[1] = new HumanPlayer(field);
			player[1].setPlayerNumber(1);
			player[1].setPlayerName("Player 2");
			break;
		case 3: // AI vs. AI
			player[0] = new RandomPlayer(field);
			player[0].setPlayerNumber(0);
			player[0].setPlayerName("Player 1");
			player[1] = new RandomPlayer(field);
			player[1].setPlayerNumber(1);
			player[1].setPlayerName("Player 2");
			break;
		}

		// Show Field
		System.out.println(field.toString());

		// Game loop
		while (true) {
			System.out.println(player[p].playerName + "'s turn");
			player[p].makeMove();
			System.out.println(field.toString());

			int winner = field.checkWinner();
			switch (winner) {
			case 0:
				System.out.println("Field is full - no winner");
				return;
			case 1:
				System.out.println(player[0].getPlayerName() + " wins!");
				return;
			case 2:
				System.out.println(player[1].getPlayerName() + " wins!");
				return;
			case 3: // Game continues
				break;
			}

			// toggle p
			if (p == 0) {
				p = 1;
			} else {
				p = 0;
			}
		}

	}

}
