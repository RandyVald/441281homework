package controller;

import model.Calculable;
import model.CompNum;
import service.CalculatorService;

public class CalculatorController {
   
    private CalculatorService service = new CalculatorService();

    public Calculable createCalculator(){
      return service.createCalculator();  
    }

    public void Sum(Calculable calculator, CompNum a, CompNum b){
        service.Sum(calculator,  a,  b);
    }

    public void multiply(Calculable calculator, CompNum a, CompNum b){
        service.multiply(calculator,  a,  b);
    }
    
    public void divide(Calculable calculator, CompNum a, CompNum b){
        service.divide(calculator,  a,  b); 
    }

    public CompNum result(Calculable calculator){
        return service.result(calculator);
    }

    public void clear(Calculable calculator) {
        service.clear(calculator);
    }

}
