public class SelectionSort {

  void selectionSort(int arr[]){
    int length = arr.length;

    for(int i=0; i<length-1; i++){
      int minIndex = i;
      for(int j=i+1; j<length; j++){
        if(arr[j] < arr[minIndex]){
          minIndex = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
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
    int arr[]= {10,1,9,2,8,3,7,4,6,5};

    SelectionSort obj = new SelectionSort();

    System.out.println("Given Array");
    printArray(arr);

    obj.selectionSort(arr);

    System.out.println("\nSorted Array");
    printArray(arr);
  }
}
