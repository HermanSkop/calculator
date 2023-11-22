package interfaces;

import calculator.Calculator;
import operations.Operation;
public interface ICalculatorBuilder {
    public Calculator reset();
    public Calculator setInitialValue(double initialValue);
    public Calculator setOperations() throws InterruptedException;
    public Calculator setCalculatorMood();
    public Calculator build();
}
