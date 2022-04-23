/**
 * Given a n*n square matrix A, return an array of it's anti diagonals.
 *
 * input 1:
 *      3
 *      1 2 3
 *      4 5 6
 *      7 8 9
 * output 1:
 *      1 0 0
 *      2 4 0
 *      3 5 7
 *      6 7 8
 *      9 0 0
 *
 * input 2:
 *     2
 *     1 2
 *     3 4
 * output 2:
 *     1 0
 *     2 3
 *     4 0
*/

import java.util.*;
public class AntiDiagonal{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size: ");
    int n = sc.nextInt();
    int arr[][] = new int[n][n];

    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        arr[i][j] = sc.nextInt();
      }
    }

    int count = 0;
    int i = 0;
    int j = 0;

    while(i < n && j < n){
      int num = 0;
      int row = i;
      int col = j;
      while(num < n){
        if(row > n-1 || col < 0){
          System.out.print(0);
        }else{
          System.out.print(arr[row][col]);
        }
        row++;
        col--;
        num++;
      }
      System.out.println();
      if(count >= n-1){
        i++;
      }else{
        j++;
      }
      count++;
    }
  }
}