/**
* You are given an array arr[] of N integers including 0. The task is to find the smallest
* positive number missing from the array
*
* Input 1:
* arr[] = [0,-9,1,3,-4,5]
*
* Output 1:
* 2 // 2 is the missing smallest positive number
*
* Constraints:
* 1 <= N <= 10^6
* 10^-6 <= Ai <= 10^6
*/

public class SmallestPositiveMissingNumber {
  public static void main(String[] args) {
    int arr[] = {0,-9,1,3,-4,5};
    int length = arr.length;
    int boolLength = 2000000;
    boolean bool[] = new boolean[boolLength];
    for(int i=0; i<boolLength; i++){
      bool[i] = false;
    }
    for(int i=0; i<length; i++){
      if(arr[i] >= 0){
        bool[arr[i]] = true;
      }
    }
    for(int i=0; i<length; i++){
      if(!bool[i]){
        System.out.println(i);
        break;
      }
    }
  }
}
