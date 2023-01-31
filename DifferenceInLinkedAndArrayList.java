import java.util.ArrayList;
import java.util.LinkedList;

public class DifferenceInLinkedAndArrayList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // Linked list
        startTime = System.nanoTime();

        // linkedList.get(0);
        linkedList.get(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList:\t" + elapsedTime + "ns");

        // Array list
        startTime = System.nanoTime();

        // arrayList.get(0);
        arrayList.get(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList:\t" + elapsedTime + "ns");
    }
}
