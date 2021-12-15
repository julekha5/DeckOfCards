package com.bridgelabz.deckofcards;

import java.util.Arrays;

/*
 * Deck Of Cards Program For Workshop2
 */
public class DeckOfCards {
	String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	String[] decksCard= new String[52];

	/*
	 * Create deck method
	 */
	public void createDeck() {
		int x = 0;
		for (String suit : suits) {
			for (String rank : ranks) {
				decksCard[x] = suit + " of " + rank;
				x++;
			}
		}
	}
	/*
	 * Main
	 */
	public static void main(String[] args) {
		DeckOfCards cardsObj = new DeckOfCards();
		System.out.println("Welcome to Deck Of Cards Game");
		cardsObj.createDeck();
	}

}
