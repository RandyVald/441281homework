package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import controller.CalculatorController;
import controller.CompNumController;
import model.Calculable;
import model.CompNum;
import model.util.Operators;

public class CompNumView {
    
    private CompNumController controllerCompNum = new CompNumController();
    private CalculatorController calculatorController = new CalculatorController();
    private final Calculable calculator;
    private final List<String> validOperators;

    public CompNumView() {
        
        this.calculator = calculatorController.createCalculator();
        this.validOperators = Arrays.stream(Operators.values())
                .map(Operators::operator)
                .collect(Collectors.toList());

    }

    public void start(){

        while (true) {
            prepare();
            String action = prompt();
            if (!action.equalsIgnoreCase("y")) {
                System.exit(0);
            }
        }

    }

    private void prepare() {

        double a = promptInt("Enter real of first argument: ");
        double b = promptInt("Enter image of first argument: ");
        CompNum num1 = controllerCompNum.createCompNum(a, b);
        
        String operator = getOperator();
    
        a = promptInt("Enter real of second argument: ");
        b = promptInt("Enter image of second argument: ");
        CompNum num2 = controllerCompNum.createCompNum(a, b);

        if (operator.equals("*")) {
            calculatorController.multiply(calculator, num1, num2);
        }

        if (operator.equals("+")) {
            calculatorController.Sum(calculator, num1, num2);
        }

        if (operator.equals("/")) {
            calculatorController.divide(calculator, num1, num2);
        }

        calculatorController.result(calculator);
        calculatorController.clear(calculator);
    }
    
    private boolean isInvalidOperator(String operator) {
        return !validOperators.contains(operator);
    }

    private String getOperator() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the math operation (*, +, /) : ");
        String operator = in.nextLine();
        while (true) {
            if (isInvalidOperator(operator)) {
                System.err.println("Entered invalid math operator. " + "Enter the math operation (*, +, /) : ");
                operator = in.nextLine();
            } else return operator;
        }
    }
    private String prompt() {
        Scanner in = new Scanner(System.in);
        System.err.println("Continue?... (y/n)");
        return in.nextLine();
    }

    private  int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        int result = -1;
        try {
            result = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Not number was enter. Please enter number");
            promptInt(message);
        }
        return result;
    }

}
