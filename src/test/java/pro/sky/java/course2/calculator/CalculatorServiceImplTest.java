package pro.sky.java.course2.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceImplTest {
    private final CalculatorService out = new CalculatorServiceImpl();

    @Test
    public void plus() {
        String arg1, arg2;
        String expected, actual;

        arg1 = "100";
        arg2 = "30";
        expected = "100 + 30 = 130";
        actual = out.plus(arg1, arg2);
        Assertions.assertEquals(expected, actual);

        arg1 = "5.3";
        arg2 = "2.81";
        expected = "5,3 + 2,81 = 8,11";
        actual = out.plus(arg1, arg2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minus() {
        String arg1, arg2;
        String expected, actual;

        arg1 = "100";
        arg2 = "30";
        expected = "100 - 30 = 70";
        actual = out.minus(arg1, arg2);
        Assertions.assertEquals(expected, actual);

        arg1 = "5.3";
        arg2 = "2.81";
        expected = "5,3 - 2,81 = 2,49";
        actual = out.minus(arg1, arg2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void multiply() {
        String arg1, arg2;
        String expected, actual;

        arg1 = "100";
        arg2 = "30";
        expected = "100 * 30 = 3000";
        actual = out.multiply(arg1, arg2);
        Assertions.assertEquals(expected, actual);

        arg1 = "5.3";
        arg2 = "2.81";
        expected = "5,3 * 2,81 = 14,893";
        actual = out.multiply(arg1, arg2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divide() {
        String arg1, arg2;
        String expected, actual;

        arg1 = "100";
        arg2 = "20";
        expected = "100 / 20 = 5";
        actual = out.divide(arg1, arg2);
        Assertions.assertEquals(expected, actual);

        arg1 = "5.3";
        arg2 = "2.81";
        expected = "5,3 / 2,81 = 1,886121";
        actual = out.divide(arg1, arg2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divideByZero() {
        String arg1 = "20";
        String arg2 = "0";
        Assertions.assertThrows(DivideByZero.class, () -> out.divide(arg1, arg2));
    }



}
