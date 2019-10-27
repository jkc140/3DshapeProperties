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

    //variables

    public static double[] sidLen =new double[4];


    //functions
    public static double getLen(){
      double len=0;
      boolean tLoop=false;
      String checker="";
      Scanner sc=new Scanner(System.in);
      do{
        System.out.println("What is the length of the rectangle");
        checker=sc.nextLine();
        try{
          len=Double.valueOf(checker);
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
      sidLen[0]=len;
      sidLen[2]=len;
      return len;
    }


    public static double getWid(){
      double wid=0;
      boolean tLoop=false;
      String checker="";
      Scanner sc=new Scanner(System.in);
      do{
        System.out.println("What is the width of the rectangle");
        checker=sc.nextLine();
        try{
          wid=Double.valueOf(checker);
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
      sidLen[1]=wid;
      sidLen[3]=wid;
      return wid;
    }


    public double area(double l, double w){
        return l*w;
    }
}
