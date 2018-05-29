package dataStructure.linkedList;

public class MyLinkedList<T> {

    private Node<T> head;

    MyLinkedList() {
        head = null;
    }

    public void delete(){
        head = head.next;
    }

    public void display(){
        Node<T> newNode = head;
        while (newNode != null){
            System.out.println(newNode.value);
            newNode = newNode.next;
        }
    }

    public void add(T value){
        Node<T> newNode = new Node<>(value, null);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
}
