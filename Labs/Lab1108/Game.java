
/**
 * Write a description of class Game here.
 *
 * @author (Aidan Sacco)
 * @version (1108)
 */
public class Game
{
    private Deck deck = new Deck();
    private Hand hand = new Hand();
    
    public Game(){
    }
    
    public Deck getDeck(){
        return deck;
    }
}
