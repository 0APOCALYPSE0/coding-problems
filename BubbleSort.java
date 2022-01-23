public class BubbleSort {

  void bubbleSort(int arr[]){
    int length = arr.length;
    for(int i=0; i<length-1; i++){
      for(int j=0; j<length-i-1; j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }

  /* Prints the array */
  static void printArray(int arr[]){
    int n = arr.length;
    for (int i=0; i<n; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
  }

  public static void main(String args[]){
    int arr[] = {10,1,9,2,8,3,7,4,6,5};

    BubbleSort obj = new BubbleSort();

    System.out.println("Given Array");
    printArray(arr);

    obj.bubbleSort(arr);

    System.out.println("\nSorted Array");
    printArray(arr);
  }
}
