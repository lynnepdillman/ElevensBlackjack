/package BlackJack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 


//define Dealer class here
public class Dealer extends AbstractPlayer
{
	//instance variable - Deck 
        Deck cards = new Deck();

	//constructors
        public Dealer()
        {
            super();
        }

	//method to shuffle
        public void shuffle()
        {
            cards.shuffle();
        }

	//method to deal a card
        public Card deal()
        {
            return cards.nextCard();
        }

	//hit method goes here
        public boolean hit()
        {
            if(getHandValue() < 17)
            {
                addCardToHand(deal());
                return true;
            }
            
            return false;
        }
}
