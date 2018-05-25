package dataStructureJava;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] arg) {
        /*
         *HashSet vs LinkedList
         * same as LinkedList
         * But in hasSet element can not be duplicate
         */

        HashSet<String> list = new HashSet<>();

        list.add("Shudipto");
        //list.add("Shudipto");
        list.add("Trafder");
        //list.add("Trafder");
        list.add("Developer");
        //list.add("Developer");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("\nTreeSet\n");
        //this is used for order data by alphabetically
        // helpful to use in search algorithm
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Shudipto");
        //treeSet.add("Shudipto");
        treeSet.add("Trafder");
        //treeSet.add("Trafder");
        treeSet.add("Developer");
        //treeSet.add("Developer");

        for (String s : treeSet) {
            System.out.println(s);
        }
    }
}
