package searchingAlgorithms;

public class BinarySearch {

    public static void main(String[] arg){
        DataSet dataSet = new DataSet(10000000);

        //search
        int search = 9999999;

        int low = 0;
        int mid;
        int high = dataSet.data.length - 1;

        boolean isFound = false;

        while (!isFound){

            if (low > high){
                System.out.println("Number is not found");
                break;
            }

            mid = low + ((high-low)/2);
            dataSet.numberOfTry++;

            if (dataSet.data[mid] == search){
                System.out.println("Number of try:"
                        +dataSet.numberOfTry);
                isFound = true;
            }

            //less than mid
            // change the low
            if (dataSet.data[mid] < search){
                low = mid + 1;
            }

            //grater than mid
            // change the high
            if (dataSet.data[mid] > search){
                high = mid - 1;
            }
        }
    }

    // so here big o is logN
}
