package dataStructure.linkedList;

public class DoubleListDemo {
    public static void main(String[] arg){
        DoubleLinkedList<String> ls = new DoubleLinkedList<>();
        ls.add("Shudipto");
        ls.add("Himu");
        ls.add("Trafder");

        ls.display();
        ls.delete();
        System.out.println("\nAfter Delete");
        ls.display();
    }
}
