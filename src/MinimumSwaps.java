
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumSwaps {
    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int swaps = 0, i = 0;
        while (i < arr.length) {
            int index = arr[i] - 1;
            int temp=arr[i];
            if (arr[index] != arr[i]) {
                arr[i] = arr[index];
                arr[index] = temp;
                swaps++;
            } else {
                i = i + 1;
            }
        }
        return swaps;
    }


    public static void main(String[] args) {
        int[] a = {4, 3, 1, 2};
        System.out.println(minimumSwaps(a));
    }
}
