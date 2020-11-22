package Codility.Arrays;

import java.util.Arrays;

class cyclicRotations {

    public static void main(String[] args) {

        int A[] = {1,2,3,4,5};

        System.out.println(Arrays.toString(cyclicRotations(A, 2)));
    }

        public static int[] cyclicRotations(int[] A, int K) {

           int[] new_array = new int[A.length];

           for (int i=0; i<A.length;i++){
               int new_position = (i+K) % A.length;
               new_array[new_position] = A[i];
           }

           return new_array;
        }
    }

