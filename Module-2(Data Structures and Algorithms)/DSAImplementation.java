import java.util.*;

public class DSAImplementation {

    // Array Traversal
    static void arrayTraversal(int[] arr) {
        System.out.print("Array Traversal: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Linear Search
    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    // Binary Search
    static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    // Bubble Sort
    static void bubbleSort(int[] arr) {
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

    // Linked List Demo
    static void linkedListDemo() {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Linked List: " + list);

        list.remove(1);

        System.out.println("After Delete: " + list);
    }

    public static void main(String[] args) {

        int[] arr = {40, 10, 30, 20, 50};

        arrayTraversal(arr);

        System.out.println("Linear Search (30): Index = "
                + linearSearch(arr, 30));

        bubbleSort(arr);

        System.out.println("Sorted Array: "
                + Arrays.toString(arr));

        System.out.println("Binary Search (30): Index = "
                + binarySearch(arr, 30));

        linkedListDemo();
    }
}