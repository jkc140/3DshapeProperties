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
public class rectangle extends shape2d{
    public double length;
    public double width;
    public double[] sidLen =new double[2];
    public static getLen(){
      Scanner sc=new Scanner(System.in);
      System.out.println("What is the length of the rectangle");
      length=sc.nextDouble();
      sidLen[0]=length;
    }
    public static getWid(){
      Scanner sc=new Scanner(System.in);
      System.out.println("What is the width of the rectangle");
      width=sc.nextDouble();
      sidLen[1]=width;
    }
    public static double area(double l, double w){
        return l*w;
    }
}
