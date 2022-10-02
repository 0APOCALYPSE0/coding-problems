/*  
  Good cells problem: A good cell is the one if the xor of all the elements in row of that cell is equal to the
  xor of all the elements in col of that cell.
  For example if the array contians following values
  0 0
  1 0
  
  then here for first cell (0,0) xor of all elements in row 0 ^ 0 = 0 and xor of all elements in col 0 ^ 1 = 1
  so for first cell xor of row and col is different so first cell is not a good cell.
  
  for second cell (0,1) xor of all elements in row 0 ^ 0 = 0 and xor of all elements in col 0 ^ 0 = 0
  so for second cell xor of row and col is same so second cell is a good cell.
  
  for third cell (1,0) xor of all elements in row 1 ^ 0 = 1 and xor of all elements in col 1 ^ 0 = 1
  so for third cell xor of row and col is same so third cell is a good cell.
  
  for fourth cell (1,1) xor of all elements in row 1 ^ 0 = 1 and xor of all elements in col 0 ^ 0 = 0
  so for fourth cell xor of row and col is different so fourth cell is not a good cell.
  
  so here total number of good cells are 2.
*/

public class GoodCells
{
    public static int goodCells(int[][] v){
        int rowLength = v.length;
        int colLength = v[0].length;
        
        int rowXOR[] = new int[rowLength];
        int colXOR[] = new int[colLength];
        
        for(int i=0; i<rowLength; i++){
            rowXOR[i] = v[i][0];
            for(int j=1; j<colLength; j++){
                rowXOR[i] = rowXOR[i] ^ v[i][j];
            }
        }
        for(int j=0; j<colLength; j++){
            colXOR[j] = v[0][j];
            for(int i=1; i<rowLength; i++){
                colXOR[j] = colXOR[j] ^ v[i][j];
            }
        }
        int count = 0;
        for(int i=0; i<rowLength; i++){
            for(int j=0; j<colLength; j++){
                if(rowXOR[i] == colXOR[j]){
                    count++;
                }
            }
        }
        return count;
    }
	public static void main(String[] args) {
	    int arr[][] = {{0,1}, {1,0}};
		System.out.println(goodCells(arr));
	}
}
