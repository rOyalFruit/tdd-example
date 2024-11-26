package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {
    @Test
    @DisplayName("1 + 2 = 3")
    public void testPlus1(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(1, 2);

//        assertEquals(3, rs);
        assertThat(rs).isEqualTo(3);
    }

    @Test
    @DisplayName("2 + 10 = 12")
    public void testPlus2(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(2, 10);

        assertEquals(12, rs);
    }

    @Test
    @DisplayName("10 + 20 = 30")
    public void testPlus3(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(10, 20);

        assertEquals(30, rs);
    }

    @Test
    @DisplayName("1 * 2 = 2")
    public void testMultiply1(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.multiply(1, 2);

        assertEquals(2, rs);
    }

    @Test
    @DisplayName("2 * 10 = 20")
    public void testMultiply2(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.multiply(2, 10);

        assertEquals(20, rs);
    }

    @Test
    @DisplayName("10 * 20 = 200")
    public void testMultiply3(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.multiply(10, 20);

        assertEquals(200, rs);
    }

    @Test
    @DisplayName("1 - 2 = -1")
    public void testMinus1(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.minus(1, 2);

        assertEquals(-1, rs);
    }

    @Test
    @DisplayName("2 - 10 = -8")
    public void testMinus2(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.minus(2, 10);

        assertEquals(-8, rs);
    }

    @Test
    @DisplayName("10 - 20 = -10")
    public void testMinus3(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.minus(10, 20);

        assertEquals(-10, rs);
    }

    @Test
    @DisplayName("1 / 2= 0")
    public void testDivide1(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.divide(1, 2);

        assertEquals(0, rs);
    }

    @Test
    @DisplayName("10 / 2 = 5")
    public void testDivide2(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.divide(10, 2);

        assertEquals(5, rs);
    }

    @Test
    @DisplayName("10 / 20 = 0")
    public void testDivide3(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.divide(10, 20);

        assertEquals(0, rs);
    }

    @Test
    @DisplayName("2 % 1 = 0")
    public void testRemainder1(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.remainder(2, 1);

        assertEquals(0, rs);
    }

    @Test
    @DisplayName("2 % 10 = 2")
    public void testRemainder2(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.remainder(2, 10);

        assertEquals(2, rs);
    }

    @Test
    @DisplayName("10 % 20 = 10")
    public void testRemainder3(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.remainder(10, 20);

        assertEquals(10, rs);
    }
}
