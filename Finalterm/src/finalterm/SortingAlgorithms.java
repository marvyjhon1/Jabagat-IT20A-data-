package Finalterm;

import java.util.Arrays;

public class SortingAlgorithms {
    
    public static void main(String[] Args) {

        int arr[] = {10, 3, 7, 2, 4, 1, 9, 5, 8, 6};

        int bubble[] = Arrays.copyOf(arr, arr.length);
        int selection[] = Arrays.copyOf(arr, arr.length);
        int insertion[] = Arrays.copyOf(arr, arr.length);

        System.out.println("Original Array: " + Arrays.toString(arr));
        bubbleSort(bubble);
        selectionSort(selection);
        insertionSort(insertion);
    }

    public static void bubbleSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array using Bubble Sort: "
                + Arrays.toString(arr));
    }

    public static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println("Sorted Array using Selection Sort: "
                + Arrays.toString(arr));
    }

    public static void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println("Sorted Array using Insertion Sort: "
                + Arrays.toString(arr));
    }
}
