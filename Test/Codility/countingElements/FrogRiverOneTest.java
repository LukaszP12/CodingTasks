package Codility.countingElements;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static Codility.countingElements.FrogRiverOne.frogJump;

class FrogRiverOneTest {

    @Test
    public void testFrogJump() {
        // given
        int A[] = {1,3,1,4,2,3,5,4};
        int B[] = {2,1,3,5,4,1,1,1,1,1};
        int C[] = {1};

        // when
        int jump1 = frogJump(5, A);
        int jump2 = frogJump(5, B);
        int jump3 = frogJump(5, C);

        // then
        Assert.assertEquals(5,jump1);
        Assert.assertEquals(5,jump2);
        Assert.assertEquals(1,jump3);
    }


}