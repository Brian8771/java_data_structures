import java.util.Queue;
import java.util.LinkedList;

public class Queues {
    public static void main(String[] args) {

        // Queue = FIFO data structures, First-In First-Out (ex. A line of people)
        // A collection designed for holding elements prior to processing
        // Linear data structure

        // **************************************************************
        Queue<String> queue = new LinkedList<String>();

        // add = enqueue, offer()
        queue.offer("Karen");
        queue.offer("Steve");
        queue.offer("Brian");
        queue.offer("Harold");

        // Checks if queue is empty
        // System.out.println(queue.isEmpty());

        // Checks if first in queue
        // System.out.println(queue.peek());

        // Prints length of queue
        // System.out.println(queue.size());

        // Boolean value to check if a certain object is in queue
        // System.out.println(queue.contains("Harold"));

        // remove = dequeue, poll()
        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println(queue);

        // Where are queues useful?
        // 1. Keyboard Buffer (letters should appear on the screen in the order they're
        // pressed)
        // 2. Printer Queue (Print jobs should be completed in order)
        // 3. Used in LinkedLists, PriorityQueues, Breadth-first-search

    }
}
