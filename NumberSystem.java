class NumberSystem{
  // converting binary to decimal ex: 101 -> 5
  public static int binaryToDecimal(int n){
    int ans = 0;
    int x = 1;
    while(n > 0){
      int y = n % 10;
      ans += y*x;
      x *= 2;
      n /= 10;
    }
    return ans;
  }
  // converting octal to decimal ex: 144 -> 100
  public static int octalToDecimal(int n){
    int ans = 0;
    int x = 1;
    while(n > 0){
      int y = n % 10;
      ans += y*x;
      x *= 8;
      n /= 10;
    }
    return ans;
  }
  // converting hexa to decimal ex: 64 -> 100
  public static int hexaToDecimal(String n){
    int ans = 0;
    int x = 1;
    int length = n.length();
    for(int i = length-1; i>=0; i--){
      if(n.charAt(i) >= '0' && n.charAt(i) <= '9'){
        ans += x*(n.charAt(i) - '0');
      }else if(n.charAt(i) >= 'A' && n.charAt(i) <= 'F'){
        ans += x*((n.charAt(i) - 'A')+10);
      }
      x *= 16;
    }
    return ans;
  }
  // converting decimal to binary ex: 5 -> 101
  public static int decimalToBinary(int n){
    int ans = 0;
    int x = 1;
    while(x <= n)
      x *= 2;
    x /= 2;
    while(x > 0){
      int lastDigit = n/x;
      n -= lastDigit*x;
      x /= 2;
      ans = ans*10 + lastDigit;
    }
    return ans;
  }
  // converting decimal to octa ex: 100 -> 144
  public static int decimalToOcta(int n){
    int ans = 0;
    int x = 1;
    while(x <= n)
      x *= 8;
    x /= 8;
    while(x > 0){
      int lastDigit = n/x;
      n -= lastDigit*x;
      x /= 8;
      ans = ans*10 + lastDigit;
    }
    return ans;
  }
  // converting decimal to hexa ex: 100 -> 64
  public static String decimalToHexa(int n){
    String ans = "";
    int x = 1;
    while(x <= n)
      x *= 16;
    x /= 16;
    while(x > 0){
      int lastDigit = n/x;
      n -= lastDigit*x;
      x /= 16;
      if(lastDigit <= 9){
        ans = ans + lastDigit+"";
      }else{
        char c = (char)('A' + lastDigit - 10);
        ans = ans+c;
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    int n = 100;
    String num = "1CF";
    // int result = binaryToDecimal(n);
    // int result = octalToDecimal(n);
    // int result = hexaToDecimal(num);
    // int result = decimalToBinary(n);
    // int result = decimalToOcta(n);
    String result = decimalToHexa(n);
    System.out.println(result);
  }
}