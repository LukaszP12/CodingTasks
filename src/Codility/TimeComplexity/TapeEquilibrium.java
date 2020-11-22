package Codility.TimeComplexity;

public class TapeEquilibrium {

    public static void main(String[] args) {
        int[] A = {3,1,2,4,3};
        System.out.println(smallestDiff(A));

        int[] input = {5, 6, 2, 4, 1};
        System.out.println(smallestDiff(input));
    }

    public static int smallestDiff(int[] A){

        int leftValue = A[0];
        int rightValue = A[A.length-1];
        int leftCursor = 1;
        int rightCursor = A.length - 1;

        while (leftCursor < rightCursor) {
            if (Math.abs(leftValue + A[leftCursor]) <= Math.abs(rightValue + A[rightCursor-1])){
                leftValue = leftValue + A[leftCursor];
                leftCursor++;
            }else {
                rightValue = rightValue + A[rightCursor-1];
                rightCursor--;
            }

        }

        return Math.abs(rightValue-leftValue);
    }


}
