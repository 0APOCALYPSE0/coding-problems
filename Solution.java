import java.util.*;

class Solution {
    // public int findMaxLength(int[] nums) {
    //     int num1 = 0;
    //     int num2 = 0;
    //     int count = 0;
    //     int max = 0;
    //     num1 = nums[0];
    //     if(num1 == 0){
    //         num2 = 1;
    //     }else{
    //         num2 = 0;
    //     }
    //     for(int i=0; i<nums.length; i++){
    //         if(i % 2 == 0){
    //             if(nums[i] == num1){
    //                 count++;
    //             }else{
    //               count = count % 2 != 0 ? --count : count;
    //               int temp = nums[i] == 0 ? 1 : 0;
    //               if(i+1 < nums.length){
    //                   count = nums[i+1] == temp ? ++count : count;
    //               }
    //               max = Math.max(count, max);
    //               num1 = num1 == 0 ? 1 : 0;
    //               num2 = num2 == 0 ? 1 : 0;
    //             }
    //         }else{
    //             if(nums[i] == num2){
    //                 count++;
    //             }else{
    //               count = count % 2 != 0 ? --count : count;
    //               int temp = nums[i] == 0 ? 1 : 0;
    //               if(i+1 < nums.length){
    //                   count = nums[i+1] == temp ? ++count : count;
    //               }
    //               max = Math.max(count, max);
    //               num1 = num1 == 0 ? 1 : 0;
    //               num2 = num2 == 0 ? 1 : 0;
    //             }
    //         }
    //     }
    //     max = Math.max(count, max);
    //     if(max %2 != 0){
    //         max--;
    //     }
    //     return max;
    // }

    public int findMaxLength(int[] nums) {
      if (nums == null || nums.length == 0) { // Base Case
        return 0;
      }
      // Converting all 0 to -1
      for(int i = 0; i < nums.length; i++){
          if(nums[i] == 0) nums[i] = -1;
      }
      int sum = 0; // current
      int max = 0; // final-ans
      Map<Integer, Integer> map = new HashMap<>();
      map.put(0, -1); // put reference in the starting of 0 & -1, as i have tell you in the starting
      for(int i = 0; i < nums.length; i++){
          sum += nums[i]; // cumulative sum
          if(map.containsKey(sum)){ // if cumulative sum key :- 0, -1, 1 already present
              int last = map.get(sum); // we get it's value
              max = Math.max(max, i - last); // and update max
          }
          else{ // if it's not present then create it's key-value pair
              map.put(sum, i);
          }
      }
      return max; // finally return it
    }
    public static void main(String args[]){
      // int nums[] = {0,1,0,0,0,1,0,1,0,1,1,0,1,0,1,0};
      // [1,0,1,0,0,1,0,0,1,1,0,1,0,1,0,0,0,0,1,0,1,1,1,1,0,0,1,0]
      int nums[] = {0,0,0,1,1,1};
      int result = new Solution().findMaxLength(nums);
      System.out.println(result);
    }
}