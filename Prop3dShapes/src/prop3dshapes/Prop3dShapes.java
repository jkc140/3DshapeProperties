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
    public static shape2d getBaseShape(){
      Scanner sc=new Scanner(System.in);
      shape2d inst2dShape=null;
      boolean shapeCheck =false;
      String shape;
      do{
        System.out.println("What is the base shape of the 3d shape? (triangle, circle or rectangle)");
        shape=sc.nextLine();
        switch(shape.toLowerCase()){
          case "triangle":
            inst2dShape=new triangle();
            shapeCheck=true;
            break;
          case "circle":
            inst2dShape=new circle();
            shapeCheck=true;
            break;
          case "rectangle":
            inst2dShape=new rectangle();
            shapeCheck=true;
            break;
          default:
            System.out.println("Not a valid base shape.");
            System.out.println("Please try again.");
          }

      }while(shapeCheck==false);
      inst2dShape.getProps();
      return inst2dShape;
    }
    public static shape3d get3dShape(shape2d inst2dShape){
      Scanner sc=new Scanner(System.in);
      shape3d inst3dShape=null;
      String shape;
      boolean shapeCheck =false;
      do{
        System.out.println("What type of 3d shape are you entering (prism or pyramid)");
        shape=sc.nextLine();
        switch(shape.toLowerCase()){
          case "prism":
            inst3dShape=new Prism();
            shapeCheck=true;
            break;
          case "pyramid":
            inst3dShape=new pyramid();
            shapeCheck=true;
            break;
          default:
            System.out.println("Not a valid base shape.");
            System.out.println("Please try again.");
          }
      }while(shapeCheck==false);
      inst3dShape.setBase(inst2dShape);
      inst3dShape.getDepth();
      return inst3dShape;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Program Commencing");
      Prism pri=new Prism();
      shape2d user2dShape=getBaseShape();
      shape3d user3dShape=get3dShape(user2dShape);
      System.out.println("The volume of your shape is :" + user3dShape.volume());
      System.out.println("The Surface Area of your shape is :" + user3dShape.SA(user2dShape));
      }

}
