package week06Assignment;

import java.util.ArrayList;
import java.util.List;

// Create Player class.
public class Player {

// Define the fields for Player.
	private List<Card> hand = new ArrayList<>();
	private int score;
	private String playerName;

// Create the constructor for Player that initializes new instances of Player with a score of 0.
	public Player() {
		this.score = 0;

	}

// Create a describe method that prints out the Player's name, current score, and the cards in their hand.
// *** I did not end up using this code, but I left it in since it was requested in the instructions.
	public void describe() {
		System.out.println(playerName + "'s score is now: " + score);
		System.out.println("And their cards are:");
		for (Card card : hand) {
			card.describe();
		}
	}

// Create a flip method that removes and returns the top card of the hand. It also prints out the player's name and the flipped card.
	public Card flip() {
		Card topCard = hand.remove(0);
		System.out.print(playerName + " flips a ");
		topCard.describe();
		return topCard;
	}

// Create a draw method that takes a card from the deck using the draw method and adds it to a player's hand.
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}

// Create and incrementScore method increases a player's score by 1.
	public void incrementScore() {
		score++;
	}

// Create Getters and Setters for the Player class.
	
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

}
