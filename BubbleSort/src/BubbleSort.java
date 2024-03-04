public class BubbleSort {
    public static void main(String[] args) {
      
        int[] array = {66, 2, 25, 12, 22, 0, 100};

        
        System.out.println("Original Array:");
        displayArray(array);

    
        bubbleSort(array);

        
        System.out.println("\nSorted Array:");
        displayArray(array);
    }

   
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    
    public static void displayArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
