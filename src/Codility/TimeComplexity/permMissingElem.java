package Codility.TimeComplexity;

//An array A consisting of N different integers is given.
//        The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

//For example, given array A such that:
//
//        A[0] = 2
//        A[1] = 3
//        A[2] = 1
//        A[3] = 5
//        the function should return 4, as it is the missing element.

import java.util.HashSet;
import java.util.Set;

public class permMissingElem {

    public static void main(String[] args) {
        int A[] = new int[]{2, 3, 1, 5};
        System.out.println(solution(A));

        int B[] = new int[]{};
        System.out.println(solution(B));
    }

    public static int solution(int[] A) {
        int size = A.length + 1; // size of the input array
        Set set = new HashSet<>();

        if (A.length == 0){
            return 1;
        }

        // filling out the set
        for (int i = 0; i < size; i++) {
            set.add(i);
        }

        // checking which elements is not in the set
        for (int i = 0; i < size - 1; i++) {
            if (set.contains(A[i])) {
                set.remove(A[i]);
            }
        }

        int result = 0;
        for (int i = 1; i < size ; i++) {
            if (set.contains(i)) {
                result = i;
            }
        }

        return result;
    }
}