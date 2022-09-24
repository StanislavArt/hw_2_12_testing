package pro.sky.java.course2.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class CalculatorServiceImplParameterizedTest {
    private final CalculatorService cut = new CalculatorServiceImpl();

    public static Stream<Arguments> getParamsForTests() {
        return Stream.of(
                Arguments.of("plus", "100", "30", "100 + 30 = 130"),
                Arguments.of("plus", "5.3", "2.81", "5,3 + 2,81 = 8,11"),
                Arguments.of("minus", "100", "30", "100 - 30 = 70"),
                Arguments.of("minus", "5.3", "2.81", "5,3 - 2,81 = 2,49"),
                Arguments.of("multiply", "100", "30", "100 * 30 = 3000"),
                Arguments.of("multiply", "5.3", "2.81", "5,3 * 2,81 = 14,893"),
                Arguments.of("divide", "100", "20", "100 / 20 = 5"),
                Arguments.of("divide", "5.3", "2.81", "5,3 / 2,81 = 1,886121")
        );
    }

    @ParameterizedTest
    @MethodSource("getParamsForTests")
    public void runTests(String operation, String arg1, String arg2, String expected) {
        String actual = switch (operation) {
            case "plus" -> cut.plus(arg1, arg2);
            case "minus" -> cut.minus(arg1, arg2);
            case "multiply" -> cut.multiply(arg1, arg2);
            case "divide" -> cut.divide(arg1, arg2);
            default -> null;
        };
        Assertions.assertNotNull(actual);
        Assertions.assertEquals(expected, actual);
    }
}
