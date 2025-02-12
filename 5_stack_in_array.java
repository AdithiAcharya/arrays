import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;

public class MergeSortedArrays {

    public static ArrayList<Integer> mergeSortedArrays(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        Stack<Integer> s = new Stack<>();

        int i = arr1.size() - 1;
        int j = arr2.size() - 1;

        while (i >= 0 && j >= 0) {
            if (arr1.get(i) > arr2.get(j)) {
                s.push(arr1.get(i--));
            } else {
                s.push(arr2.get(j--));
            }
        }

        while (i >= 0) {
            s.push(arr1.get(i--));
        }

        while (j >= 0) {
            s.push(arr2.get(j--));
        }

        ArrayList<Integer> merged = new ArrayList<>();
        while (!s.empty()) {
            merged.add(s.pop());
        }

        Collections.reverse(merged); // Reverse to get correct order
        return merged;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(3);
        arr1.add(5);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(2);
        arr2.add(4);
        arr2.add(6);

        ArrayList<Integer> mergedArray = mergeSortedArrays(arr1, arr2);

        System.out.println("Merged and sorted array: " + mergedArray);
    }
}
