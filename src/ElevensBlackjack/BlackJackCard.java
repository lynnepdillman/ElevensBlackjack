package BlackJack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class BlackJackCard extends Card
{
  	public BlackJackCard()
        {
            super(1, "DIAMONDS");
        }

        public BlackJackCard(int f, String s)
        {
            super(f, s);
        }

  	//accessors
	public int getValue()
	{
            if( getFace() == 1 )
                    return 11;
            if( getFace() >= 10 )
                    return 10;
            return getFace();
	}

        //toString
        public String toString()
        {
          return super.toString() + " " + getValue();
        }
  	
 }
