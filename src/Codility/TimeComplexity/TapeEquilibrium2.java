package Codility.TimeComplexity;

import java.util.logging.Logger;

public class TapeEquilibrium2 {

    public static void main(String[] args) {
        System.out.println("int[] A = {3,1,2,4,3};\n");
        int[] A = {3,1,2,4,3};
        System.out.println(smallestDiff2(A));
    }

    // second solution

    public static int smallestDiff2(int A[]) {
        int maxMin = Integer.MAX_VALUE;

        //outer loop
        for (int i = 0; i < A.length - 1; i++) {

            int sumLeft = 0;
            for (int j = 0; j <= i; j++) {
                sumLeft += A[j];
            }

            int sumRight = 0;
            for (int k = A.length - 1; k > i; k--) {
                sumRight += A[k];
            }

            int diff = Math.abs(sumLeft - sumRight);

            if (diff < maxMin) {
                maxMin = diff;
            }
        }

        return maxMin;
    }

}