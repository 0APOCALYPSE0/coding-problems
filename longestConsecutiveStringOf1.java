/**
 * Given a binary string A. It is allowed to do at most 1 swap between any 0 and 1. Find and return the length of the longest
 * consecutive 1's that can be achieved.
 *
 * input 1:
 *      A = "111000"
 * output 1:
 *      3
 *
 * input 2:
 *      A = "111011101"
 * output: 2
 *       7
 */

class longestConsecutiveStringOf1{
  public static void main(String[] args) {
		String str = "111011101";
		String strArr[] = new String[str.length()];
		int count = 0;
		String temp = "";
		int k = 0;
		int maxValue = 0;

		for(int i=0; i<str.length(); i++){
		    if(str.charAt(i) == '1'){
		        count++;
		        if(count == 1 && i != str.length()-1){
		            temp = temp+i+"-";
		        }else if(count == 1){
		            temp = i+"-"+i;
		            strArr[k] = temp;
		            k++;
		            temp = "";
		        }
		    }

		    if(str.charAt(i) == '0'){
		        if(count != 0){
		            if(maxValue < count){
		                maxValue = count;
		            }
		            count = 0;
        	        		  temp = temp+(i-1);
        	                      strArr[k] = temp;
        	                      k++;
        	                      temp = "";
		        }
		    }
		}
		for(int i=0; i<k-1; i++){
		    String[] arrOfStr1 = strArr[i].split("-");
		    String[] arrOfStr2 = strArr[i+1].split("-");
		    if(Integer.parseInt(arrOfStr2[0]) - Integer.parseInt(arrOfStr1[1]) == 2){
		        int val1 = Integer.parseInt(arrOfStr1[1]) - Integer.parseInt(arrOfStr1[0]);
		        int val2 = Integer.parseInt(arrOfStr2[1]) - Integer.parseInt(arrOfStr2[0]);
		        int val = val1+val2+2;
						if(k > 2){
							val = val+1;
						}
		        if(maxValue < val){
		            maxValue = val;
		        }
		    }
		}
	}
}