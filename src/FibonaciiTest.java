import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class FibonaciiTest {

    @org.junit.jupiter.api.Test
    void seq() {
        //given
        Fibonacii fibonacii;

        //when
        int result = Fibonacii.seq(5);

        //then
        Assertions.assertEquals(result,11);

    }


}