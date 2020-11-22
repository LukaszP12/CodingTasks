package Codility.TimeComplexity;

public class TapeEquilibrium3 {

    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4, 3};
        System.out.println(A.length);
        System.out.println(smallestDiff3(A));
    }

    public static int smallestDiff3(int A[]) {

        int[] leftSum = new int[A.length];
        int[] rightSum = new int[A.length];

        leftSum[0] = A[0];

        for (int i = 1; i < A.length; i++) {
            leftSum[i] = leftSum[i - 1] + A[i];
        }

        rightSum[A.length - 1] = A[A.length - 1];

        for (int i = A.length - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + A[i];
        }

        int best = Integer.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            int diff = Math.abs(leftSum[i] - rightSum[i + 1]);
            if (diff < best) {
                best = diff;
            }
        }

        return best;
    }

}