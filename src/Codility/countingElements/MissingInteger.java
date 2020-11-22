package Codility.countingElements;

import java.util.Arrays;

public class MissingInteger {

    public static void main(String[] args) {
        int A[] = {1, 3, 6, 4, 1, 2};
        System.out.println(missingInteger(A));
    }

    public static int missingInteger(int[] A){
        boolean existingNumbers[] = new boolean[100_001];

        for (int i : A){
            if (i>=1 && i<= 100_001){
                existingNumbers[i-1] = true;
            }
        }

        for (int i = 0; i < existingNumbers.length; i++) {
            if (!existingNumbers[i]){
                return i+1;
            }
        }

        return 1;
    }

}
