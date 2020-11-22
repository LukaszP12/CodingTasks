package Codility.TimeComplexity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static Codility.TimeComplexity.permMissingElem1.solution;
import static org.junit.jupiter.api.Assertions.*;

class permMissingElem1Test {

    @Test
    public void permMissingElem1Test() {
        //given
        int tab[] = {1,2,3,5};
        //when
        int solution = solution(tab);
        //then
        Assertions.assertEquals(solution,4);
    }

}