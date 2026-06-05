package day12;

import java.util.Arrays;

public class QuickSort {

    public static void quicksort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pivotIndex = partition(arr, si, ei);

        quicksort(arr, si, pivotIndex - 1);
        quicksort(arr, pivotIndex + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};

        quicksort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}