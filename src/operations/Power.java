package operations;

public class Power extends Operation{
    protected String operator = "^";

    public Power(Operation nextOperation) {
        super(nextOperation);
    }

    @Override
    public double calculate(double firstNumber, double secondNumber, String operator) throws InterruptedException {
        if (operator.equals(this.operator)) return (int) Math.pow(firstNumber, secondNumber);
        else return calculateNext(firstNumber, secondNumber, operator);
    }
}
