package dataStructure.hashtable;

import javafx.scene.control.TreeItem;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] arg){

        HashMap<String,String> hashMap = new HashMap<>();

        hashMap.put("name","Shudipto");
        hashMap.put("middleName","Kumar");
        hashMap.put("lastName","Trafder");

        Hashtable<String, String> hashtable = new Hashtable<>(hashMap);


        TreeItem treeItem = new TreeItem();
        if (treeItem.isLeaf()) {

        }

    }
}
