package dataStructure.queue;

class CircularQueue {

    static int size = 20;
    static int[] ints = new int[size+1];
    static int head = 0;
    static int tail = 0;

    public static void main(String[] arg){
        for (int i = 0; i < 20; i++) {
            enqueue(i);
        }

        System.out.println("\n\nInsert new data");
        enqueue(10);
        enqueue(20);

        System.out.println("Value:"+dequeue());
        enqueue(15);
        enqueue(20);

        System.out.println("\n\nDequeue 3 element");
        System.out.println("Value1:"+dequeue());
        System.out.println("Value2:"+dequeue());
        System.out.println("Value3:"+dequeue());

        System.out.println("\n\nInsert 3 element");
        enqueue(5);
        enqueue(10);
        enqueue(17);
    }

    static void enqueue(int n) {

        if ((tail + 1) % ints.length == head){
            System.out.println("Full, "+n+" Not inserted");
            return;
        }

        ints[tail] = n;
        System.out.println("Input:" + n+" at:"+tail);
        tail = (tail + 1) % ints.length;
        System.out.println("Current tail:"+tail);
    }

    static int dequeue() {

        if (head == tail){
            System.out.println("Empty");
            return -1;
        }

        int n = ints[head];
        head = head + 1 % ints.length; //that's create a circle
        System.out.println("Head: "+head);
        return n;
    }
}
