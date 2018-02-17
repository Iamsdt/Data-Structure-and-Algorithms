package searchingAlgorithms;

public class LinearSearch {

    public static void main(String[] arg){
        //create dat set for 1 million
        DataSet dataSet = new DataSet(10000000);


        int search = 9999999;

        for (int i = 0; i < dataSet.data.length; i++) {
            //number try
            dataSet.numberOfTry++;

            //check it
            if (dataSet.data[i] == search){
                System.out.println("Element is found on" +
                        " after "+dataSet.numberOfTry+" try");
                break;
            }
        }

    }

    // so here big o is n
}
