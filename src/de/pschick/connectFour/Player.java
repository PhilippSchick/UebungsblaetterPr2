/**
 * 
 */
package de.pschick.connectFour;

/**
 * @author Philipp Schick
 * @version 1.00, 13.03.2019
 *
 *          The Blueprint for a Player
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
	 * The number of the player
	 */
	protected Integer playerNumber;

	/**
	 * Returns the name of the player
	 * 
	 * @return The PlayerName
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * The Player makes a move. Throws a {@link IllegalStateException} if the player
	 * number isn't set yet.
	 */
	public void makeMove() {
		if (playerNumber == null) {
			throw new IllegalStateException("Player number isn't set yet!");
		}

		moveBehavior();
	}

	/**
	 * Defines the behavior of a player if he makes a move
	 */
	protected abstract void moveBehavior();

	/**
	 * Sets the number of the player. Attention! Throws a
	 * {@link IllegalStateException} if the number is already set. Throws a
	 * {@link IllegalArgumentException} if the argument isn't a '0' or a '1'
	 * 
	 * @param pNumber The player number
	 */
	public void setPlayerNumber(int pNumber) {
		if (playerNumber == null) {
			if (pNumber == 1 || pNumber == 0) {
				this.playerNumber = pNumber;
			} else {
				throw new IllegalArgumentException("The player number has to be a '0' or a '1'!");
			}
		} else {
			throw new IllegalStateException("Number already set!");
		}
	}

	/**
	 * Sets the Player name
	 * 
	 * @param playerName the Player name to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

}
