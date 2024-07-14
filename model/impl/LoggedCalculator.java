package model.impl;

import model.Calculable;
import model.CompNum;
import model.Loggable;

public class LoggedCalculator implements Calculable {
    
    private final Calculable calculable;
    private final Loggable logger;

    public LoggedCalculator(Calculable calculable, Loggable logger) {
        this.calculable = calculable;
        this.logger = logger;
    }

    @Override
    public void sum(CompNum a, CompNum b) {
        logger.log(String.format("Sum up %s and %s", a, b));
        calculable.sum(a, b);
    }

    @Override
    public void multiply(CompNum a, CompNum b) {
        logger.log(String.format("Multiply %s and %s", a, b));
        calculable.multiply(a, b);
    }

    @Override
    public void divide(CompNum a, CompNum b) {
        logger.log(String.format("Divide %s and %s", a, b));
        calculable.divide(a, b);
    }

    @Override
    public CompNum result() {
        CompNum result = calculable.result();
        logger.log(String.format("Result: %s", result));
        return result;
    }

    @Override
    public void clear() {
        calculable.clear();
    }
    
}
