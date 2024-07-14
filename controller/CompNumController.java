package controller;

import model.CompNum;
import service.CompNumService;

public class CompNumController {
   
    private CompNumService service = new CompNumService();

    public CompNum createCompNum(double x, double y){
      return service.createCompNum(x, y);  
    }



}
