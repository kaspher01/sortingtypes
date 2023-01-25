package pl.org.pjwstk;

import pl.org.pjwstk.sortings.HeapSort;
import pl.org.pjwstk.sortings.InsertionSort;
import pl.org.pjwstk.sortings.QuickSort;

import java.util.Random;

public class Application {
    public static void main(String[] args) {

        int[] AH = new Random().ints(100000, 0, 1000).toArray();
        int[] AQ = AH.clone();
        int[] AI = AH.clone();

        var heapSort = new HeapSort();
        var quickSort = new QuickSort();
        var insertionSort = new InsertionSort();

        long startTimeHeap = System.nanoTime();
        heapSort.sort(AH);
        long endTimeHeap = System.nanoTime();

        long startTimeQuick = System.nanoTime();
        quickSort.sort(AQ, 0, AQ.length-1);
        long endTimeQuick = System.nanoTime();

        long startTimeInsertion = System.nanoTime();
        insertionSort.sort(AI);
        long endTimeInsertion = System.nanoTime();

        //Heap-sort
        System.out.print("Heap sort - sorted ascending: ");
        heapSort.print(AH);
        System.out.print("Heap sort - sorted descending: ");
        heapSort.reversePrint(AH);

        //Quick-sort (Lomuto)
        System.out.print("Quick sort - sorted ascending: ");
        quickSort.print(AQ);
        System.out.print("Quick sort - sorted descending: ");
        quickSort.reversePrint(AQ);

        //Insertion-sort
        System.out.print("Insertion sort - sorted ascending: ");
        quickSort.print(AI);
        System.out.print("Insertion sort - sorted descending: ");
        quickSort.reversePrint(AI);


        //Execution times
        System.out.print("Heap sort - execution time: ");
        System.out.println((endTimeHeap-startTimeHeap)/1000000 + " ms");

        System.out.print("Quick sort - execution time: ");
        System.out.println((endTimeQuick-startTimeQuick)/1000000 + " ms");

        System.out.print("Insertion sort - execution time: ");
        System.out.println((endTimeInsertion-startTimeInsertion)/1000000 + " ms");
    }


}
