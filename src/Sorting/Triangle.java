package Sorting;

//Determine whether a triangle can be built from a given set of edges.

import java.util.Arrays;

public class Triangle {

    public static int solution(int[] A){
        Arrays.sort(A);

        for (int i = 2; i < A.length ; i++){
            if (A[i-2] + A[i-1] > A[i]){
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int tab[] = {10,2,5,1,8,20};
        System.out.println(solution(tab));
    }

}
