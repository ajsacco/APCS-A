
/**
 * Write a description of class GibberishRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GibberishRunner
{
    public static void main(){
        WordList5000 wordList5000 = new WordList5000();
        Gibberish gibberish = new Gibberish();
        String gibberishString = gibberish.makeGibberish(wordList5000);
        System.out.println(gibberishString);
    }
}
