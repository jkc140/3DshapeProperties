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

    public double rad;
    //functions
    public static double getRad(){
      Scanner sc=new Scanner(System.in);
      System.out.println("What is the radius of the circle?: ");
      rad=sc.nextDouble();
      return rad;
    }


    public static double area(double r){
        return r*r*Math.PI;
    }


    public double circ(double r){
        return Math.PI*rad*2;
    }
}
