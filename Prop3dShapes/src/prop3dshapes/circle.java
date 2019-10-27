/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prop3dshapes;
import java.math.*;
import java.util.Scanner;
/**
 *
 * @author S331474817
 */
public class circle extends shape2d{

    public static double rad;
    public static double[] circumf=new double[1];
    //functions
    public static double getRad(){
      boolean tLoop=false;
      String checker="";
      Scanner sc=new Scanner(System.in);
      
      do{
        System.out.println("What is the radius of the circle?: ");
        checker=sc.nextLine();
        try{
          rad=Double.valueOf(checker);
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
      return rad;
    }


    public double area(double r){
        return r*r*Math.PI;
    }


    public static void circ(){
        circumf[0]=Math.PI*rad*2;
    }
}
