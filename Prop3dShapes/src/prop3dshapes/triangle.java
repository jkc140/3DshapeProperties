/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prop3dshapes;
import java.util.Scanner;
/**
 *
 * @author S331474817
 */
public class triangle extends shape2d{

    //variables
    public static double[] sL=new double[3];

    //functions
    public static void getBase(){
      Scanner sc=new Scanner(System.in);
      System.out.println("What is the base of the triangle");
      sL[0]=sc.nextDouble();
    }


    public static double getHeight(){
      Scanner sc=new Scanner(System.in);
      System.out.println("What is the heigth of the triangle");
      return sc.nextDouble();

    }


    public static void getSid(){
        Scanner sc=new Scanner(System.in);
        System.out.println("What is the hypotenous of the triangle");
        sL[1]=sc.nextDouble();
        System.out.println("What is the other side length of the triangle (Excluding base)");
        sL[2]=sc.nextDouble();

    }


    public double area(double b, double h){
        return b*h/2;
    }
}
