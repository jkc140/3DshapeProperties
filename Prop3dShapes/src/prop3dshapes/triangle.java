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
    public double height;
    public double[] sL=new double[3];

    //functions
    public void getBase(){
      Scanner sc=new Scanner(System.in);
      System.out.println("What is the base of the triangle");
      sL[0]=nextDouble();
    }


    public void getHeight(){
      Scanner sc=new Scanner(System.in);
      System.out.println("What is the heigth of the triangle");
      height=nextDouble();

    }


    public void getSid(){
        Scanner sc=new Scanner(System.in);
        System.out.println("What is the hypotenous of the triangle");
        sL[1]=nextDouble();
        System.out.println("What is the other side length of the triangle (Excluding base)");
        sL[2]=nextDouble();

    }


    public static double area(double b, double h){
        return b*h/2;
    }
}
