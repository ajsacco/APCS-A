/**
 * Write a description of class Gibberish here.
 *
 * @author (Aidan Sacco)
 * @version (1015)
 */
public class Gibberish {
    private String sourceString;
    
    public Gibberish(){
        //import template and create new sourceString
        Template template = new Template();
        sourceString = template.getSourceString();
    }
    
    public String makeGibberish(WordList5000 wordList5000){
        //declare and initialize variables
        int currentSourceIndex = 0;
        String resultString = "";
        int nextTagIndex = 0;
        String placeHolderString = "";
        while(currentSourceIndex < sourceString.length()){
            //traverse sourceString and look for tag.
            nextTagIndex = sourceString.indexOf("<", currentSourceIndex);
            if (nextTagIndex == -1) {
                //if tag is not found, append the rest of sourceString to resultString and exit;
                resultString += sourceString.substring(currentSourceIndex);
                //resultString += ".";
                break;
            }else{
                //if tag is found, replace word inside tag with new word, then append the next section of sourceString to resultString until next tag is found
                resultString += sourceString.substring(currentSourceIndex, nextTagIndex);
                placeHolderString = sourceString.substring(nextTagIndex, sourceString.indexOf(">", nextTagIndex+1)-1);
                if (wordList5000.getRandomWordString(placeHolderString) != null) resultString += wordList5000.getRandomWordString(placeHolderString);
                currentSourceIndex = sourceString.indexOf("</>", nextTagIndex) + 3;
            }
        }
        return resultString;
    }
}
