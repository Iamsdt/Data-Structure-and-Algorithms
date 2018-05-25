package dataStructureJava;

public class RecursionDemo {
    public static void main(String[] arg) {

        //it's mean a function called it's self\

        //recursion use stack implement

        int i = 9;
        System.out.println("Factorial of "+i+"! is:"+fact(i));

    }

    private static int fact(int n) {
        if (n == 0)
            return 1;
        else
            return n * fact(n-1);
    }
}
