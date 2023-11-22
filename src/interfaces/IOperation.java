package interfaces;

public interface IOperation {
    public abstract double calculate(double firstNumber, double secondNumber, String operator) throws InterruptedException;
}
