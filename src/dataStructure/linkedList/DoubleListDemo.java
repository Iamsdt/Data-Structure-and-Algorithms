package dataStructure.linkedList;

public class DoubleListDemo {
    public static void main(String[] arg) {
        DoubleLinkedList<String> ls = new DoubleLinkedList<>();
        ls.addFirst("Shudipto");
        ls.addFirst("Himu");
        ls.addFirst("Trafder");

        ls.display();
        ls.delete();
        System.out.println("\nAfter Delete");
        ls.addLast("Bangladesh");
        ls.addLast("India");
        ls.display();
    }
}
