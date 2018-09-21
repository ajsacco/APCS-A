
/**
 * Write a description of class BallRunner here.
 *
 * @author (Aidan S)
 * @version (914)
 */
public class BallRunner
{
    public static void main(){
        BallWorld ballWorld = new BallWorld(500, 500);
        TGPoint startPoint = new TGPoint(0, 0);
    }
    public static void japan(){
        BallWorld ballWorld = new BallWorld(500, 300);
        TGPoint startPoint = new TGPoint(0, 0);
        double startHeading = 0;
        int radius = 25;
        BallBot ballBot = new BallBot(ballWorld, startPoint, startHeading, radius);
        ballBot.setColor(4);
    }
    public static void run(){
        BallWorld ballWorld = new BallWorld(500, 500);
        TGPoint startPoint = new TGPoint(0, 0);
        double startHeading = 0;
        int radius = 25;
        BallBot ballBot = new BallBot(ballWorld, startPoint, startHeading, radius);

        while(true){
            if(ballBot.canMoveForward(ballWorld)){
                ballBot.moveForward();
            }else{
                double currentHeading = ballBot.getHeading();
                ballBot.setHeading(currentHeading + 90);
                /*if(currentHeading >= 0 || currentHeading < 90){
                ballBot.setHeading((double) (180-currentHeading));
                }else if(currentHeading >= 90 || currentHeading < 180){
                ballBot.setHeading((double) (270-currentHeading));
                }else if(currentHeading >= 180 || currentHeading < 270){
                ballBot.setHeading((double) (currentHeading + (2*)));
                }else{
                ballBot.setHeading((double) (90-currentHeading));
                }*/
            }
        }
    }
    public int findFreeBallBotIndex(BallBot[] ballBotArray){
        for(int i = 0; i < ballBotArray.length; i++){
            if(ballBotArray[i] == null){
                return i;
            }
        }
        return ballBotArray.length;
    }
}