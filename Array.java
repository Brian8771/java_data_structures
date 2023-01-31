import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        // Should use this since it's already built in
        // ArrayList<String> arrayList = new ArrayList<String>();

        DynamicArray dynamicArray = new DynamicArray(5);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        dynamicArray.insert(0, "X");
        dynamicArray.delete("A");
        System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray.toString());
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty());

    }
}
