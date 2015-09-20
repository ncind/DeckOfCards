package org.nik.deckofcards;

public class Card {

	public static final int SPADE = 4;
	public static final int HEART = 3;
	public static final int CLUB = 2;
	public static final int DIAMOND = 1;

	private static final String[] Suit = { "*", "d", "c", "h", "s" }; // diamond,
																		// club,
																		// heart,
																		// spade
																		// (Use
																		// of *
																		// is to
																		// skip
																		// a[0])
	private static final String[] Rank = { "*", "*", "2", "3", "4", "5", "6",
			"7", "8", "9", "10", "J", "Q", "K", "A" }; // User of * is to skip
														// a[0], a[1]

	private byte cardSuit;
	private byte cardRank;

	// Always define a constructor method, And define the ones that will only be
	// used
	public Card(int suit, int rank) {

		if (rank == 1) // Ace
		{
			this.cardRank = 14;
		} else {
			this.cardRank = (byte) rank;
		}

		this.cardRank = (byte) rank;

		this.cardSuit = (byte) suit;
	}

	// Byte is casted to Int (Without any explicitly casting. Check this out)
	public int suit() {
		return this.cardSuit;
	}

	public String suitStr() {
		return Suit[this.cardSuit];

	}

	public int rank() {
		return this.cardRank;
	}

	public String rantStr() {
		return Rank[this.cardRank];
	}

	// Implement the toString method()
	public String toString() {
		return (Rank[this.cardRank] + Suit[this.cardSuit]);
	}
	
	// Implement the equals method
	public boolean equals(Card x)
	{
		if(this.cardSuit == x.cardSuit && this.cardRank == x.cardRank)
		{
			return true;
		}
		else
		{
			return false;	
		}
	}

}
