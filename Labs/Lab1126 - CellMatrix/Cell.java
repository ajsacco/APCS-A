
/**
 * @author (eettlin) 
 * @version (11 26 18)
 */
public class Cell
{
    // instance variables - replace the example below with your own
    private int x;
    private Cell[] neighbors;

    /**
     * Constructor for objects of class Cell
     */
    public Cell(int a)    {
        x = a;
        neighbors = new Cell[4];// North, East, South, and West only 
    }
    
    public Cell[] getNeighbors(){
        return neighbors;
    }
    
    public int getNeighborSum(){
        int sum = 0;
        for(int i = 0; i < neighbors.length; i++){
            sum += neighbors[i].getInt();
        }
        return sum;
    }
    
    public int getInt(){
        return x;
    }
}
