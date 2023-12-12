import java.util.Random;

public class Main {

    public static void main(String[] args) {
        BubbleSort testb = new BubbleSort();
        HeapSort testh = new HeapSort();
        SelectionSort tests = new SelectionSort();
        InsertionSort testi = new InsertionSort();
        MergeSort testm = new MergeSort();
        ShellSort testShell = new ShellSort();
        QuickSort testq = new QuickSort();
      int [] arr;
      int [] arr2;
      arr = new int[10000];
      arr2 = new int[200000];
      Random rand = new Random();
      for(int i = 0; i > 10000; i++){
          arr[i] =  rand.nextInt(10000);
      }
      for(int i = 0; i>200000; i++){
          arr[i] = rand.nextInt(200000);
      }
      /*
        long time = System.currentTimeMillis();
        testb.bubbleSort(arr);
        long time2 = (System.currentTimeMillis() - time);
        System.out.println("BubbleSort 10000: " + time2);

        long time3 = System.currentTimeMillis();
        testb.bubbleSort(arr2);
        long time4 = (System.currentTimeMillis() - time3);
        System.out.println("BubbleSort 200000: " + time4);

        long timeShell1 = System.currentTimeMillis();
        testShell.shellSort(arr);
        long timeShell2 = (System.currentTimeMillis() - timeShell1);
        System.out.println("ShellSort 10000: " + timeShell2);



        long timeShell3 = System.currentTimeMillis();
        testShell.shellSort(arr2);
        long timeShell4 = (System.currentTimeMillis() - timeShell3);
        System.out.println("ShellSort 200000: " + timeShell4);


       */
        long timeSelection = System.currentTimeMillis();
        tests.selectionSort(arr);
        long time2selection = (System.currentTimeMillis() - timeSelection);
        System.out.println("SelectionSort 10000: " + time2selection);

        long timeSelection3 = System.currentTimeMillis();
        tests.selectionSort(arr2);
        long timeSelection4 = (System.currentTimeMillis() - timeSelection3);
        System.out.println("SelectionSort 200000: " + timeSelection4);

    }
}