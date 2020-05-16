package Strategy;

public class MergeSort implements SortingStrategy {
    @Override
    public void sort(Integer[] list) {
        mergesort(list, 0, list.length - 1);
        for(int element : list){
            System.out.print(element + " ");
        }
    }

    private void mergesort(Integer[] input, int start, int end) {
        int mid = (start + end) / 2;

        if (start < end) {
            mergesort(input, start, mid);
            mergesort(input, mid + 1, end);
        }
        int i = 0, first = start, last = mid + 1;
        int[] tmp = new int[end - start + 1];
        while (first <= mid && last <= end) {
            tmp[i++] = input[first] < input[last] ? input[first++] : input[last++];
        }
        while (first <= mid) {
            tmp[i++] = input[first++];
        }
        while (last <= end) {
            tmp[i++] = input[last++];
        }
        i = 0;
        while (start <= end) {
            input[start++] = tmp[i++];
        }
    }
}
