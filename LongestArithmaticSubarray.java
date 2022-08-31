import java.lang.Math;

public class LongestArithmaticSubarray {
  public static void main(String[] args) {
    int arr[] = {1,2,4,3,8,9,10,11};
    int n = arr.length;
    int ans = 2;
    int pd = arr[1] - arr[0];
    int curr = 2;
    int j=2;
    while(j<n){
      if(pd == arr[j] - arr[j-1]){
        curr++;
      }else{
        pd = arr[j] - arr[j-1];
        curr = 2;
      }
      ans = Math.max(ans, curr);
      j++;
    }
    System.out.println(ans);
  }
}
