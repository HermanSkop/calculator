package operations;

public class Division extends Operation {
    protected String operator = "/";
    public Division(Operation nextOperation) throws InterruptedException {
        super(nextOperation);
    }
    @Override
    public double calculate(double firstNumber, double secondNumber, String operator) throws InterruptedException {
        if (operator.equals(this.operator))
            if (secondNumber == 0) System.out.println("Cannot divide by zero");
            else return firstNumber / secondNumber;
        else return calculateNext(firstNumber, secondNumber, operator);
        return finalHandler(firstNumber, secondNumber, operator);
    }
}
