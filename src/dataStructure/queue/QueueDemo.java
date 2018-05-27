package dataStructure.queue;

class QueueDemo {

    static int[] ints = new int[10];
    static int head = 0;
    static int tail = 0;

    public static void main(String[] arg) {

        //in queue
        //track head/front and Tail/rear
        //to put data -> enqueue
        //to get data -> dequeue

        //here i implement basic queue
        // but it's waste memory

        for (int i = 0; i < 10; i++) {
            enqueue(i);
        }

        //now access
        while (!isEmpty()) {
            System.out.println("value: " + dequeue());
        }

    }

    static void enqueue(int n) {
        ints[tail] = n;
        tail += 1;
        System.out.println("Input:" + n);
    }

    static int dequeue() {
        int n = ints[head];
        head += 1;
        return n;
    }

    static boolean isEmpty() {
        return head == tail;

    }
}
