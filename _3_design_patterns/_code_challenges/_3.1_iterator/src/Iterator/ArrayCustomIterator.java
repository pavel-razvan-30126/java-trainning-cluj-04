package Iterator;

public class ArrayCustomIterator {
    private int[] arr;
    private int length;
    private int i = 0;

    public ArrayCustomIterator(int[] arr) {
        this.arr = arr;
        this.length = arr.length;
    }

    public boolean hasNext() {
        if(this.length!=0){
            this.length--;
            return true;
        }return false;
    }

    public int next() {
        return arr[i++];
    }
}
