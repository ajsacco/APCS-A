/**
 * Write a description of class Gibberish here.
 *
 * @author (Aidan Sacco)
 * @version (1011)
 */
public class Gibberish {
    private String sourceString;
    
    public Gibberish(){
        Template template = new Template();
        sourceString = template.getSourceString();
    }
    
    public String makeGibberish(WordList5000 wordList5000){
        int currentSourceIndex = 0;
        String resultString;
        int nextTagIndex = 0;
        String placeHolderString = "";
        while(currentSourceIndex < sourceString.length()){
            nextTagIndex = sourceString.indexOf("<", currentSourceIndex);
            if (nextTagIndex == -1) {
                resultString = sourceString.substring(currentSourceIndex);
                break;
            }else{
                placeHolderString = sourceString.indexOf(">", nextTagIndex+1) - 1);
                
            }
        }
        return "";
    }
}
