/*
* Given an unsorted array A of size N of non negative integers, find a continuous subarray which adds to a given number S
*
* Input 1:
* N = 5, S = 12
* A[] = [1,2,3,7,5]
*
* Output 1:
* 1,3 // here subarray with staring index of 1 and ending index of 3 sum is equal to 12
*/

public class SubarrayWithSumK {
  public static void main(String[] args) {
    int arr[] = {1,2,3,7,5};
    int s = 12;
    int length = arr.length;
    int startPointer = -1;
    int endPointer = -1;
    int sum = 0;
    int i=0,j=0;

    while(j<length && sum+arr[j] <= s){
      sum += arr[j];
      j++;
    }
    if(sum == s){
      System.out.println(i+" "+(j-1));
      return;
    }
    while(j < length){
      sum += arr[j];
      while(sum > s){
        sum -= arr[i];
        i++;
        if(sum == s){
          startPointer = i;
          endPointer = j;
          break;
        }
        j++;
      }
    }
    System.out.println(startPointer+" "+endPointer);
  }
}
