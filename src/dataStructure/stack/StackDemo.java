package dataStructure.stack;

public class StackDemo {

    private static int top = -1;
    private static int[] ints = new int[10];

    public static void main(String[] arg) {

        for (int i = 0; i < 10 ; i++) {
            push(i);
        }

        for (int i = 1; top >= 0; i++) {
            System.out.println("Data pos:"+i+" value:"+ pop());
        }

        //now stack is empty
        //add new data
        push(5);
        push(4);

        System.out.println("Get new data:"+ pop());
    }

    private static void push(int n) {
        top += 1;
        ints[top] = n;
    }

    private static int pop(){

        if (top < 0){
            return -1;
        }

        int ret = ints[top];
        top -= 1;
        return ret;
    }
}
