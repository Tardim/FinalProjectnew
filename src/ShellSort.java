public class ShellSort {
    public void shellSort(int [] arr){
        int interval=1;
        int elements = arr.length;
        int i = 0;
        while(interval <= elements/3){
            interval = interval*3+1;

        }
        while(interval>0){
            System.out.println("iteration " + i + " ");
            for(int outer = interval; outer < elements; outer++){
                int valuesToInsert = arr[outer];
                int inner = outer;
                while(inner > interval - 1 && arr[inner - interval] > valuesToInsert){
                    arr[inner] = arr[inner - interval];
                    inner -= interval;
                    System.out.println("Item moved: " + arr[inner]);
                }
                arr[inner] = valuesToInsert;
                System.out.println("Items inserted " + valuesToInsert + " at position " + inner);
            }
            interval = (interval - 1)/ 3;
            i++;
        }
    }
}
