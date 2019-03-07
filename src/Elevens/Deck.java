package Elevens;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck 
{
    public static final int NUM_CARDS_DECK = 52; 
    public static final int NUM_CARDS_SUIT = 13; 
    public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");

    private List<Card> cards;
    private int top;
    
    public Deck() {
        cards = new ArrayList<Card>(); 
        top = NUM_CARDS_DECK - 1; 
        for (String m: SUITS){
            for (int i = 1; i <= NUM_CARDS_SUIT; i++){
                cards.add(new BlackJackCard(m, i));
            }
        }
    }
    
    public String dealCard(){
        return cards.get(top--).toString();
    }
    
    public void shuffle(){
        Collections.shuffle(cards);
        top = NUM_CARDS_DECK - 1;
    }
}
