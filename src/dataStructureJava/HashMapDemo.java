package dataStructureJava;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] arg) {
        /*
        * use for store data with key and value
        * using key and value pair
        */

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Shudipto");
        //if duplicate key
        //replace the latest one
        //map.put(1,"Developer");

        map.put(2,"Trafder");
        map.put(3,"Developer");

        System.out.println(map.get(1));

        //print all the element
        System.out.println("\n");
        for (Map.Entry m: map.entrySet()){
            System.out.println("Key: "+m.getKey()+" value:"+m.getValue());
        }

        //remove
        map.remove(1);

        System.out.println("\nAfter one remove");
        for (Map.Entry m: map.entrySet()){
            System.out.println("Key: "+m.getKey()+" value:"+m.getValue());
        }

        map.replace(2,"Shudipto");
        System.out.println("\nAfter one replace");
        for (Map.Entry m: map.entrySet()){
            System.out.println("Key: "+m.getKey()+" value:"+m.getValue());
        }

        map.clear();
        System.out.println("\nAfter clear");
        for (Map.Entry m: map.entrySet()){
            System.out.println("Key: "+m.getKey()+" value:"+m.getValue());
        }

    }
}
