import java.util.*;

public class LinkedLists {
    public static void main(String[] args) {

        // LinkedList = stores Nodes in 2 parts (data + address)
        // Nodes are in non-consecutive memory locations
        // Elements are linked using pointers

        // Singly Linked List
        // Node [data | address] -> Node [data | address] -> Node [data | address]
        // Doubly Linked List
        // Node [address | data | address] -> Node [address | data | address]

        // advantages?
        // 1. Dynamic Data Structure (allocates needed memory while running)
        // 2. Insertion and Deletion of Nodes is easy. O(1)
        // 3. No/Low memory waste

        // disadvantages?
        // 1. Greater memory usage (additional pointer)
        // 2. No random access of elements (no index[i])
        // 3. Accessing/searching elements is more time consuming. O(n)

        // uses?
        // 1. implement Stacks/Queues
        // 2. GPS navigation
        // 3. music playlist

        LinkedList<String> linkedList = new LinkedList<String>();

        // LinkedList as a Stack
        // linkedList.push("A");
        // linkedList.push("B");
        // linkedList.push("C");
        // linkedList.push("D");
        // linkedList.push("F");
        // linkedList.pop();

        // LinkedList as a Queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        // linkedList.poll();

        // To add you first put in the index then the element you want to add
        linkedList.add(4, "E");

        // To remove you just put in the object you want to delete
        // linkedList.remove("E");

        // How to find a certain elements index
        // System.out.println(linkedList.indexOf("B"));

        // How to print head of linked list
        // System.out.println(linkedList.peekFirst());

        // How to print tail of linked list
        // System.out.println(linkedList.peekLast());

        // How to add a new head value
        linkedList.addFirst("0");

        // How to add a new tail value
        linkedList.addLast("G");

        // Remove head value
        String first = linkedList.removeFirst();
        // Both removes can be stored as a variable
        // Remove tail value
        String last = linkedList.removeLast();

        System.out.println(first + " " + last);
        System.out.println(linkedList);
    }
}
