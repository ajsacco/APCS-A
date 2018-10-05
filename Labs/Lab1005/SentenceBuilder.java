
/**
 * Write a description of class SentenceBuilder here.
 *
 * @author (Aidan Sacco)
 * @version (1005)
 */
public class SentenceBuilder
{ 
    private String[] nouns = {"puppy", "pizza", "snake", "doorbell", "girl", "building"};
    private String[] verbs = {"jumps", "runs", "flies", "eats", "makes", "wants", "sings", "skips"};
    private String[] adjectives = {"little", "silly", "funny", "stuffy", "shady", "hopeful", "graceful"};
    private String[] determiners = {"the", "my", "your", "his", "her", "our", "their"};
    private String[] adverbs = {"quickly", "happily", "smoothly", "often", "never"};
    private String[] prepositions = {"over", "near", "on top of", "behind", "next to", "inside of", "under"};

    public SentenceBuilder(){}
    
    public static void loadSentences(){
        SentenceBuilder sb = new SentenceBuilder();
        System.out.println(sb.getSentence());
    }

    public String getSentence(){
        return getNounPhrase() + " " + getVerbPhrase() + " " + getPrepositionalPhrase();
    }
    
    public String getNounPhrase(){
        return  getRandomDeterminer() + " " + getRandomAdjective() + " " + getRandomNoun();
    }
    public String getVerbPhrase(){
        return  getRandomAdverb() + " " + getRandomVerb();
    }
    public String getPrepositionalPhrase(){
        return  getRandomPreposition() + " " + getRandomDeterminer()
            + " " + getRandomAdjective() + " " + getRandomNoun();
    }
    
    public String getRandomNoun(){
        return nouns[(int) (Math.random()*nouns.length)];
    }
    public String getRandomVerb(){
        return verbs[(int) (Math.random()*verbs.length)];
    }
    public String getRandomAdjective(){
        return adjectives[(int) (Math.random()*adjectives.length)];
    }
    public String getRandomAdverb(){
        return adverbs[(int) (Math.random()*adverbs.length)];
    }
    public String getRandomDeterminer(){
        return determiners[(int) (Math.random()*determiners.length)];
    }
    public String getRandomPreposition(){
        return prepositions[(int) (Math.random()*prepositions.length)];
    }
}
