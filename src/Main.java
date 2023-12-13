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
        int[] arr;
        int[] arr2;
        arr = new int[1000000];
        arr2 = new int[200000];
        Random rand = new Random();
        for (int i = 0; i > 10000; i++) {
            arr[i] = rand.nextInt(1000000);
        }
        for (int i = 0; i > 200000; i++) {
            arr[i] = rand.nextInt(200000);
        }

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







        long timeSelection = System.currentTimeMillis();
        tests.selectionSort(arr);
        long time2selection = (System.currentTimeMillis() - timeSelection);
        System.out.println("SelectionSort 10000: " + time2selection);

        long timeSelection3 = System.currentTimeMillis();
        tests.selectionSort(arr2);
        long timeSelection4 = (System.currentTimeMillis() - timeSelection3);
        System.out.println("SelectionSort 200000: " + timeSelection4);


        long timeInsertion = System.currentTimeMillis();
        testi.insertionSort(arr);
        long time2insertion = (System.currentTimeMillis() - timeInsertion);
            System.out.println("InsertionSort 10000: " + time2insertion);

        long timeInsertion3 = System.currentTimeMillis();
        testi.insertionSort(arr2);
        long timeInsertion4 = (System.currentTimeMillis() - timeInsertion3);
        System.out.println("InsertionSort 200000: " + timeInsertion4);


        long timeQuick = System.currentTimeMillis();
        testq.quickSort(arr);
        long time2Quick = (System.currentTimeMillis() - timeQuick);
        System.out.println("QuickSort 10000: " + time2Quick);

        long timequick3 = System.currentTimeMillis();
        testq.quickSort(arr2);
        long timequick4 = (System.currentTimeMillis() - timequick3);
        System.out.println("QuickSort 200000: " + timequick4);
    }


    }
