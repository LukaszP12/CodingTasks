package Codility.TimeComplexity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static Codility.TimeComplexity.permMissingElem2.solution;
import static org.junit.jupiter.api.Assertions.*;

class permMissingElem2Test {

    @Test
    public void permMissingElem2Test() {
        //given
        int tab[] = {1,2,3,5};
        int B[] = new int[]{};

        //when
        int solution = solution(tab);
        int solution1 = solution(B);

        //then
        Assertions.assertEquals(solution,4);
        Assertions.assertEquals(solution1,1);
    }


}