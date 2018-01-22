package dataStructureJava;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] arg){

        //best use for read data
        // don't use it for too many update

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("CEO");
        arrayList.add("Co CEO");
        arrayList.add("Manager");
        arrayList.add("Team Leader");
        arrayList.add("Developer");

        //delete
        arrayList.remove("CEO");

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
