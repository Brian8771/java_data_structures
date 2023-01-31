import java.util.Arrays;

public class BinarySearch {

    // binary search = Search algorithm that finds the position
    // of a target value with a sorted array.
    // Half of the array is eliminated during each "step"
    public static void main(String[] args) {

        int array[] = new int[1000000];
        int target = 777777;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // int index = Arrays.binarySearch(array, target);
    }
}
