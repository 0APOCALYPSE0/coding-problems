public class InsertionSort {

  void insertionSort(int arr[]){
    int length = arr.length;

    for(int i=1; i<length; i++){
      int key = arr[i];
      int j = i-1;
      while(j >= 0 && arr[j] > key){
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = key;
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

    InsertionSort obj = new InsertionSort();
    System.out.println("Given Array");
    printArray(arr);

    obj.insertionSort(arr);

    System.out.println("\nSorted Array");
    printArray(arr);
  }
}
