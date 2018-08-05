package sortingAlgorithm;

class MergeSort {


    //how it's work
    /*
    First it divided everything into single problem,
    For Example,
    we have an array of 2, 4, 5, 1
    First it divided into two part from the middle
    2, 4 and 5, 1
    the divided again from the middle
    2 and 4 ; 5 and 1

    so now every thing in a single problem
    now time for merge
    first merge first two and also short
    2 and 4 ; 1 and 5
    and merge again
    1, 2, 4, 5
    */

    private int [] array;
    private int [] tempArray;

    void  prePareForSort(int[] array){
        this.array = array;
        tempArray = new int[array.length];
    }
}
