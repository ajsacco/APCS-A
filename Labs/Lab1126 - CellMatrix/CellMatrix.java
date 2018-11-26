
/**
 * 
 * CellMatrix
 * @author (eettlin) 
 * @version (11-26-18)
 */
public class CellMatrix{
    /**
     * +++++++++++++++++++++Instance variables
     */
    
    private Cell[][] cells;
    private Cell[] neighbors = new Cell[4];

    /**
     * +++++++++++++++++++++Constructor for objects of class NumberMatrix
     */
    public CellMatrix(int a, int b){
       cells = new Cell[a][b];
       
    }
    
    /**
     * ++++++++++++++  methods
     */
    
    //  Load neighbor cells into the neighbors array
    public void loadNeighbors(int row, int col){
        if(row >= 1 && row < cells.length - 1 && col >= 1 && col < cells[row].length - 1){
            neighbors[0] = //North
            neighbors[1] = //East
            neighbors[2] = //South
            neighbors[3] = //West
        } else if(row == 0 && col >= 1 && col < cells[row].length - 1){
            neighbors[0] = //North
            neighbors[1] = //East
            neighbors[2] = //South
            neighbors[3] = //West
        }
    }
    
    /**
     * +++++++++++++++++++++++++++++++++++++++++++++++++++++++methods
     */
    //Print each row and column of nums to the console
    public void printMatrix(){
       for(int r = 0; r < cells.length; r++){
          for(int c = 0; c < cells[r].length; c++){
             System.out.print(cells[r][c].getInt() + ", ");
          }
          System.out.println();
       }
    }
    //  load nums with random with numbers between 1 and 10 inclusive
    public void loadMatrix(){
       for(int r = 0; r < cells.length; r++){
          for(int c = 0; c < cells[r].length; c++){
             cells[r][c] = new Cell((int)(Math.random()*10) + 1);
          }
       }
    }
    //  Findis the sum of each of the neighbors and returns the greatest 
    // neighbor value
    public int getGreatestNeighbors(){
       
        return 0;
    }
}
