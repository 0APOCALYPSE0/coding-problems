/**
*  Given an array arr[] of size N. The task is to find first repeating element with minimum index in the array of integers
* i.e., an element that occurs more than once and whose index of first occurrence is smallest
*
* Input 1:
* 7
* 1 5 3 4 3 5 6
*
* Output 1:
* 1 // 1 is index here of 5 because 5 is a repeating element and it's index is smaller than the other repeating element 3
*/

import java.lang.Math;
import java.lang.Integer;

public class FirstRepeatingElementWithMinIndex {
  public static void main(String[] args) {
    int arr[] = {1,5,3,4,3,5,6};
    int length = arr.length;
    int idxLength = 2000000;
    int idx[] = new int[idxLength];
    for(int i=0; i<idxLength; i++){
      idx[i] = -1;
    }
    int minIndex = Integer.MAX_VALUE;
    for(int i=0; i<length; i++){
      if(idx[arr[i]] != -1){
        minIndex = Math.min(idx[arr[i]], minIndex);
      }else{
        idx[arr[i]] = i;
      }
    }
    if(minIndex == Integer.MAX_VALUE){
      minIndex = -1;
    }
    System.out.println(minIndex);
  }
}
