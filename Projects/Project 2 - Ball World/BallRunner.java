
/**
 * Write a description of class BallRunner here.
 *
 * @author (Aidan S)
 * @version (914)
 */
public class BallRunner
{
    public static void run(){
        //declare and init
        int xPixels = 500;
        int yPixels = 500;
        BallWorld ballWorld = new BallWorld(xPixels, yPixels);
        TGPoint startPoint = new TGPoint(0, 0);
        int radius = 25;
        BallBot[] ballBotArray = new BallBot[1];
        BallRunner ballRunner = new BallRunner();
        //game loop
        while(true){
            //spawn new BallBots if entrance is clear and array is not full
            if(ballRunner.entranceClear(ballBotArray, startPoint)){
                int freeBallBotIndex = ballRunner.findFreeBallBotIndex(ballBotArray);
                if(freeBallBotIndex < ballBotArray.length){
                    BallBot ballBot = new BallBot(ballWorld, startPoint, (int)(Math.random()*360), radius);
                    ballBotArray[freeBallBotIndex] = ballBot;
                }
            }
            //move each BallBot forward one step and change direction if colliding with wall or other BallBot
            for(int i = 0; i < ballBotArray.length; i++){
                if(ballBotArray[i] != null){
                    if(ballBotArray[i].canMoveForward(ballWorld)){
                        if(ballRunner.ballBotToBounceOff(ballBotArray[i], ballBotArray) == null){
                            ballBotArray[i].moveForward();
                        }else{
                            double currentHeading = ballBotArray[i].getHeading();
                            ballBotArray[i].setHeading((int)(Math.random()*360));
                        }
                    }else{
                        int currentHeading = (int) ballBotArray[i].getHeading();
                        ballBotArray[i].setHeading(newHeading(currentHeading));
                    }
                }
            }
        }   
    }
    
    //calculate distance between two points (pythagorean theorem)
    public double distanceBetweenPoints(TGPoint point1, TGPoint point2){
        double distance = Math.sqrt(Math.pow((point1.x-point2.x), 2)+Math.pow((point1.y-point2.y), 2));
        return distance;
    }
    
    //check if there are no BallBots near startingPoint
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
    
    //check whether ballBot is touching another BallBot
    public BallBot ballBotToBounceOff(BallBot ballBot, BallBot[] ballBotArray){
        TGPoint p1 = ballBot.getPoint();
        TGPoint p2 = ballBot.forwardPoint();
        for(int i = 0; i < ballBotArray.length; i++){
            BallBot otherBallBot = ballBotArray[i];
            if(otherBallBot != null && otherBallBot != ballBot){
                double currentDistance = distanceBetweenPoints(p1, otherBallBot.getPoint());
                if(currentDistance <= (ballBot.getRadius() + otherBallBot.getRadius())){
                    double nextDistance = distanceBetweenPoints(p2, otherBallBot.getPoint());
                    if(nextDistance <= currentDistance){
                        return otherBallBot;
                    }
                }
            }
        }
        return null;
    }

    //find next empty index in ballBotArray, otherwise return length of ballBotArray
    public int findFreeBallBotIndex(BallBot[] ballBotArray){
        for(int i = 0; i < ballBotArray.length; i++){
            if(ballBotArray[i] == null){
                return i;
            }
        }
        return ballBotArray.length;
    }

