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
    public double depth;
    public double BA;
    public double sidA(int sNum,double[] sLen, double depth){
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
    protected void getBA(int shape){
      switch(shape){
        case 0:
          BA=triangle.area(3,4);
          break;
        case 1:
          BA=circle.area(circle.getRad());
          break;
        case 2:
          BA=rectangle.area(33,54);
          break;
        default:
          System.out.println("Error area not found");
      }
    }

    public void volume(){
      System.out.println("The volume is: ");
    }
    public void SA(){
      System.out.println("The Surface Area is: ");
    }
}
