package Codility.TimeComplexity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static Codility.TimeComplexity.permMissingElem.solution;
import static org.junit.jupiter.api.Assertions.*;

class permMissingElemTest {

    @Test
    public void permMissingElemTest() {
        //given
        int A[] = new int[]{2, 3, 1, 5};

        // when
        int solution = solution(A);

        //then
        Assertions.assertEquals(solution,4);
    }

}