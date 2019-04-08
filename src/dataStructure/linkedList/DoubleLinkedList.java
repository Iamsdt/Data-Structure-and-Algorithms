package dataStructure.linkedList;

/*Double Linked list*/
public class DoubleLinkedList<T> {

    private NodeD head;

    public void delete() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        head = head.next;
        head.previous = null;
    }

    public void display() {
        NodeD newNode = head;
        while (newNode != null) {
            System.out.println(newNode.value);
            newNode = newNode.next;
        }
    }

    public void addFirst(Object value) {
        if (head == null) {
            head = new NodeD(value, null, null);
        } else {
            head = new NodeD(value, head, null);
        }
    }

    public void addLast(Object value) {
        if (head == null) {
            head = new NodeD(value, null, null);
        } else {
            NodeD temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = new NodeD(value, null, null);
        }
    }

    public NodeD search(Object value) {

        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        NodeD temp = head;
        NodeD search = null;

        while (temp.next != null) {
            if (temp.value == value) {
                search = temp;
            }

            temp = temp.next;
        }

        return search;
    }

}
