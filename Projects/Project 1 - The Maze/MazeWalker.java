/**
 * Write a description of class MazeWalker here.
 *
 * @author (Aidan)
 * @version (830)
 */

import javax.swing.JOptionPane;

public class MazeWalker
{
    public MazeWalker(){
    }

    public static void run(){
        int e = Integer.parseInt(JOptionPane.showInputDialog("Enter a number 0-4"));
        Maze maze = new Maze(e);
        MazeWalker mazeWalker = new MazeWalker();
        mazeWalker.walkMaze(maze, maze.getMazeBot());
    }

    public void walkMaze(Maze maze, MazeBot mazeBot){
        while(mazeBot.didNotReachGoal()){
            if(mazeBot.canMoveForward()){
                mazeBot.moveForward();
                if(!mazeBot.canMoveForward()){
                        mazeBot.turnRight();
                        if(!mazeBot.canMoveForward()){
                            mazeBot.turnLeft();
                        }
                    }else{
                        mazeBot.setBreadCrumbObject(mazeBot);
                    }
                }else{
                    MazeBot mb = (MazeBot) mazeBot.getBreadCrumbObject();
                    if(mb == null){
                        mazeBot.turnLeft();
                        mazeBot.turnLeft();
                        mazeBot.moveForward();
                        mazeBot.moveForward();
                        mazeBot.turnRight();
                    }else{
                        mazeBot.turnRight();
                        mazeBot.setBreadCrumbObject(mazeBot);
                        if(!mazeBot.canMoveForward()){
                            mazeBot.turnLeft();
                            mazeBot.turnLeft();
                        }
                    }
                }
            }
            mazeBot.signalSuccess();
        }
    }
