package Codility.TimeComplexity;

// 100%

public class permMissingElem1 {

    public static void main(String[] args) {
        int tab[] = {1,2,3,5};
        System.out.println(solution(tab));
    }

    public static int solution(int[] A){
        int sum = 0;
        int sum1 = 0;
        int size = A.length + 1;

        for (int i=0;i<size;i++){
            sum += i+1;
        }

        for(int i=0;i<A.length;i++){
            sum1 += A[i];
        }

        return sum - sum1;
    }

}
