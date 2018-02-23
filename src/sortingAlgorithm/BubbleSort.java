package sortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {

    private static void  bubbleSort(int[] array){
        int n = array.length;
        int temp;
        
        for (int i = 0; i < n ; i++) {
            for (int j = 1; j <(n-i) ; j++) {
                if (array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] arg){
        int[] array = {1,4,2,10,6,8,9,3,7,5};
        System.out.println(Arrays.toString(array));

        System.out.println("After Sort");

        bubbleSort(array);

        System.out.println(Arrays.toString(array));
    }


    // big o is n square

    // compare, first element and second element
    // if one is bigger than another then swap it
    // continue this process
}
