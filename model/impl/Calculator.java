package model.impl;

import model.Calculable;
import model.CompNum;

public class Calculator implements Calculable {
    private CompNum result;

    public Calculator(){
        this.result = new CompNum(0, 0);
    }

    @Override
    public void sum(CompNum a, CompNum b) {
       result.x = a.x + b.x;
       result.y = a.y + b.y;
    }

    @Override
    public void multiply(CompNum a, CompNum b) {
        
        double newReal = a.x * b.x - a.y * b.y;
        double newImaginary = a.x * b.y + a.y * b.x;
        result.x = newReal;
        result.y = newImaginary;

    }

    @Override
    public void divide(CompNum a, CompNum b) {

        if (b.x == 0 && b.y == 0) {
            new UnsupportedOperationException("Деление на 0 запрещено!");
        }
        double c2d2 = Math.pow(b.x, 2) + Math.pow(b.y, 2);
        double newReal = (a.x * b.x + a.y * b.y) / c2d2;
        double newImaginary = (a.y * b.x - a.x * b.y) / c2d2;
        result.x = newReal;
        result.y = newImaginary;
        
    }

    @Override
    public CompNum result() {
        System.out.printf("Result: %s%n", result);
        return result;
    }

    @Override
    public void clear() {
        this.result = new CompNum(0, 0);
    }
    
}
