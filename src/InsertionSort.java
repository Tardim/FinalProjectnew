public class InsertionSort {


    public int [] insertionSort(int[] arr)
    {
        int temp;
         boolean swap = true;
         while (swap){
             swap = false;
             for(int i = 0; i< arr.length -1; i++){
                     if (arr[i] > arr[i + 1]) {
                         temp = arr[i];
                         arr[i] = arr[i + 1];
                         arr[i + 1] = temp;
                         swap = true;
                     }
                     swap = false;

                 }
             }
         return arr;
         }

    }

