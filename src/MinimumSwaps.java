
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumSwaps {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int swaps = 0;
        List<Integer> newList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int i = 0; i < newList.size(); i++) {
            if (newList.get(i) != i + 1) {
                swaps++;
                int temp = newList.get(i);
                int newIndex = newList.indexOf(i + 1);
                newList.set(i, newList.get(newIndex));
                newList.set(newIndex, temp);
            }
        }

        return swaps;
    }


    public static void main(String[] args) {
        int[] a = {4, 3, 1, 2};
        System.out.println(minimumSwaps(a));
    }
}
