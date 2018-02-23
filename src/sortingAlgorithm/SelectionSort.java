package sortingAlgorithm;

import java.util.Arrays;

public class SelectionSort {

    private static void selectionSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]){
                    index = j;
                }
            }


            if (index != i){
                int temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }
    }
    
    public static void main(String[] arg){

        int[] array = {1,4,2,10,6,8,9,3,7,5};

        System.out.println(Arrays.toString(array));

        selectionSort(array);

        System.out.println(Arrays.toString(array));
    }
}
