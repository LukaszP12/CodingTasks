package Codility.countingElements;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {

// We wanna check, if an array contains a permutation
//    A[0] = 4
//    A[1] = 1
//    A[2] = 3
//    A[3] = 2

    public static void main(String[] args) {
        int tab[] = {4,1,3,2};
        System.out.println(permCheck(tab));
    }

    public static int permCheck(int[] Arr){

        Set seen = new HashSet<>();
        // if elements repeat then it should give false
        for (int i=0;i< Arr.length; i++){
            if (seen.add(Arr[i]) == false ){
                return 0;
            }
        }

        // permutation should be size of Arr.size
        if (seen.size() != Arr.length) return 0;

        //checking for missing elements
        for (int i=1;i<=Arr.length;i++){
            if (!seen.contains(i)){
                return 0;
            }
        }

        return 1;
    }

}
