package Codility.countingElements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public static void main(String[] args) {
        int A[] = {1,3,1,4,2,3,5,4};
        System.out.println(frogJump(5,A));

        int B[] = {2,1,3,5,4,1,1,1,1,1};
        System.out.println(frogJump(5,B));

        int C[] = {1};
        System.out.println(frogJump(1,C));
    }

    public static int frogJump(int x, int[] A) {

        Set set = new HashSet();
        int result = 0;

        for (int i = 1; i <= x; i++) {
            set.add(i);
        }

        for (int i = 0; i < A.length; i++) {
            if (!set.isEmpty() || set.contains(A[i])) {
                set.remove(A[i]);
            } else {
                break;
            }
            if (set.isEmpty()){
                result = i;
                return result;
            }
        }

        return -1;
    }


}
