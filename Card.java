package week06Assignment;


// Create Card class.
public class Card {

// Define the fields for Card.
	private int cardValue;
	private String cardSuit;
	private String cardName;
	
// Create the constructor for Card and initialize the parameters.
	public Card(int cardValue, String cardSuit, String cardName) {
		this.cardValue = cardValue;
		this.cardSuit = cardSuit;
		this.cardName = cardName;
	}

// Write a describe method that will print out the name of the card.
	public void describe() {
		System.out.println(cardName);
	}

// Include Getters and Setters for each of the fields.
	
	public int getCardValue() {
		return cardValue;
	}

	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}

	public String getCardSuit() {
		return cardSuit;
	}

	public void setCardSuit(String cardSuit) {
		this.cardSuit = cardSuit;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	

}