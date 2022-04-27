package pro.sky.skyprospringdemo.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static pro.sky.skyprospringdemo.CalculatorServiceImplTestConstants.*;

class CalculatorServiceImplTest {

    private CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    void multiply() {
        int actual1 = ZERO * ONE;
        int actual2 = THREE * MINUS_ONE;
        Assertions.assertEquals(calculatorService.multiply(ZERO, ONE), actual1);
        Assertions.assertEquals(calculatorService.multiply(THREE, MINUS_ONE), actual2);
    }

    @Test
    void plus() {
        int actual1 = TWO + ONE;
        int actual2 = ONE + MINUS_TWO;
        Assertions.assertEquals(calculatorService.plus(TWO, ONE), actual1);
        Assertions.assertEquals(calculatorService.plus(ONE, MINUS_TWO), actual2);
    }

    @Test
    void minus() {
        int actual1 = MINUS_THREE - ONE;
        int actual2 = MINUS_TWO - MINUS_TWO;
        Assertions.assertEquals(calculatorService.minus(MINUS_THREE, ONE), actual1);
        Assertions.assertEquals(calculatorService.minus(MINUS_TWO, MINUS_TWO), actual2);
    }

    @Test
    void divide() {
       int actual1 = TWO / ONE;
        int actual2 = THREE / THREE;
       Assertions.assertEquals(calculatorService.divide(TWO, ONE), actual1);
        Assertions.assertEquals(calculatorService.divide(THREE, THREE), actual2);

    }
}