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
    
    //variables
    public static double depth;
    public static double BA;
    public double tempReplace =0;
    
    
    // Functions
    public static double sidA(int sNum,double[] sLen, double depth){
      double tempA=0;
      for(int x=0;x<sNum;x++){
        tempA=tempA+(sLen[x]*depth);
      }
      return tempA;
    }
    protected void getDepth(){
      Scanner sc=new Scanner(System.in);
      System.out.println("What is the height of the 3d shape");
      depth=sc.nextDouble();
    }
    public static void getBA(double a){
        BA=a;
    }
    
    
    //interface ???
    public double volume(){
      System.out.println("The volume is: ");
      return 0;
    }
    public double SA(){
      System.out.println("The Surface Area is: ");
      return 0;
    }
}
