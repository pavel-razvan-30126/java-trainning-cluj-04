package Strategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy010OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy020OfArr = Arrays.copyOf(arr, arr.length);

        Sort sort = new Sort();

        sort.displaySorted(new BubbleSort(), copy010OfArr);
        System.out.println("\n");
        sort.displaySorted(new MergeSort(), copy020OfArr);

    }
}
