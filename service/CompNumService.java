package service;

import model.CompNum;

public class CompNumService {
    
    public CompNum createCompNum(double x, double y) {
      
        return new CompNum(x, y);
        
    }

}
