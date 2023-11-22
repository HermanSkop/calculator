package calculatorBuilder;

import calculator.Calculator;

public class CalculatorDirector {
    public static Calculator buildCalculator(CalculatorBuilder builder, double initialValue) throws InterruptedException {
        builder.setCalculatorMood();
        builder.setOperations();
        builder.setInitialValue(initialValue);
        return builder.build();
    }
}
