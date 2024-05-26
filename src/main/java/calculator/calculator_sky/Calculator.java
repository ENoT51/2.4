package calculator.calculator_sky;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
    private final Service service;
    public Calculator(Service service) {
        this.service = service;
    }

    @RequestMapping(path = "/calculator")
    public String calculator() {
        return service.calculator();
    }
    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam (value = "num1", required = false) Integer num1,
                       @RequestParam (value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "один (оба) из параметров не определён(ы)";
        }
            return num1 + " + " + num2 + " = " + service.plus(num1, num2);
        }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam (value = "num1", required = false) Integer num1,
                        @RequestParam (value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "один (оба) из параметров не определён(ы)";
        }
        return num1 + " - " + num2 + " = " + service.minus(num1, num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam (value = "num1", required = false) Integer num1,
                           @RequestParam (value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "один (оба) из параметров не определён(ы)";
        }
        return num1 + " * " + num2 + " = " + service.multiply(num1, num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam (value = "num1", required = false) Integer num1,
                         @RequestParam (value = "num2", required = false) Integer num2) {
        if (num2 ==0 ){
            return "На 0 делить нельзя";
        }
        else if (num1 == null || num2 == null) {
            return "один (оба) из параметров не определён(ы)";
        }
        return num1 + " / " + num2 + " = " + service.divide(num1, num2);
    }

}
