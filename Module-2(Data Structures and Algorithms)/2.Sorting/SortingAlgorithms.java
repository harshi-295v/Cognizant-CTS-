import java.util.Arrays;

public class SortingAlgorithms {

    static void bubbleSort(int[] arr) {

        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {

            for(int j = 0; j < n - i - 1; j++) {

                if(arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void selectionSort(int[] arr) {

        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for(int j = i + 1; j < n; j++) {

                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    static void insertionSort(int[] arr) {

        for(int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {64, 34, 25, 12, 22};
        bubbleSort(arr1);
        System.out.println("Bubble Sort: " + Arrays.toString(arr1));

        int[] arr2 = {64, 34, 25, 12, 22};
        selectionSort(arr2);
        System.out.println("Selection Sort: " + Arrays.toString(arr2));

        int[] arr3 = {64, 34, 25, 12, 22};
        insertionSort(arr3);
        System.out.println("Insertion Sort: " + Arrays.toString(arr3));
    }
}