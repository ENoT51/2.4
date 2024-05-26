package calculator.calculator_sky;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorServiceTest {
    Service service = new ServiceImpl();

    @Test
    public void plus_when_negative_result() {
        int actual = service.plus(-3, -7);
        assertEquals(-10, actual);
    }

    @Test
    public void plus_when_positive_result() {
        int actual = service.plus(3, 7);
        assertEquals(10, actual);
    }

    @Test
    public void minus_when_negative_result() {
        int actual = service.minus(3, 7);
        assertEquals(-4, actual);
    }

    @Test
    public void minus_when_positive_result() {
        int actual = service.minus(7, 3);
        assertEquals(4, actual);
    }

    @Test
    public void multiply_when_negative_result() {
        int actual = service.multiply(-3, 7);
        assertEquals(-21, actual);
    }

    @Test
    public void multiply_when_positive_result() {
        int actual = service.multiply(-7, -3);
        assertEquals(21, actual);
    }

    @Test
    public void divide_when_negative_result() throws Exception {
        int actual = service.divide(10, -2);
        assertEquals(-5, actual);
    }

    @Test
    public void divide_when_positive_result() throws Exception {
        int actual = service.divide(10, 2);
        assertEquals(5, actual);
    }

    @Test
    public void when_divide_by_zero_throw_Exception() {
        Assertions.assertThrows(DivisionByZeroException.class, () -> {
            service.divide(10, 0);

        });
    }
}
