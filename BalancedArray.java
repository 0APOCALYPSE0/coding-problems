/**
 *  Problem Description
 *  Given an integer array A of size N. You need to count the number of special elements in the given array.
 *  A element is special if removal of that element make the array balanced.
 *  Array will be balanced if sum of even index element equal to sum of odd index element.
 *
 *  Input 1: A = [2, 1, 6, 4]
 *  Output 1: 1
 *
 *  Input 2: A = [5, 5, 2, 5, 8]
 *  Output 2: 2
 *
*/

import java.util.*;

public class BalancedArray {
    public static int solve(ArrayList<Integer> A) {
        // Brute Force Solution
        // int length = A.size();
        // int evenSum = 0;
        // int oddSum = 0;
        // for(int i=0; i<length; i++){
        //     if(i % 2 == 0){
        //         evenSum += A.get(i);
        //     }else{
        //         oddSum += A.get(i);
        //     }
        // }
        // if(evenSum == oddSum){
        //     return 0;
        // }
        // evenSum = 0;
        // oddSum = 0;
        // int count = 0;
        // for(int i=0; i<length; i++){
        //     int indexCounter = 0;
        //     evenSum = 0;
        //     oddSum = 0;
        //     for(int j=0; j<length; j++){
        //         if(i == j){
        //             continue;
        //         }
        //         if(indexCounter % 2 == 0){
        //             evenSum += A.get(j);
        //         }else{
        //             oddSum += A.get(j);
        //         }
        //         indexCounter++;
        //     }
        //     if(evenSum == oddSum){
        //         count++;
        //     }
        // }
        // return count;

        //Optimized Solution
        int n = A.size();
        int odd  = 0;
        int even = 0;
        for(int  i = 0 ; i < n ; i++){
            if(i%2==0){
                even+=A.get(i);
            }
            else{
                odd+=A.get(i);
            }
        }
        int count = 0 ;
        int evenLeft = 0;
        int oddLeft = 0;
        for(int i = 0 ; i < n ; i++){
            if(i%2 == 0){
                if(evenLeft + odd == even - A.get(i) + oddLeft){
                    count++;
                }
                evenLeft += A.get(i);
                even -= A.get(i);
            }
            else{
                if(oddLeft + even == odd - A.get(i) + evenLeft){
                    count++;
                }
                oddLeft += A.get(i);
                odd -= A.get(i);
            }
        }
        return count ;
    }
    public static void main(String args[]){
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(2);
      list.add(1);
      list.add(6);
      list.add(4);
      System.out.println(solve(list));
    }
}
