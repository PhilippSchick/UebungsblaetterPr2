/**
 * 
 */
package de.pschick.connectFour;

/**
 * @author Philipp Schick
 * @version 1.00, 13.03.2019
 *
 * The Blueprint for a Player
 */
public abstract class Player {
	/**
	 * The name of the player
	 */
	protected String playerName;
	
	/**
	 * The Field to Play on
	 */
	protected Field field;
	
	/**
	 * Returns the name of the player
	 * 
	 * @return The PlayerName
	 */
	public String getPlayerName() {
		return playerName;
	}
	
	/**
	 * The Player makes a move 
	 */
	public abstract void makeMove();
	
	
}
