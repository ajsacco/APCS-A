
/**
 * Write a description of class Deck here.
 *
 * @author (Aidan Sacco)
 * @version (1108)
 */
import java.util.*;

public class Deck
{
    private ArrayList<Card> deck = new ArrayList<Card>(52);

    public Deck(){
        for(int i = 0; i < 52; i = i){
            Card c = makeRandomCard();
            boolean b = true;
            for(int e = 0; e < deck.size(); e++) {
                if(c.rank == deck.get(e).rank && c.suit.equals(deck.get(e).suit)){
                    b = false;
                }
                if(b){
                    deck.add(c);
                    i++;
                }
            }
        }
    }

    public Card makeRandomCard(){
        int rank = (int)(Math.random()*12) + 1;
        int suitNum = (int)(Math.random()*4);
        String suit = "";
        if(suitNum == 0){suit = "Heart";}
        else if (suitNum == 1){suit = "Diamond";}
        else if (suitNum == 2){suit = "Spade";}
        else if (suitNum == 3){suit = "Club";}
        Card c = new Card(rank, suit);
        return c;
    }

    public Card getCard(){
        return deck.get((int)(Math.random()*52));
    }
}
