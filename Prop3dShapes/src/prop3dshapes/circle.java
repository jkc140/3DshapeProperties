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
    public static double[] circumf=new double[]
    //functions
    public static double getRad(){
      Scanner sc=new Scanner(System.in);
      System.out.println("What is the radius of the circle?: ");
      rad=sc.nextDouble();
      return rad;
    }


    public double area(double r){
        return r*r*Math.PI;
    }


    public static void circ(){
        cirumf[0]=Math.PI*rad*2;
    }
}
