package operations;

import interfaces.IOperation;

public abstract class Operation implements IOperation {
    protected Operation nextOperation;
    protected String operator; // Char representing the operation
    protected Operation(Operation nextOperation) {
        this.nextOperation = nextOperation;
    }
    public void setNext(Operation nextOperation) {
        this.nextOperation = nextOperation;
    }
    protected int finalHandler(double firstNumber, double secondNumber, String operator) throws InterruptedException {
        throw new InterruptedException("Something went wrong, please try again");
    }
    protected double calculateNext(double firstNumber, double secondNumber, String operator) throws InterruptedException {
        if (nextOperation == null) return finalHandler(firstNumber, secondNumber, operator);
        return nextOperation.calculate(firstNumber, secondNumber, operator);
    }
}
