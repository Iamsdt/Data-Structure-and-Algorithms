package dataStructure.hashtable;

public class Entry {
    private int key;
    private Object value;
    private Entry next;

    public Entry(int key, Object value, Entry next) {
        this.key = key;
        this.value = value;
        next = null;
    }

    public Entry(){
        next = null;
    }

    public int getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

    public Entry getNext() {
        return next;
    }
}
