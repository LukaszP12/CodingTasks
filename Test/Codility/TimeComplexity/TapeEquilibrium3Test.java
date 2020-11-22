package Codility.TimeComplexity;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static Codility.TimeComplexity.TapeEquilibrium.smallestDiff;
import static org.junit.jupiter.api.Assertions.*;

class TapeEquilibrium3Test {

    @Test
    void smallestDiff3() {
        //given
        int[] A = {3,1,2,4,3};
        int[] minus = {-1,-2,-3,-4};
        int[] input = {5, 6, 2, 4, 1};
        int[] input1 = {-1000,1000};
        int[] input2 = {-10, -20, -30, -40, 100};

        //when
        int result = smallestDiff(A);
        int resultMinus = smallestDiff(minus);
        int inputResult = smallestDiff(input);
        int inputResult1 = smallestDiff(input1);
        int inputResult2 = smallestDiff(input2);

        //then
        Assert.assertEquals(result,1);
        Assert.assertEquals(resultMinus,2);
        Assert.assertEquals(inputResult,4);
        Assert.assertEquals(inputResult1,2000);
        Assert.assertEquals(inputResult2,39);
    }


}