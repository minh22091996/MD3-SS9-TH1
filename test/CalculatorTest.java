import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rikkei.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("ok")
    public void testAdd0And0(){
        int first = 0;
        int second = 0;
        int expected = 0;

        int resurl = Calculator.add(first,second);
        assertEquals(expected,resurl);
    }

        @Test
    @DisplayName("ok1")
    public void testAdd1And0(){
        int first = 1;
        int second = 5;
        int expected = 6;

            int resurl = Calculator.add(first,second);
            assertEquals(expected,resurl);
        }

    @Test
    @DisplayName("ok2")
    public void testAdd0And1(){
        int first = 0;
        int second = 1;
        int expected = 1;

        int resurl = Calculator.add(first,second);
        assertEquals(expected,resurl);
    }

    @Test
    @DisplayName("ok2")
    public void testAdd5And3(){
        int first = 2;
        int second = 3;
        int expected = 5;

        int resurl = Calculator.add(first,second);
        assertEquals(expected,resurl);
    }


    @Test
    @DisplayName("ok")
    public void testSub0And0(){
        int first = 8;
        int second = 6;
        int expected = 2;

        int resurl = Calculator.sub(first,second);
        assertEquals(expected,resurl);
    }

    @Test
    @DisplayName("ok1")
    public void testSub1And0(){
        int first = 1;
        int second = 0;
        int expected = 1;

        int resurl = Calculator.sub(first,second);
        assertEquals(expected,resurl);
    }

    @Test
    @DisplayName("ok2")
    public void testSub0And1(){
        int first = 0;
        int second = 1;
        int expected = -1;

        int resurl = Calculator.sub(first,second);
        assertEquals(expected,resurl);
    }

    @Test
    @DisplayName("ok2")
    public void testSub5And3(){
        int first = 5;
        int second = 3;
        int expected = 2;

        int resurl = Calculator.sub(first,second);
        assertEquals(expected,resurl);
    }

}
