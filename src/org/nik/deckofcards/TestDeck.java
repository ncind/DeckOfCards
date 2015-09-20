package org.nik.deckofcards;

public class TestDeck {

	public static void main(String[] args){
		
		DeckOfCards a;
		a = new DeckOfCards();
		System.out.println(a); // What a new deck looks like 
		
		System.out.println("Shuffling Cards..");
		a.shuffle(1000);
		System.out.println(a); // Deck after shuffling
		
		Card b;
		b = a.deal();
		System.out.println("Deal a card " + b);
		
		b = a.deal();
		System.out.println("Deal a card " + b);
		
		b = a.deal();
		System.out.println("Deal a card " + b);
		
		b = a.deal();
		System.out.println("Deal a card " + b);
		
		b = a.deal();
		System.out.println("Deal a card " + b);
		
		
	}
	
	
}
