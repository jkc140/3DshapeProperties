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
    public static double getBase(){
      boolean tLoop=false;
      String checker="";
      double b=0;
      Scanner sc=new Scanner(System.in);
      do{
        System.out.println("What is the base of the triangle");
        checker=sc.nextLine();
        try{
          b=Double.valueOf(checker);
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

      sL[0]=b;
      return sL[0];
    }


    public static double getHeight(){
      boolean tLoop=false;
      String checker="";
      double h=0;
      Scanner sc=new Scanner(System.in);
      do{
        System.out.println("What is the heigth of the triangle");
        checker=sc.nextLine();
        try{
          h=Double.valueOf(checker);
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
      return h;
    }


    public static void getSid(){
        boolean tLoop=false;
        String checker="";
        double tempHold=0;
        Scanner sc=new Scanner(System.in);
        do{
          System.out.println("What is the hypotenous of the triangle");
          checker=sc.nextLine();
          try{
            tempHold=Double.valueOf(checker);
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
          sL[1]=tempHold;

        do{
          System.out.println("What is the other side length of the triangle (Excluding base)");
          checker=sc.nextLine();
          try{
            tempHold=Double.valueOf(checker);
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
        sL[2]=tempHold;

    }


    public double area(double b, double h){
        return b*h/2;
    }
}
