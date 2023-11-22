package calculator;

import interfaces.Mood;
import operations.Operation;

public class Calculator {
    Mood mood;
    private Operation headOperation;

    public double getLastResult() {
        return lastResult;
    }

    public void setLastResult(double lastResult) {
        this.lastResult = lastResult;
    }

    private double lastResult;
    public double calculate(double firstNumber, double secondNumber, String operator) throws InterruptedException {
        return headOperation.calculate(firstNumber, secondNumber, operator);

    }
    public void setHeadOperation(Operation headOperation) {
        this.headOperation = headOperation;
    }
    public void setMood(Mood mood) {
        this.mood = mood;
    }
    public Mood getMood() {
        return mood;
    }

    public MementoCalculator save() {
        return new MementoCalculator(lastResult);
    }
    public void restore(MementoCalculator mementoCalculator) {
        lastResult = mementoCalculator.lastResult;
    }

    public class MementoCalculator {
        private final double lastResult;

        public MementoCalculator(double lastResult) {
            this.lastResult = lastResult;
        }
    }
}
