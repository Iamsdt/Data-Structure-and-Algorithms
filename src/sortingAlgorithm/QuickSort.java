package sortingAlgorithm;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] arg) {

        int[] array = {1, 4, 2, 10, 6, 8, 9, 3, 7, 5,0};
        System.out.println(Arrays.toString(array));

        System.out.println("After Sort");
        quickSort(array,array.length - 1,0);

        System.out.println(Arrays.toString(array));

    }

    private static void quickSort(int[] array, int high, int low) {

        if (low > high) {
            return;
        }

        int mid = low + (high - low) / 2;

        int pivot = array[mid];

        int i = low;
        int j = high;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
                while (array[j] < pivot) {
                    j--;

                    if (i <= j) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;

                        i++;
                        j--;

                    }
                }

                if (low < j) {
                    quickSort(array, j, low);
                }

                if (high > i) {
                    quickSort(array, high, i);
                }
            }
        }
    }
    //Big o for time n(square)
    // space complexity logn

    /*
     * First it check for middle point and call it pivot
     *
     * then it davide a single array to two separate array
     *
     * then it check the first element is grater than pivot
     * if true then stop checking for first array
     * now check it for second array
     * if true then swap the two number
     *
     * and continue the same process
     *
     * **/

}
