package dataStructure.linkedList;

public class MyLinkedList<T> {

    private Node head;

    MyLinkedList() {
        head = null;
    }

    public void delete(){
        head = head.next;
    }

    public void display(){
        Node newNode = head;
        while (newNode != null){
            System.out.println(newNode.value);
            newNode = newNode.next;
        }
    }

    public void add(Object value){
        Node newNode = new Node(value,null);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
}
