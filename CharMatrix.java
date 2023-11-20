
/**
 * @ Alyssa Xu
 */
public class CharMatrix
{
    private char [][] grid;
    public CharMatrix( int row, int col){
        grid = new char[row][col];
        for (int r = 0 ; r< grid.length ; r++){
            for(int c = 0; c< grid[0].length; c++){
                grid[r][c] = ' ';
            }
        }
    }

    public CharMatrix(int row, int col, char fill){
        grid = new char [row][col];
        for (int r = 0 ; r< grid.length ; r++){
            for(int c = 0; c< grid[0].length; c++){
                grid[r][c] = fill;
            }
        }
    }

    public void display() {
        for (int r =0; r<grid.length; r++){
            for(int c=0; c< grid[0].length; c++){
                System.out.print("[" + grid[r][c] + "]");
            }
            System.out.println();
        }
    }

    public int numRows(){
        int rows = 0;
        for( int r = 0; r< grid.length; r++){
            rows++;
        }
        return rows;
    }

    public int numCols(){
        int cols = 0;
        for( int c = 0; c< grid[0].length; c++){
            cols++;
        }
        return cols;
    }

    public char charAt (int row, int col){
        return grid[row][col];
    }

    public void setCharAt(int row, int col, char ch){
        grid[row][col] = ch;
    }

    public boolean isEmpty (int row, int col) {
        return ( grid[row][col] == ' ' );
    }

    public void fillRect( int row0, int col0, int row1, int col1, char fill){
        for( int r = row0; r < row1 +1; r++){
            for (int c = col0; c < col1+1; c++){
                grid[r][c] = fill;
            }
        }
    }

    public void clearRect(int row0, int col0, int row1, int col1){
        for( int r = row0; r < row1 +1; r++){
            for (int c = col0; c < col1+1; c++){
                grid[r][c] = ' ';
            }
        }
    }

    public int countInRow(int row){
        int count = 0;
        for (int r =0; r<grid.length; r++){
            for(int c=0; c< grid[0].length; c++){
                if( grid[r][c] == (' ')) count ++;
            }
        }
        return count;
    }

    public int countInCol( int col){
        int count = 0;
        for (int r =0; r<grid.length; r++){
            for(int c=0; c< grid[0].length; c++){
                if( grid[r][c] != ' ') count ++;
            }
        }
        return count;
    }

}
