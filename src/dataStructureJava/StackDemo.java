package dataStructureJava;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] arg){

        /*
        * In this data structure
        * element last come first
        * by calling pop()
        */

        Stack<String> stack = new Stack<>();

        stack.push("Shudipto");
        stack.push("Trafder");
        stack.push("Developer");
        stack.push("App");

        //remove last element
        System.out.println(stack.pop());

        //query last element
        System.out.println(stack.peek());

        //search
        System.out.println(stack.search("app"));
    }
}
