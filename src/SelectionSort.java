public class SelectionSort {
    public int[] selectionSort(int [] arr) {
        int temp = 0;
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < i; j++) {
                    i = j;
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    swap = true;
                }


            }
        }
        return arr;

    }
}
