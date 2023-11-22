package calculatorBuilder;

import calculator.Calculator;
import interfaces.Mood;

public abstract class CalculatorBuilder implements interfaces.ICalculatorBuilder {
    protected Calculator calculator = new Calculator();

    public Calculator setCalculatorMood() {
        calculator.setMood(Mood.HAPPY);
        return calculator;
    }

    public Calculator reset() {
        calculator = new Calculator();
        return null;
    }

}
