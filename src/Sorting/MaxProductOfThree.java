package Sorting;

import java.util.Arrays;

public class MaxProductOfThree {

    public static int maxProduct(int A[]){
        int max = Integer.MIN_VALUE;

        Arrays.sort(A);

        // 1. possible answers 3 biggest positive number
        // 2. possible answers 1 biggest positive number and 2 smallest negative numbers

        return A[A.length-3]*A[A.length-2]*A[A.length-1] >= A[0]*A[1]*A[A.length-1] ? A[A.length-3]*A[A.length-2]*A[A.length-1] : A[0]*A[1]*A[A.length-1];
    }

    public static void main(String[] args) {
        int tab[] = {-3,1,2,-2,5,6};
        System.out.println(maxProduct(tab));
    }

}
