package org.nik.deckofcards;

public class DeckOfCards {

	public static final int NCARDS = 52;

	private Card[] deckOfCards; // Used to store the 52 cards

	private int currentCard; // This is the index of the current card that is
								// being dealt.

	// the constructor method makes the 52 cards in the deck

	public DeckOfCards() {
		// First create the array
		deckOfCards = new Card[NCARDS];

		// Initialize all the 52 cards in the new Card Array
		int i = 0;
		for (int suit = Card.DIAMOND; suit <= Card.SPADE; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				deckOfCards[i++] = new Card(suit, rank); // Starts with an index
															// 1
			}
		}

		currentCard = 0; // This is to say that it is a fresh deck of cards

	}

	// Shuffling Deck of Cards
	// Order of the cards in the deck becomes random
	// After Shuffling we start dealing from the top of the deck(currentCard is
	// reset to 0)

	// Input n is the number of exchange operations performed.
	public void shuffle(int n) {
		int i, j, k;
		
		for(k=0; k<n; k++){
			
			i = (int)(NCARDS*Math.random());
			j = (int)(NCARDS*Math.random());
			
			// Swap these randomly picked cards (Sort)
			Card tmp = deckOfCards[i];
			deckOfCards[i] = deckOfCards[j];
			deckOfCards[j] = tmp;
		}
		
		currentCard = 0; // reset current card to deal

	}

	// When a card is dealt from the deck (of cards), the same card cannot be
	// dealt again !!!
	public Card deal() {

		if (currentCard < NCARDS) {
			return (deckOfCards[currentCard++]);
		} else {
			System.out.println("Out of Cards Error");
			return null; // Error
		}
	}

	public String toString() {
		String s = "";
		int k;

		k = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 13; j++) {
				s += (deckOfCards[k++] + " ");

			}
			s += "\n";
		}

		return s;
	}

}
