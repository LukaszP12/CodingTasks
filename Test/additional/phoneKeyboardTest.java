package additional;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class phoneKeyboardTest {

    @Test
    public void encodeSimpleTest() {
        //given
        String name = "Lukasz";

        //when
        phoneKeyboard phoneKeyboard = new phoneKeyboard();
        String result = phoneKeyboard.encodeSimple(name);

        //then
        Assert.assertEquals("5558855277779999",result);
    }

}