package searchingAlgorithms;

class DataSet {

    int data[];

    int numberOfTry;

    DataSet(int size) {
        data = new int[size];

        for (int i = 1; i <= size; i++) {
            data[i - 1] = i;
        }

        numberOfTry = 0;
    }

}
