package pl.org.pjwstk.sortings;

import pl.org.pjwstk.Printer;

public class QuickSort extends Printer {
    public void sort(int[] A, int p, int r){
        if(p<r){
            int q = partition(A, p, r);
            sort(A, p, q-1);
            sort(A, q+1, r);
        }
    }

    private int partition(int[] A, int p, int r){
        int pivot = A[r];
        int smaller = p;
        for(int j = p; j <= r-1; j++){
            if(A[j]<=pivot){
                int tmp = A[smaller];
                A[smaller] = A[j];
                A[j] = tmp;
                smaller++;
            }
        }
        int tmp = A[smaller];
        A[smaller] = A[r];
        A[r] = tmp;
        return smaller;
    }

}
