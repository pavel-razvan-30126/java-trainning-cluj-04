package Strategy;

public class Sort {
    public void displaySorted(SortingStrategy strategy, Integer[] arr){
        strategy.sort(arr);
    }
}
