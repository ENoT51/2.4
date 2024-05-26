package calculator.calculator_sky;

public class DivisionByZeroException  extends IllegalArgumentException{
    public DivisionByZeroException() { super();}
    public DivisionByZeroException (String s){super(s);}
    public DivisionByZeroException(String message, Throwable cause){super(message, cause);}
    public DivisionByZeroException(Throwable cause){ super(cause);}
}
