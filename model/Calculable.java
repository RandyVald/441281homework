package model;

public interface Calculable {
    void sum(CompNum a, CompNum b);
    void multiply(CompNum a, CompNum b);
    void divide(CompNum a, CompNum b);
    CompNum result();
    void clear();
   
}
