package pl.org.pjwstk.sortings;


import pl.org.pjwstk.Printer;

public class HeapSort extends Printer {

    public void sort(int[] A){
        buildMaxHeap(A);
        for(int i = A.length-1; i > 0; i--){
            int tmp = A[0];
            A[0] = A[i];
            A[i] = tmp;
            maxHeapify(A, i,0);
        }
    }

    private void buildMaxHeap(int[] A){
        for(int i = (int) Math.floor((double)A.length/2-1); i >= 0; i--){
            maxHeapify(A, A.length, i);
        }
    }

    private void maxHeapify(int[] A, int len, int i){
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left < len && A[left] > A[i]) {
            largest = left;
        }
        if(right < len && A[right] > A[largest]){
            largest = right;
        }
        if(largest != i){
            int tmp = A[i];
            A[i] = A[largest];
            A[largest] = tmp;
            maxHeapify(A, len, largest);
        }
    }


}
