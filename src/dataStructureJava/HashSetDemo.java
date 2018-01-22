package dataStructureJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashSetDemo {
    public static void main(String[] arg) {
        /*
         *HashSet vs LinkedList
         * same as LinkedList
         * But in hasSet element can not be duplicate
         */

        HashSet<String> list = new HashSet<>();

        list.add("Shudipto");
        list.add("Shudipto");
        list.add("Trafder");
        list.add("Trafder");
        list.add("Developer");
        list.add("Developer");

        //use java.util.Iterator
        Iterator<String> iterable = list.iterator();

        while (iterable.hasNext()){
            System.out.println(iterable.next());
        }

        //another way, no need to iterator
        System.out.println("\nAnother way");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
