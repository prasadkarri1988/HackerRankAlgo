import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayManipulation {
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here


        List<Integer> array = new ArrayList<>(n);

        for (int i = 0; i < n+1; i++) {
            array.add(0);
        }

        for (int i = 0; i < queries.size(); i++) {

            for (int j = queries.get(i).get(0); j < queries.get(i).get(1)+1; j++) {
                array.set(j, array.get(j) + queries.get(i).get(2));
            }

        }
        return Collections.max(array);
    }

    public static void main(String[] args) {

        Integer[] a1 = {1 ,10, 10};
        Integer[] a2 = {1, 10, 10};
        Integer[] a3 = {1, 10, 10};
        Integer[] a4 = {1, 10, 10};

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
