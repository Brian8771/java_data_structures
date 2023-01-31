import java.util.*;

public class PriorityQueues {

    public static void main(String[] args) {
        // Priority Queue = A FIFO data structure that serves elements
        // with the highest priority first
        // before elements with lower priority

        Queue<String> queue = new PriorityQueue<>();

        queue.offer("B");
        queue.offer("A");
        queue.offer("F");
        queue.offer("C");
        queue.offer("D");

        // Priority Queue will print in ascending order
        // You can add in the parenthesis a comparator to have it prioritize
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
