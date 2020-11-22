package Codility.countingElements;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static Codility.countingElements.MissingInteger.missingInteger;
import static org.junit.jupiter.api.Assertions.*;

class MissingIntegerTest {

    @Test
    void missingIntegerTest() {
        //given
        int[] ints = new int[100000];
        for (int i=0;i<100_000;i++){
            ints[i] = i + 1;
        }

        //when
        int solution = missingInteger(ints);

        //then
        Assert.assertEquals(100001,solution);
    }


}