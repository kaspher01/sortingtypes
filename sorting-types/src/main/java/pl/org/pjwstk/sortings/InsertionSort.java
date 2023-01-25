package pl.org.pjwstk.sortings;

import pl.org.pjwstk.Printer;

public class InsertionSort extends Printer {
    public void sort(int[] A){
        for(int j = 1; j < A.length; j++){
            int key = A[j];
            int i = j-1;
            while (i >= 0 && A[i] > key){
                A[i+1]=A[i];
                i--;
            }
            A[i+1] = key;
        }
    }
}
