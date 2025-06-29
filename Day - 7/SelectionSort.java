public class SelectionSort {
  public static void main(String args[]) {
    int arr[] = { 3, 2, 5, 6, 1, 4 };
    int temp = 0;

    for (int i = 0; i < arr.length - 1; i++) {
      int minPos = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[minPos] < arr[j]) {
          minPos = j;
        }
      }
      temp = arr[minPos];
      arr[minPos] = arr[i];
      arr[i] = temp;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
