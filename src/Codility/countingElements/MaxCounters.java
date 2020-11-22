package Codility.countingElements;

import javax.swing.*;

public class MaxCounters {

    public static void main(String[] args) {
//        A[0] = 3
//        A[1] = 4
//        A[2] = 4
//        A[3] = 6
//        A[4] = 1
//        A[5] = 4
//        A[6] = 4
//        [3,2,2,4,2]

        int A[] = {3,4,4,6,1,4,4};
        int[] solution = solution(5, A);
        for (int i=0;i<solution.length;i++){
            System.out.println(solution[i]);
        }
    }

    public static int[] solution(int N, int[] A) {
        int[] result = new int[N];

        int max = 0;
        int maxCount = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                result[A[i] - 1]++;
                if (result[A[i] - 1] + maxCount > max) {
                    max = result[A[i] - 1] + maxCount;
                }
            } else if (A[i] > N) {
                maxCount += max;
                //wyzerowac
                    for (int j=0;j<N;j++){ result[j]=0; }
            }
        }

        for (int i=0;i<maxCount;i++){
            for (int j=0;j<N;j++){
                result[j]++;
            }
        }

        return result;
    }

}