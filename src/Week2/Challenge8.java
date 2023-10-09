package Week2;

import java.util.Arrays;

interface SortingAlgorithm {
    int[] sortingAlgo(int[] array);
}

class BubbleSort implements SortingAlgorithm {

    @Override
    public int[] sortingAlgo(int[] array) {
        int n = array.length;

        // Perform the bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}

class MergeSort implements SortingAlgorithm {

    @Override
    public int[] sortingAlgo(int[] array) {
        mergeSort(array, 0, array.length - 1);
        return array;
    }

    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    private void merge(int[] array, int left, int middle, int right) {
        int size1 = middle - left + 1;
        int size2 = right - middle;

        int[] leftArray = new int[size1];
        int[] rightArray = new int[size2];

        System.arraycopy(array, left, leftArray, 0, size1);
        System.arraycopy(array, middle + 1, rightArray, 0, size2);

        int i = 0, j = 0, k = left;
        while (i < size1 && j < size2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < size1) {
            array[k++] = leftArray[i++];
        }

        while (j < size2) {
            array[k++] = rightArray[j++];
        }
    }
}

class QuickSort implements SortingAlgorithm {

    @Override
    public int[] sortingAlgo(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

public class Challenge8 {
    public static void main(String[] args) {
        int[] unsortedArray = {10, 6, 2, 66, 9, 15, 1, 6, 4};

        // Using BubbleSort
        SortingAlgorithm bubbleSort = new BubbleSort();
        int[] sortedByBubbleSort = bubbleSort.sortingAlgo(unsortedArray);

        // Using MergeSort
        SortingAlgorithm mergeSort = new MergeSort();
        int[] sortedByMergeSort = mergeSort.sortingAlgo(unsortedArray);

        // Using QuickSort
        SortingAlgorithm quickSort = new QuickSort();
        int[] sortedByQuickSort = quickSort.sortingAlgo(unsortedArray);

        System.out.println("Sorting array using Bubble Sort: " + Arrays.toString(sortedByBubbleSort));
        System.out.println("Sorting array using Merge Sort: " + Arrays.toString(sortedByMergeSort));
        System.out.println("Sorting array using Quick Sort: " + Arrays.toString(sortedByQuickSort));
    }
}
