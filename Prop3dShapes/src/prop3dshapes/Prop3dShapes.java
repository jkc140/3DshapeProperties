/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prop3dshapes;
import shape3d.*;

import java.util.Scanner;
/**
 *
 * @author S331474817
 */
public class Prop3dShapes {
    public shape2d getBaseShape(){
      Scanner sc=new Scanner(System.in);
      shape2d inst2dShape=null;
      boolean shapeCheck =false;
      do{
        System.out.println("What is the base shape of the 3d shape? (triangle, rectangle or square)");
        shape=sc.nextLine();
        switch(shape.toLowerCase()){
          case "triangle":
            inst2dShape=new triangle()
            shLoop=true;
            break;
          case "circle":
            inst2dShape=new circle()
            shLoop=true;
            break;
          case "rectangle":
            inst2dShape=new rectangle()
            shLoop=true;
            break;
          default:
            System.out.println("Not a valid base shape.");
            System.out.println("Please try again.");
          }

      }while(shLoop==false);
      inst2dShape.getProps();
      return inst2dShape;
    }
    public shape3d get3dShape(shape2d inst2dShape){
      Scanner sc=new Scanner(System.in);
      shape3d inst3dShape=null;
      boolean shapeCheck =false;
      do{
        System.out.println("What type of 3d shape are you entering (prism or pyramid)");
        shape=sc.nextLine();
        switch(shape.toLowerCase()){
          case "triangle":
            inst3dShape=new Prism()
            shLoop=true;
            break;
          case "circle":
            inst3dShape=new pyramid()
            shLoop=true;
            break;
          default:
            System.out.println("Not a valid base shape.");
            System.out.println("Please try again.");
          }
      }while(shLoop==false);
      inst3dShape.setBase(inst2dShape.area());
      inst3dShape.getDepth();
      inst3dShape.sidA(inst2dShape);
      return inst3dShape;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Program Commencing");
      shape2d user2dShape=get2dshape();
      shape3d user3dShape=get3dShape();
      System.out.println("The volume of your shape is :" + user3dShape.volume());
      System.out.println("The Surface Area of your shape is :" + user3dShape.SA());
      }

}
