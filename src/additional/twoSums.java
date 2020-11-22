package additional;

import java.util.Arrays;
import java.util.List;

public class twoSums {

//    Challenge: Given an array and an expected sum, you are required to find the index of the two numbers in the array whose sum adds up to the number
//    Given an array of integers, return indices of two numbers such that they add up to specific target. You may assume that each input would have
//    exactly one solution, and you may not use the same element twice

    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5,15,20};
        sum2Numbers(tab,9);
    }

    public static void sum2Numbers(int A[],int target){
        int[] result = new int[2];

        //filter numbers greater than target
        int[] afterFilterGreater = Arrays.stream(A).filter(x -> x > target).toArray();

        // looking for matches
        for (int i=0; i<afterFilterGreater.length; i++){
            for (int j=0;j<afterFilterGreater.length;j++){
                if (afterFilterGreater[i] + afterFilterGreater[j] == target){
                    System.out.println(afterFilterGreater[i] + "and " + afterFilterGreater[j] + "equals" + target);
                }
            }
        }
    }


}
