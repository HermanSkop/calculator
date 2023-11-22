import calculator.Calculator;
import calculatorBuilder.CalculatorDirector;
import calculatorBuilder.EngineeringCalculatorBuilder;
import calculatorBuilder.SimplifiedCalculatorBuilder;
import interfaces.Mood;

import java.util.*;

public class Main {
    static ArrayDeque<Calculator.MementoCalculator> mementos = new ArrayDeque<>();
    static Calculator calculator;
    static double firstNumber;
    static double secondNumber;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        try{
            if(args.length != 2){
                throw new Exception();
            }
            firstNumber = Double.parseDouble(args[1]);
        }
        catch (Exception e){
            System.out.println("You must provide 2 arguments: calculator type(simple or eng) and starting number");
            return;
        }
        String calculatorType = args[0];

        if (calculatorType.equals("simple"))
            calculator = CalculatorDirector.buildCalculator(new SimplifiedCalculatorBuilder(), firstNumber);
        else if (calculatorType.equals("eng"))
            calculator = CalculatorDirector.buildCalculator(new EngineeringCalculatorBuilder(), firstNumber);
        else {
            System.out.println("Please enter a valid calculator type(simple or eng)");
            return;
        }

        startCalculator();
    }

    public static void startCalculator() {
        String input;
        String operator;

        while (true) {
            try{
                System.out.println("Current result: " + firstNumber);
                System.out.print("Input operation(+,-,*,/,^): ");
                operator = scanner.nextLine();

                if (operator.equals("rollback")) {
                    rollback();
                    continue;
                }
                System.out.print("Input second number: ");

                input = scanner.nextLine();
                if (input.equals("rollback")) {
                    rollback();
                    continue;
                }
                secondNumber = Double.parseDouble(input);
                try {
                    firstNumber = calculator.calculate(firstNumber, secondNumber, operator);
                } catch (InterruptedException e) {
                    System.out.println(calculator.getMood() == Mood.HAPPY ? "--Seems like the sign is incorrect or is not supported"
                            : "--What for are you having an engineer degree? Calculate those foolish operations by yourself. " +
                            "I was invented for greater things. Pathetic");
                    continue;
                }
                save();
            }
            catch(Exception e){
                if (calculator.getMood() == Mood.ANGRY)
                    System.out.println("--WTF is this? Can't you read the instruction before touching the keyboard?");
                else System.out.println("--You are not following the instruction, please try again.");
            }
        }
    }
    public static void rollback() {
        if (mementos.isEmpty()) {
            System.out.println(calculator.getMood() == Mood.HAPPY ? "--Nothing to rollback"
                    : "--You are trying to rollback, but DID YOU EVEN DO ANYTHING YET?! Idiot");
            return;
        }
        calculator.restore(mementos.pop());
        firstNumber = calculator.getLastResult();
    }
    public static void save() {
        if (mementos.size() > 50) mementos.removeFirst();
        mementos.push(calculator.save());
        calculator.setLastResult(firstNumber);
    }
}