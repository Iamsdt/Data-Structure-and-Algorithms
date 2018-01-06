package dataStructure.linkedList;
/*Double Linked list*/
public class DoubleLinkedList<T> {

    private NodeD head;

    public void delete(){
        head = head.next;
        head.previous = null;
    }

    public void display(){
        NodeD newNode = head;
        while (newNode != null){
            System.out.println(newNode.value);
            newNode = newNode.next;
        }
    }

    public void add(Object value){
        NodeD newNode = new NodeD(value,null,null);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            newNode.previous = newNode;
            head = newNode;
        }
    }
}
