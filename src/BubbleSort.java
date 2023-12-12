public class BubbleSort {
    public int[] bubbleSort(int[] arr){
        int temp = 0;
        boolean swap = true;
        while(swap) {
            swap = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap = true;
                }
            }
        }
        return arr;
    }



}
