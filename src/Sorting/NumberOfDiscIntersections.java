package Sorting;

import java.util.Arrays;

public class NumberOfDiscIntersections {
//    Compute the number of intersections in a sequence of discs.

    public static int solution(int[] A){
        // main idea
        // 1. store all the "lower points" and "upper points" of the discs
        // 2. count the intersections (if one upper point > one lower point)

        long[] lower = new long[A.length];
        long[] upper = new long[A.length];

        for (int i=0;i<A.length;i++){
            lower[i] = i - (long)A[i];
            upper[i] = i + (long)A[i];
        }

        // "sort" the "lower points" and the "upper points"
        Arrays.sort(upper);
        Arrays.sort(lower);

        int intersection = 0;
        int j = 0;

        // scan the upper points
        for (int i=0; i<A.length;i++){
            while (j < A.length && upper[i] >= lower[j]){
                intersection = intersection + j;
                intersection = intersection - i;
                j++;
            }
        }

        if (intersection > 10_000_000)
            return -1;

        return intersection;
    }

    public static void main(String[] args) {
        int A[] = {1,5,2,1,4,0};
        System.out.println(solution(A));
    }

}
