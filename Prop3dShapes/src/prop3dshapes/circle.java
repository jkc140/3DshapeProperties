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

    public double radius;
    circumference=new double[1];
    //functions
    public void getProps(){
      boolean tLoop=false;
      String checker="";
      Scanner sc=new Scanner(System.in);

      do{
        System.out.println("What is the radius of the circle?: ");
        checker=sc.nextLine();
        try{
          radius=Double.valueOf(checker);
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
      circumference[0]=Math.PI*radius*2;
    }

    public void area(double r){
        return radius*radius*Math.PI;
    }
}
