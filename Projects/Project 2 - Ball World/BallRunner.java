
/**
 * Write a description of class BallRunner here.
 *
 * @author (Aidan S)
 * @version (914)
 */
public class BallRunner
{
    public static void run(){
        BallWorld ballWorld = new BallWorld(500, 500);
        TGPoint startPoint = new TGPoint(0, 0);
        int radius = 25;
        BallBot[] ballBotArray = new BallBot[10];
        BallRunner ballRunner = new BallRunner();
        while(true){
            if(ballRunner.entranceClear(ballBotArray, startPoint)){
                int freeBallBotIndex = ballRunner.findFreeBallBotIndex(ballBotArray);
                if(freeBallBotIndex < ballBotArray.length){
                    BallBot ballBot = new BallBot(ballWorld, startPoint, (int)(Math.random()*360), radius);
                    ballBotArray[freeBallBotIndex] = ballBot;
                }
            }
            for(int i = 0; i < ballBotArray.length; i++){
                if(ballBotArray[i] != null){
                    if(ballBotArray[i].canMoveForward(ballWorld)){
                        ballBotArray[i].moveForward();
                    }else{
                        double currentHeading = ballBotArray[i].getHeading();
                        ballBotArray[i].setHeading((int)(Math.random()*360));
                    }
                }
            }
        }   
    }

    public double distanceBetweenPoints(TGPoint point1, TGPoint point2){
        double distance = Math.sqrt(Math.pow((point1.x-point2.x), 2)+Math.pow((point1.y-point2.y), 2));
        return distance;
    }

    public boolean entranceClear(BallBot[] ballBotArray, TGPoint entrancePoint){
        boolean clear = true;
        int ballsAtEntrance = 0;
        for(int i = 0; i < ballBotArray.length; i++){
            if(ballBotArray[i] != null){
                if(distanceBetweenPoints(ballBotArray[i].getPoint(), entrancePoint) < 2*ballBotArray[i].getRadius())
                    ballsAtEntrance++;
            }
        }
        if(ballsAtEntrance == 0) clear = true;
        else clear = false;
        return clear;
    }
    
    public BallBot ballBotToBounceOff(BallBot ballBot, BallBot[] ballBotArray){
        
    }
    
    public int findFreeBallBotIndex(BallBot[] ballBotArray){
        for(int i = 0; i < ballBotArray.length; i++){
            if(ballBotArray[i] == null){
                return i;
            }
       }
        return ballBotArray.length;
    }

    public int newHeading(int currentHeading){
        int heading;
        if(currentHeading >= 0 || currentHeading < 90){
            heading = (180-currentHeading);
        }else if(currentHeading >= 90 || currentHeading < 180){
            heading = (270-currentHeading);
        }else if(currentHeading >= 180 || currentHeading < 270){
            heading = (currentHeading + (2*4));
        }else{
            heading = (90-currentHeading);
        }
        return heading;
    }
    //=================================================================================================//
    public static void japan(){
        BallWorld ballWorld = new BallWorld(500, 300);
        TGPoint startPoint = new TGPoint(0, 0);
        double startHeading = 0;
        int radius = 25;
        BallBot ballBot = new BallBot(ballWorld, startPoint, startHeading, radius);
        ballBot.setColor(4);
    }

    public static void activity2(){
        BallWorld ballWorld = new BallWorld(500, 500);
        TGPoint startPoint = new TGPoint(0, 0);
        int radius = 25;
        BallBot[] ballBotArray = new BallBot[10];
        BallRunner ballRunner = new BallRunner();
        while(true){
            if(ballRunner.entranceClear(ballBotArray, startPoint)){
                int freeBallBotIndex = ballRunner.findFreeBallBotIndex(ballBotArray);
                if(freeBallBotIndex < ballBotArray.length){
                    BallBot ballBot = new BallBot(ballWorld, startPoint, (int)(Math.random()*360), radius);
                    ballBotArray[freeBallBotIndex] = ballBot;
                }
            }
            for(int i = 0; i < ballBotArray.length; i++){
                if(ballBotArray[i] != null){
                    if(ballBotArray[i].canMoveForward(ballWorld)){
                        ballBotArray[i].moveForward();
                    }else{
                        double currentHeading = ballBotArray[i].getHeading();
                        ballBotArray[i].setHeading((int)(Math.random()*360));
                    }
                }
            }
        }   
    }
    
    public static void activity1(){
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
            }
        }
    }
}