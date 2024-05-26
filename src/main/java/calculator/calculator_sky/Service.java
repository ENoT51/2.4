package calculator.calculator_sky;


@org.springframework.stereotype.Service
public class Service {

    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    public int plus(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
    public int minus(int num1, int num2) {
        int difference = num1 - num2;
        return difference;
    }
    public int multiply(int num1, int num2) {
        int multiply = num1 * num2;
        return multiply;
    }
    public int divide(int num1, int num2) {
        int divide = num1 / num2;
        return divide;
    }
}
