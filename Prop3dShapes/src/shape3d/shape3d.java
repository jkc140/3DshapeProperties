/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape3d;
import java.util.Scanner();
/**
 *
 * @author S331474817
 */
public class shape3d {
    public depth;
    public BA;
    public double sidA(int sNum,double[] sLen){
      double tempA=0;
      for(int x=0;x<sNum<x++){
        tempA=tempA+(sLen[x]*sH);
      }
      return tempA();
    }
    protected void getDepth(){
      Scanner sc=new scanner(System.in);
      System.out.println("What is the height of the 3d shape")
      depth=sc.nextDouble();
    }
    protected void getBA(int shape){
      switch(shape){
        case 0:
          BA=triangle.area();
          break
        case 1:
          BA=circle.area();
          break
        case 2:
          BA=circle.area();
          break
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
