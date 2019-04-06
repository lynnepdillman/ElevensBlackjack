package BlackJack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.Scanner;

public class BlackJack
{
	//add in Player instance variable
	//add in Dealer instance variable
        private Dealer dealer;
        private Player player;

	public BlackJack()
	{
            dealer = new Dealer();
            player = new Player();
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
                boolean again = true;
                
                while(again == true)
                {
                    dealer.shuffle();
		
                    player.addCardToHand(dealer.deal());
                    dealer.addCardToHand(dealer.deal());
                    player.addCardToHand(dealer.deal());
                    dealer.addCardToHand(dealer.deal());

                    int playerTotal = player.getHandValue();
                    int dealerTotal = dealer.getHandValue();

                    out.println("\nPLAYER ");
                    out.println("Hand Value :: " + playerTotal );
                    out.println("Hand Size :: " + player.getHandSize() );
                    out.println("Cards in Hand :: " + player.toString() );
                    out.println("\nDEALER ");
                    out.println("Hand Value :: " + dealerTotal );
                    out.println("Hand Size :: " + dealer.getHandSize() );
                    out.println("Cards in Hand :: " + dealer.toString() );

                    if(playerTotal>21&&dealerTotal<=21)
                    {
                       out.println("\nDealer wins - Player busted!");
                       dealer.setWinCount(dealer.getWinCount() + 1);
                    }
                    else if(playerTotal<=21&&dealerTotal>21)
                    {
                       out.println("\nPlayer wins - Dealer busted!");
                       player.setWinCount(player.getWinCount() + 1);
                    }
                    else if(playerTotal>21&&dealerTotal>21){
                       out.println("Both players bust!");
                    }
                    else if(playerTotal<dealerTotal){
                       out.println("\nDealer has bigger hand value!");
                       dealer.setWinCount(dealer.getWinCount() + 1);
                    }
                    else{
                       out.println("\nPlayer has bigger hand value!");
                       player.setWinCount(player.getWinCount() + 1);
                    }
                    
                    System.out.print("Again? :: ");
                    
                    String i = keyboard.next();
                    if(i.equals("n"))
                        again = false;
                    keyboard.nextLine();
                }      
	}
	
	public static void main(String[] args)
	{
		BlackJack game = new BlackJack();
		game.playGame();
	}
}
