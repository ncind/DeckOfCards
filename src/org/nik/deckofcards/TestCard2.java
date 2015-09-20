package org.nik.deckofcards;

public class TestCard2 {
	
	public static void main(String[] args){
		Card a = new Card(Card.CLUB, 1);
		Card b = new Card(Card.DIAMOND, 1);
		Card c = new Card(Card.CLUB, 1);
		
		if(a.equals(b))
		{
			System.out.println(a + " is equal to " + b);
		}
		else
		{
			System.out.println(a + " is not equal to " + b);
		}
		
		if(a.equals(c))
		{
			System.out.println(a + " is equal to " + c);
		}
		else
		{
			System.out.println(a + " is not equal to " + c);
		}
	}

}
