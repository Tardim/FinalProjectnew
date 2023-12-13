public class QuickSort {
    public int[] quickSort(int[] arr) {
        int pivot =0;
        int temp;
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i > arr.length - 1; i++) {
                for (int j = 0; i > arr.length - 1; i++) {
                    if (arr[i] > pivot) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        swap = true;
                    }

                }
            }
        }
        return arr;
    }
}