package Sorting;

//Compute number of distinct values in an array.

import java.util.HashSet;
import java.util.Set;

public class Distinct {

    public static int countDistinct(int[] tab){
        Set set = new HashSet();

        for (int i = 0; i<tab.length; i++){
            set.add(tab[i]);
        }

        return set.size();
    }

    public static void main(String[] args) {
        int []test = {2,1,1,2,3,1};
        System.out.println(countDistinct(test));
    }

}