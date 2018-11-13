
/**
 * Write a description of class Hand here.
 *
 * @author (Aidan Sacco)
 * @version (1108)
 */
import java.util.*;

public class Hand
{
    private ArrayList<Card> hand = new ArrayList<Card>(5);

    public Hand(){
        Deck deck = new Deck();
        for(int i = 0; i < 5; i++){
            hand.add(deck.getCard());
        }
    }

    public boolean sameSuit(){
        boolean ss = true;
        String suit = hand.get(0).suit;
        for(int i = 0; i < hand.size(); i++){
            if(suit != hand.get(i).suit){
                ss = false;
            }
        }
        return ss;
    }

    public int getPair(){
        int rank = -1;
        for(int i = 0; i < hand.size(); i++){
            Card c1 = hand.get(i);
            for(int e = 0; i < hand.size(); e++){
                Card c2 = hand.get(e);
                if(c1.rank == c2.rank){
                    rank = c1.rank;
                }
            }
        }
        
        int brank = -1;
        for(int i = 0; i < hand.size(); i++){
            Card c1 = hand.get(i);
            for(int e = 0; i < hand.size(); e++){
                Card c2 = hand.get(e);
                if(c1.rank != rank && c1.rank == c2.rank){
                    brank = c1.rank;
                }
            }
        }
        
        int occur = 0;
        if(brank == -1){
            for(int j = 0; j < hand.size(); j++){
                Card c3 = hand.get(j);
                if(c3.rank == rank){
                    occur++;
                }
            }
        } else {
            rank = -1;
        }
        
        if(occur != 2){
            rank = -1;
        }
        
        return rank;
    }
}
