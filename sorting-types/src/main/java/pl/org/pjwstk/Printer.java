package pl.org.pjwstk;

public class Printer {
    public void print(int[] A){
        for(int a : A){
            System.out.print(a + "  ");
        }
        System.out.println();
    }

    public void reversePrint(int[] A){
        for(int i = A.length-1; i >= 0; i--){
            System.out.print(A[i] + "  ");
        }
        System.out.println();
    }
}
