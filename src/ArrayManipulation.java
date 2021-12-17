import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayManipulation {
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here

        // Write your code here

        List<Integer> array = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            array.add(0);
        }


        for (int i = 0; i < queries.size(); i++) {

            for (int j = queries.get(i).get(0) - 1; j < queries.get(i).get(1); j++) {
                array.set(j, array.get(j) + queries.get(i).get(2));
            }

        }
        return Collections.max(array);
    }

    public static void main(String[] args) {

        Integer[] a1 = {2, 6, 8};
        Integer[] a2 = {3, 5, 7};
        Integer[] a3 = {1, 8, 1};
        Integer[] a4 = {5, 9, 15};

        List<Integer> l1 = Arrays.asList(a1);
        List<Integer> l2 = Arrays.asList(a2);
        List<Integer> l3 = Arrays.asList(a3);
        List<Integer> l4 = Arrays.asList(a4);

        List<List<Integer>> queries = new ArrayList<>();
        queries.add(l1);
        queries.add(l2);
        queries.add(l3);
        queries.add(l4);

        int n = 10;
        long max = arrayManipulation(n, queries);
        System.out.println(max);
    }
}
