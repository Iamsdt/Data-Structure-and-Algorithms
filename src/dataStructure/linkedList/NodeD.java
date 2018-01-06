package dataStructure.linkedList;
/*Double linked list*/
public class NodeD {
    Object value;
    NodeD next;
    NodeD previous;

    NodeD(Object value, NodeD next, NodeD previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }
}
