package model;

public class CompNum {
    public double x;
    public double y;

    public CompNum(double x, double y) {
       this.x = x;
       this.y = y; 
    }

    @Override
    public String toString() {
        return String.format("(x:%s y:%s)", x, y);
    }
}