    //custom method I am working on which changes direction of ballBot based on the angle it hits the surface
    //(not working at the moment)
    public static int newHeading(int currentHeading){
        int newHeading;
        if(currentHeading >= 0 && currentHeading <= 90){
            newHeading = 180 - currentHeading;
        }else if(currentHeading >= 90 && currentHeading < 360){
            newHeading = 360 - currentHeading;
        }else if(currentHeading >= 180 && currentHeading < 270){
            newHeading = 90 - currentHeading;
        }else if(currentHeading >= 270 && currentHeading < 360){
            newHeading = 270 - currentHeading;
        }else{
            newHeading = 0;
        }
        return newHeading;
    }
    //=================================================================================================//
    public static void activity4(){
        //declare and init
        BallWorld ballWorld = new BallWorld(500, 500);
        TGPoint startPoint = new TGPoint(0, 0);
        int radius = 25;
        BallBot[] ballBotArray = new BallBot[1];
        BallRunner ballRunner = new BallRunner();
        //game loop
        while(true){
            //generate a new ball if entrance is clear and there is room in ballBotArray
            if(ballRunner.entranceClear(ballBotArray, startPoint)){
                int freeBallBotIndex = ballRunner.findFreeBallBotIndex(ballBotArray);
                if(freeBallBotIndex < ballBotArray.length){
                    BallBot ballBot = new BallBot(ballWorld, startPoint, (int)(Math.random()*360), radius);
                    ballBotArray[freeBallBotIndex] = ballBot;
                }
            }
            //traverse the array and run this code for each ballBot
            for(int i = 0; i < ballBotArray.length; i++){
                if(ballBotArray[i] != null){
                    if(ballBotArray[i].canMoveForward(ballWorld)){
                        //check if ballBot is colliding with another ball, if so then change direction of ballBot
                        if(ballRunner.ballBotToBounceOff(ballBotArray[i], ballBotArray) == null){
                            ballBotArray[i].moveForward();
                        }else{
                            double currentHeading = ballBotArray[i].getHeading();
                            ballBotArray[i].setHeading((int)(Math.random()*360));
                        }
                    }else{
                        //if ballBot hits wall, change direction
                        int currentHeading = (int) ballBotArray[i].getHeading();
                        ballBotArray[i].setHeading((int)(Math.random()*360));
                    }
                }
            }
        }   
    }

    
    public static void japan(){
        //just a method that makes a japanese flag, please ignore
        BallWorld ballWorld = new BallWorld(500, 300);
        TGPoint startPoint = new TGPoint(0, 0);
        double startHeading = 0;
        int radius = 45;
        BallBot ballBot = new BallBot(ballWorld, startPoint, startHeading, radius);
        ballBot.setColor(4);
    }

    public static void activity3(){
        //declare and init
        BallWorld ballWorld = new BallWorld(500, 500);
        TGPoint startPoint = new TGPoint(0, 0);
        int radius = 25;
        BallBot[] ballBotArray = new BallBot[10];
        BallRunner ballRunner = new BallRunner();
        //game loop
        while(true){
            //if there is room in ballBotArray, create a new ballBot
            if(ballRunner.entranceClear(ballBotArray, startPoint)){
                int freeBallBotIndex = ballRunner.findFreeBallBotIndex(ballBotArray);
                if(freeBallBotIndex < ballBotArray.length){
                    BallBot ballBot = new BallBot(ballWorld, startPoint, (int)(Math.random()*360), radius);
                    ballBotArray[freeBallBotIndex] = ballBot;
                }
            }
            //traverse ballBotArray and run this code for every object that is not null
            for(int i = 0; i < ballBotArray.length; i++){
                if(ballBotArray[i] != null){
                    //move forward if possible, otherwise change direction
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

    public static void activity2(){
        //declare and init
        BallWorld ballWorld = new BallWorld(500, 500);
        TGPoint startPoint = new TGPoint(0, 0);
        int radius = 25;
        BallBot[] ballBotArray = new BallBot[10];
        BallRunner ballRunner = new BallRunner();
        //game loop
        while(true){
            //if there is room in ballBotArray, create a new ballBot
            if(ballRunner.entranceClear(ballBotArray, startPoint)){
                int freeBallBotIndex = ballRunner.findFreeBallBotIndex(ballBotArray);
                if(freeBallBotIndex < ballBotArray.length){
                    BallBot ballBot = new BallBot(ballWorld, startPoint, (int)(Math.random()*360), radius);
                    ballBotArray[freeBallBotIndex] = ballBot;
                }
            }
            //traverse ballBotArray and run this code for every object that is not null
            for(int i = 0; i < ballBotArray.length; i++){
                if(ballBotArray[i] != null){
                    //move forward if possible, otherwise change direction
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
        //declare and init variables
        BallWorld ballWorld = new BallWorld(500, 500);
        TGPoint startPoint = new TGPoint(0, 0);
        double startHeading = 30;
        int radius = 25;
        BallBot ballBot = new BallBot(ballWorld, startPoint, startHeading, radius);
        //game loop
        while(true){
            //move forward if possible, otherwise change direction
            if(ballBot.canMoveForward(ballWorld)){
                ballBot.moveForward();
            }else{
                double currentHeading = ballBot.getHeading();
                ballBot.setHeading((int)(Math.random()*360));
            }
        }
    }
}