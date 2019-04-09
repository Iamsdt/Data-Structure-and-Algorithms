package dataStructure.linkedList;

/* Double Linked list */
public class DoubleLinkedList<T> {

    private NodeD head;

    public void delete(Object value) {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        //if  this is the first node
        if (head.next == null) {
            head = null;
            return;
        }

        NodeD temp = head;

        while (temp.next != null) {
            if (temp.value == value) {
                break;
            }

            temp = temp.next;
        }

        temp.previous.next = temp.next;
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
            head.next.previous = head;
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

            temp.next = new NodeD(value, null, temp);
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
