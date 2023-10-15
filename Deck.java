package week06Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Create Deck class.
public class Deck {

	private List<Card> deckOfCards = new ArrayList<>();

// Create the constructor for Deck that initializes the deck by creating and adding all 52 cards to it.
	public Deck() {

// Create two arrays of strings representing the suits and card values.
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] numbers = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
				"King", "Ace" };

// Use nested for loops to iterate over each suit and number to create a deck of cards with a value, suit, and name.
		for (String suit : suits) {
			int value = 2;
			for (String number : numbers) {
				String cardName = number + " of " + suit;
				deckOfCards.add(new Card(value, suit, cardName));
				value++;
			}
		}
	}

// Create a shuffle method that reorders the cards by calling the shuffle method on Collections.
	public void shuffle() {
		Collections.shuffle(deckOfCards);
	}

// Create a draw method that returns the first card at index 0.
	public Card draw() {
		Card card = deckOfCards.remove(0);
		return card;
	}

}
