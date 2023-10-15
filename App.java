package week06Assignment;

import java.util.Scanner;

// Create an App class with a main method.
public class App {

	public static void main(String[] args) {

// Instantiate a new scanner.
		Scanner scanner = new Scanner(System.in);

// Instantiate players; use scanner to get names from user input and use set method to assign names to players.
		Player player1 = new Player();
		System.out.print("Player 1, what is your name: ");
		String player1Name = scanner.nextLine();
		player1.setPlayerName(player1Name);
		System.out.println("Good Luck, " + player1Name + "!\n");

		Player player2 = new Player();
		System.out.print("Player 2, what is your name: ");
		String player2Name = scanner.nextLine();
		player2.setPlayerName(player2Name);
		System.out.println("Good Luck, " + player2Name + "!\n");

		System.out.println("Okay " + player1Name + " and " + player2Name + ", it's time to battle!\n");

// Instantiate a new deck and shuffle it.
		Deck deck = new Deck();
		deck.shuffle();

// Use a for loop to add cards to each player's hand using the draw method.
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else
				player2.draw(deck);
		}

		System.out.println("*******************************************\n");

// Use a for loop to flip the first card in each player's hand and if else statements to compare their values, and increment the score 
// and print out the name of the winner or print out tie if the values are the same.
		for (int round = 0; round < 26; round++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			if (player1Card.getCardValue() > player2Card.getCardValue()) {
				System.out.println("*** " + player1Name + " gets a point! ***");
				player1.incrementScore();
			} else if (player1Card.getCardValue() < player2Card.getCardValue()) {
				System.out.println("*** " + player2Name + " gets a point! ***");
				player2.incrementScore();
			} else {
				System.out.println("*** It's a tie! - no points awarded. ***");
			}
			
// Print out the current score of each player using the getScore method.
			System.out.println("Current Score: \n" + player1Name + " - " + player1.getScore() + "\n" + player2Name
					+ " - " + player2.getScore());
			System.out.println("==================================\n");
		}
		
// After the for loop is done iterating, print out the scores of each player.
		System.out.println("The Battle is over!  \nThe final scores are: \n" + player1Name + " - " + player1.getScore()
				+ "\n" + player2Name + " - " + player2.getScore() + "\nTies - "
				+ (26 - (player1.getScore() + player2.getScore())));

// Use an else if statement to compare the scores and print out the winner or that it's a tie if the scores are the same.
		if (player1.getScore() > player2.getScore()) {
			System.out.println("\n***** " + player1Name + " reigns supreme! *****");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("\n***** " + player2Name + " reigns supreme! *****");
		} else {
			System.out.println("\n***** It's a draw! Both players go home in shame. *****");
		}

		scanner.close();
	}

}