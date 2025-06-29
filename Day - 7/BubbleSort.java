public class BubbleSort {
  public static void main(String... args) {
    int arr[] = { 1, 2, 4, 6, 7 };
    int temp = 0;
    int n = arr.length;
    int swap = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swap++;
        }
      }
      if (swap == 0) {
        System.out.println("Array is already sorted ");
        break;
      }
    }
    System.out.println("Loops iterates: " + swap + " times.");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
