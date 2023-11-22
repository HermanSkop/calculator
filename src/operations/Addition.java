package operations;
public class Addition extends Operation {
    protected String operator = "+";
    public Addition(Operation nextOperation) throws InterruptedException {
        super(nextOperation);
    }
    @Override
    public double calculate(double firstNumber, double secondNumber, String operator) throws InterruptedException {
        if(operator.equals(this.operator)) return firstNumber + secondNumber;
        else return calculateNext(firstNumber, secondNumber, operator);
    }
}
