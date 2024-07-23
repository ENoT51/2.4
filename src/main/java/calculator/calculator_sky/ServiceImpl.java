
package calculator.calculator_sky;


@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    @Override
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }
@Override
    public int plus(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
    @Override
    public int minus(int num1, int num2) {
        int difference = num1 - num2;
        return difference;
    }
    @Override
    public int multiply(int num1, int num2) {
        int multiply = num1 * num2;
        return multiply;
    }
    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0){
            throw new DivisionByZeroException();
        }
        int divide = num1 / num2;
        return divide;
    }
}
