package calculatorBuilder;

import calculator.Calculator;
import operations.*;

import static interfaces.Mood.ANGRY;

public class EngineeringCalculatorBuilder extends CalculatorBuilder{

    @Override
    public Calculator build() {
        return calculator;
    }
    @Override
    public Calculator setCalculatorMood() {
        calculator.setMood(ANGRY);
        return calculator;
    }

    @Override
    public Calculator setInitialValue(double initialValue) {
        calculator.setLastResult(initialValue);
        return calculator;
    }

    @Override
    public Calculator setOperations() throws InterruptedException {
        calculator.setHeadOperation(new Multiplication(new Division(new Power(null))));
        return calculator;
    }
}
