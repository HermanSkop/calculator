package calculatorBuilder;

import calculator.Calculator;
import interfaces.Mood;
import operations.*;

import static interfaces.Mood.HAPPY;

public class SimplifiedCalculatorBuilder extends CalculatorBuilder{
    @Override
    public Calculator setCalculatorMood() {
        calculator.setMood(HAPPY);
        return calculator;
    }
    @Override
    public Calculator build() {
        return calculator;
    }

    @Override
    public Calculator setInitialValue(double initialValue) {
        calculator.setLastResult(initialValue);
        return calculator;
    }

    @Override
        public Calculator setOperations() throws InterruptedException {
            calculator.setHeadOperation(new Multiplication(new Division(new Addition(new Subtraction(null)))));
            return calculator;
        }
}
