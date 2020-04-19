package PairOf2;

public class Main {

    public static void main(String[] args) {
        int array[] = {5, 7, 3, -3, -5};
        int pairs = 0;
        for (int i = 0; i < array.length; i++)
            for (int j = i+1; j < array.length; j++) {
                if (array[j] + array[i] == 0) {
                    pairs++;
                    i++;
                }
            }
        System.out.println("Number of pairs: " + pairs);
    }
}
