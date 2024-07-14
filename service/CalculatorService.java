package service;

import model.Calculable;
import model.CompNum;
import model.impl.Calculator;
import model.impl.ConsoleLogger;
import model.impl.LoggedCalculator;

public class CalculatorService {
   
    public Calculable createCalculator() {
      
        // return new Calculator();
        // View view = new View(new LoggedCalculator(new Calculator(), new ConsoleLogger()));
        return new LoggedCalculator(new Calculator(), new ConsoleLogger());
        
    }
    
     public void Sum(Calculable calculator, CompNum a, CompNum b){
       
        calculator.sum(a, b);

    }

    public void multiply(Calculable calculator, CompNum a, CompNum b){
       
        calculator.multiply(a, b);

    }

    public void divide(Calculable calculator, CompNum a, CompNum b){
       
        calculator.divide(a, b);

    }


    public CompNum result(Calculable calculator) {
        return calculator.result();
    }
    
    public void clear(Calculable calculator) {
        calculator.clear();
    }
}
