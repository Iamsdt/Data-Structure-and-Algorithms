package dataStructureJava;

import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] arg){

        /*
        * Queue store data in
        * first come first method
        * by calling poll it remove first element
        */

        //because queue implemented in java by using linkedList
        Queue<Integer> queue = new LinkedList<>();

        queue.add(12);
        queue.add(12);
        queue.add(13);
        queue.add(13);
        queue.add(14);
        queue.add(14);

        //return first element
        System.out.println(queue.poll());

        //return the first element
        //but not remove
        System.out.println(queue.peek());


        System.out.println("\nAnother Type of queue");
        System.out.println("Priority queue");

        //this is pop element on the priority basis
        PriorityQueue<Integer> qp = new PriorityQueue<>();

        qp.add(15);
        qp.add(13);
        qp.add(12);
        qp.add(10);
        qp.add(9);
        qp.add(16);

        System.out.println(qp.poll());


        //priority queue of custom data
        System.out.println("PriorityQueue of student");
        PriorityQueue<Student> students = new PriorityQueue<>();

        students.add(new Student("Shudipto",21));
        students.add(new Student("Trafder",11));
        students.add(new Student("Himu",20));

        System.out.println(students.poll().name);
    }

    private static class Student implements Comparable<Student>{
        private String name;
        private int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(@NotNull Student o) {
//            if (this.age == o.age) return 0;
//            else if (this.age >o.age) return 1;
//            else return -1;
            return Integer.compare(this.age, o.age);
        }
    }
}
