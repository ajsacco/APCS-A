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
    
    //  Load neighbor cells into the neighbors array
    public void loadNeighbors(){
        for(int r = 0; r < cells.length; r++){
            for(int c = 0; c < cells[r].length; c++){
                int i = 0;
                Cell[] neighbors = cells[r][c].getNeighbors();
                for(int n = 0; n < neighbors.length; n++){
                    if(this.hasNeighbor(n, r, c) != null){
                        neighbors[i] = this.hasNeighbor(n, r, c);
                        i++;
                    }
                }
            }
        }
    }
    
    public Cell hasNeighbor(int dir, int r, int c){
        Cell cell = null;
        try {
            switch(dir){
                case 0:
                    cell = cells[r-1][c];
                    break;
                case 1:
                    cell = cells[r][c+1];
                    break;
                case 2:
                    cell = cells[r+1][c];
                    break;
                case 3:
                    cell = cells[r][c-1];
                    break;
            }
        } catch(IndexOutOfBoundsException e){
        }
        
        return cell;
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
