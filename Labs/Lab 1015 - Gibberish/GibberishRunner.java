
/**
 * Write a description of class GibberishRunner here.
 *
 * @author (Aidan Sacco)
 * @version (1015)
 */
import javax.swing.JOptionPane;

public class GibberishRunner
{
    public static void main(){
        //make new Gibberish object and use it to make a gibberishString, then print
        WordList5000 wordList5000 = new WordList5000();
        Gibberish gibberish = new Gibberish();
        String gibberishString = gibberish.makeGibberish(wordList5000);
        System.out.println(gibberishString + ".");

    }

    public static void mainWithGUI(){
        //same as above method, except this is modified to use JOptionPane for a pretty fancy (and easy) GUI :D
        boolean e = true;
        while(e){
            int b = JOptionPane.showConfirmDialog(null, "New String?", "New String?", JOptionPane.YES_NO_OPTION);
            if (b != 0) e = false;
            else{
                //make new Gibberish object and use it to make a gibberishString, then print
                WordList5000 wordList5000 = new WordList5000();
                Gibberish gibberish = new Gibberish();
                String gibberishString = gibberish.makeGibberish(wordList5000);
                JOptionPane.showMessageDialog(null, gibberishString);
            }
        }
    }
}
