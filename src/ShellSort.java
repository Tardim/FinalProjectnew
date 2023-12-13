public class ShellSort {
    public void shellSort(int [] arr){
        int interval=1;
        int elements = arr.length;
        int i = 0;
        while(interval <= elements/3){
            interval = interval*3+1;

        }
        while(interval>0){

            for(int outer = interval; outer < elements; outer++){
                int valuesToInsert = arr[outer];
                int inner = outer;
                while(inner > interval - 1 && arr[inner - interval] > valuesToInsert){
                    arr[inner] = arr[inner - interval];
                    inner -= interval;

                }
                arr[inner] = valuesToInsert;

            }
            interval = (interval - 1)/ 3;
            i++;
        }
    }
}
