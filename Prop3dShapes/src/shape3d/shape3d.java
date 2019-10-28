/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape3d;
import java.util.Scanner;
import prop3dshapes.*;
import prop3dshapes.*;
/**
 *
 * @author S331474817
 */
public class shape3d {
    public double faceArea=0;
    public double depth=0;
    public double baseArea=0;
    public double volume;
    public double SA;
    // Functions
    public double sidA(int sNum,double[] sLen, double depth){
      for(int x=0;x<sNum;x++){
        faceArea=faceArea+(sLen[x]*depth);
      }
      return faceArea;
    }

    public void getDepth(){
      boolean tLoop=false;
      String checker="";
      double dep=0;
      Scanner sc=new Scanner(System.in);
      do{
        System.out.println("What is the depth of the 3d shape");
        checker=sc.nextLine();
        try{
          depth=Double.valueOf(checker);
          tLoop=true;
        }
        catch(java.lang.NumberFormatException e){
          System.out.println("Invalid entry Please try again");
          tLoop=false;
        }
        finally{
          checker="";
        }
      }while(tLoop==false);
    }

    public void setBase(shape2d inst2dShape){
      baseArea=inst2dShape.area();
    }

    //interface ???
    public double volume() {
    	return 0;
    }
    public double SA(shape2d inst2dShape) {
    	System.out.println("Not being override");
    	return 0;
    }
    
}
