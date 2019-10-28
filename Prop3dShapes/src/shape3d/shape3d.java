/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape3d;
import java.util.Scanner;
import prop3dshapes.*;
/**
 *
 * @author S331474817
 */
public class shape3d {

    // Functions
    public static double sidA(int sNum,double[] sLen, double depth){
      double tempA=0;
      for(int x=0;x<sNum;x++){
        tempA=tempA+(sLen[x]*depth);
      }
      return tempA;
    }
    public static double getDepth(){
      boolean tLoop=false;
      String checker="";
      double dep=0;
      Scanner sc=new Scanner(System.in);
      do{
        System.out.println("What is the depth of the 3d shape");
        checker=sc.nextLine();
        try{
          dep=Double.valueOf(checker);
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
      return dep;
    }
    public static double getBA(double a){
        return a;
    }


    //interface ???
    public static double volume(){
      System.out.println("The volume is: ");
      return 0;
    }
    public static double SA(){
      System.out.println("The Surface Area is: ");
      return 0;
    }
}
