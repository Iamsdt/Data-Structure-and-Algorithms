package dataStructure.linkedList;

public class LinkedListDemo {
    public static void main(String[] arg){
        MyLinkedList<String> ls = new MyLinkedList<>();
        ls.add("Shudipto");
        ls.add("Himu");
        ls.add("Trafder");

        ls.display();
        ls.delete();
        System.out.println("\nAfter Delete");
        ls.display();
    }

}
