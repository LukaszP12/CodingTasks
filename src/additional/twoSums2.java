package additional;

import java.util.HashMap;
import java.util.Map;

public class twoSums2 {

    public static void main(String[] args) {
        int tab[] = {2,4,6,8,10,12,14};
        System.out.println(  getTwoSums(tab,14)[0] + " " + getTwoSums(tab,14)[1] ); // the result is an array, so we need to refer to indexes
    }

    public static int[] getTwoSums(int[] numbers,int target){
        Map<Integer,Integer> visitedNumbers = new HashMap<>();
        for (int i=0; i<numbers.length;i++){
            int delta = target - numbers[i];
            if (visitedNumbers.containsKey(delta)){
                return new int[]{i,visitedNumbers.get(delta)};
            }
            visitedNumbers.put(numbers[i],i);
        }
        return new int[] {-1,-1};
    }

}