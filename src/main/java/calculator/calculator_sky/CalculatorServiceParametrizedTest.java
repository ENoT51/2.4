package calculator.calculator_sky;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.ApplicationArguments;

import java.util.stream.Stream;

public class CalculatorServiceParametrizedTest {

    Service service = new ServiceImpl();
    static Stream<Arguments> data(){
        return Stream.of(Arguments.of(10,2),
                Arguments.of(10,-2),
                Arguments.of(-2,-10),
                Arguments.of(1110,-22),
                Arguments.of(-3333,245),
                Arguments.of(-2340,71)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void plus(int a, int b) {
        int actual = service.plus(a, b);
        int expected = a + b;
        Assertions.assertEquals(actual, expected);
    }
    @ParameterizedTest
    @MethodSource("data")
    void minus(int a, int b) {
        int actual = service.minus(a, b);
        int expected = a - b;
        Assertions.assertEquals(actual, expected);
    }
    @ParameterizedTest
    @MethodSource("data")
    void multuply(int a, int b) {
        int actual = service.multiply(a, b);
        int expected = a * b;
        Assertions.assertEquals(actual, expected);
    }
    @ParameterizedTest
    @MethodSource("data")
    void divide(int a, int b) {
        int actual = service.divide(a, b);
        int expected = a / b;
        Assertions.assertEquals(actual, expected);
    }

    }

