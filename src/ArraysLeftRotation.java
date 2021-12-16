import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysLeftRotation {

    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public static List<Integer> rotLeftBestCase(List<Integer> a, int d) {
        int n=a.size();
        List<Integer> newList=new ArrayList<>(5);
        newList.addAll(a);
        for (int oldIndex = 0; oldIndex < a.size(); oldIndex++) {
            int newIndex = ((oldIndex + (n - d)) % n);
            newList.set(newIndex, a.get(oldIndex));
        }
        return newList;
    }

    public static List<Integer> rotRight(List<Integer> a, int d) {
        // Write your code here
        int temp = 0, secondTemp;

        for (int i = 0; i < d; i++) {
            for (int j = 0; j < a.size(); j++) {
                if (j == 0) {
                    temp = a.get(j + 1);
                    a.set(j + 1, a.get(0));
                    continue;
                }

                if (j == a.size() - 1) {
                    a.set(0, temp);
                    continue;
                }

                secondTemp = a.get(j + 1);
                a.set(j + 1, temp);
                temp = secondTemp;

            }
        }


        return a;

    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {

        int temp = 0, secondTemp = 0;
        for (int i = 0; i < d; i++) {

            for (int j = a.size() - 1; j >= 0; j--) {

                if (j == a.size() - 1) {
                    temp = a.get(j - 1);
                    a.set(j - 1, a.get(j));
                    continue;
                }

                if (j == 0) {
                    a.set(a.size() - 1, temp);
                    continue;
                }

                secondTemp = a.get(j - 1);
                a.set(j - 1, temp);
                temp = secondTemp;

            }
        }
        return a;
    }

}

class Solution {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        Integer[] array = {1, 2, 3, 4, 5};
        int numberOfRotation = 4;

        // inputs
        arrayList = Arrays.asList(array);

       /* List<Integer> arraysRightRotation =  ArraysLeftRotation.rotRight(arrayList, numberOfRotation);
        arraysRightRotation.stream().forEach(x -> System.out.print(x));
        System.out.println();
        arrayList = Arrays.asList(array);*/

        List<Integer> arraysLeftRotation = ArraysLeftRotation.rotLeftBestCase(arrayList, numberOfRotation);
        arraysLeftRotation.stream().forEach(x -> System.out.print(x));

    }


}
