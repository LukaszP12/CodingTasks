package Codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static Codility.BinaryGap.maxBinaryGap;
import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {

    @Test
    public void test1(){

        //given
        String s = Long.toBinaryString(1041);
        String s1 = Long.toBinaryString(3000);

        // when
        int result = maxBinaryGap(s);
        int result1 = maxBinaryGap(s1);

        //then
        Assertions.assertEquals(result,2);
        Assertions.assertEquals(result1,1);
    }


}