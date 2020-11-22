package Codility.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static Codility.Arrays.cyclicRotations.cyclicRotations;

class cyclicRotationsTest {

    @Test
    public void cyclicTest() {
    //given
    int tab[] = {1,2,3,4,5};
    int k = 2;

    //when
        int[] intsResults = cyclicRotations(tab, k);

        //then
        int[] expectedTab = {4,5,1,2,3};
        Assertions.assertArrayEquals(expectedTab,intsResults);

    }


}