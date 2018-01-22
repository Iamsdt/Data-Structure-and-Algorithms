package dataStructureJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] arg){
        /*
         * Linked List vs Array List
         *
         * If there is lot of update and delete then use linked list
         * because it is faster than array list
         * here just element linked each other
         *
         * If their is only for read data
         * then use array list
         * it faster to insert and read than linked list
         */

        LinkedList<String> list = new LinkedList<>();

        list.add("Shudipto");
        list.add("Trafder");
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
