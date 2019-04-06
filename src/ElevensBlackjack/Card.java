package BlackJack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 


public abstract class Card
{
    public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
                    "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		//String suit
		//int face
    private String suit;
    private int face;

    //constructors
    public Card(int f, String s)
    {
        suit = s;
        face = f;
    }

    // modifiers
    //set methods
    public void setSuit(String s)
    {
        suit = s;
    }
  
    public void setFace(int f)
    {
        face = f;
    }

    //accessors
    //get methods
    public String getSuit()
    {
        return suit;
    }

    public int getFace()
    {
        return face;
    }

    //toString
    public String toString()
    {
        return FACES[face] + " of " + suit;
    }

    public abstract int getValue();

    public boolean equals(BlackJackCard otherCard)
    {
        return otherCard.getSuit().equals(this.getSuit()) && otherCard.getFace() == this.getFace();
    }	
}
