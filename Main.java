import java.util.*;

public class Main {
//   public int scoreOfParentheses(String s) {
//     int length = 0;
//         int count = 0;
//         int level = 0;
//         int siblingValue = 0;
//         int levelRating = 1;
//         boolean toggle = true;
//         Stack<Character> stack = new Stack<Character>();
//         for(int i=0; i<s.length(); i++){
//             char c = s.charAt(i);
//             if(c == '('){
//                 if(toggle == false){
//                     level++;
//                     levelRating = 1;
//                     siblingValue = length;
//                     length = 0;
//                 }
//                 toggle  = false;
//             }else if(c == ')'){
//                 if(toggle == true){
//                     length *= 2;
//                     if(levelRating == 1){
//                         length += siblingValue;
//                     }
//                     levelRating = 0;
//                     level--;
//                 }else{
//                     length += 1;
//                 }
//                 toggle = true;
//             }
//         }
//         return length;
//   }

public boolean checkPrevChar(int arr[], int value){
    for(int i=0; i<value; i++){
        if(arr[i] > 0){
            return true;
        }
    }
    return false;
}

  public String removeDuplicateLetters(String s) {
    int[] charFreq = new int[26];
    String result = "";

    for(int i=0; i<s.length(); i++){
        charFreq[s.charAt(i) - 'a']++;
    }

    for(int i=0; i<s.length(); i++){
        if(charFreq[s.charAt(i) - 'a'] > 0){
            if(checkPrevChar(charFreq, s.charAt(i) - 'a')){
                if(charFreq[s.charAt(i) - 'a'] > 1){
                    charFreq[s.charAt(i) - 'a']--;
                }else{
                    result += s.charAt(i);
                    charFreq[s.charAt(i) - 'a'] = 0;
                }
            }else{
                if(charFreq[s.charAt(i) - 'a'] > 1){
                    charFreq[s.charAt(i) - 'a'] = 0;
                    result += s.charAt(i);
                }else{
                    result += s.charAt(i);
                    charFreq[s.charAt(i) - 'a'] = 0;
                }
            }
        }
    }

    return result;
  }
  public static void main(String args[]){
    System.out.println(new Main().removeDuplicateLetters("bcabc"));
  }
}
