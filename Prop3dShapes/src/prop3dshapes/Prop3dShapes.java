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
    public static String sortShap(){
        Scanner sc=new Scanner(System.in);
        String shape;
        boolean shLoop=false; //<-- shape loop (sh + loop)
        System.out.println("What is the base shape of the 3d shape?");
        do{
          shape=sc.nextLine();
          switch(shape.toLowerCase()){
            case "triangle":
              shLoop=true;
              break;
            case "circle":
              shLoop=true;
              break;
            case "rectangle":
              shLoop=true;
              break;
            default:
              System.out.println("Not a valid base shape.");
              System.out.println("Please try again.");
            }

        }while(shLoop==true);
        return shape.toLowerCase();
    }
    public static double sortBA(String shape){
        triangle trig = new triangle();
        circle circ=new circle();
        rectangle rect=new rectangle();
        double BA=0;
        switch(shape){
            case "triangle":
                trig.getBase();
                BA= trig.area(trig.sL[0],trig.getHeight());
                break;
            case "circle":
                BA= circ.area(circ.getRad());
                break;
            case "rectangle":
                rect.getLen();
                rect.getWid();
                BA= rect.area(rect.length,rect.width);
                break;
            default:
                System.out.println("Error Error Error Cannot Compute Error Error Error");
        }
        return BA;
       }

       public static double sort3d(double d,double BA,int sNum,double[] sLen){
         String shape;
         System.out.println("What type of 3d shape are you entering (prism or pyramid)");
         Scanner sc=new Scanner(System.in);
         shape=nextLine();
         switch(shape.toLowerCase){
           case "pyramid":
              pyramdid.getSidH();
              System.out.println("You're shape has a volume of ");
              System.out.print(pyramid.volume(BA,d));
              System.out.println("You're shape has a volume of ");
              System.out.print(pyramid.SA(BA,sNum,sLen));
              break;
           case "prism":
              System.out.println("You're shape has a volume of ");
              System.out.print(prism.volume(d,BA));
              System.out.println("You're shape has a volume of ");
              System.out.print(prism.SA(d,BA,sNum,sLen));
              break;
            default:
              System.out.println("Error");
         }
       }
       public static void sortBash(String shape){
         switch(shape){
             case "triangle":
                 sort3d(shape3d.getDepth,shape3d.getBA,3,triangl.sL);
                 break;
             case "circle":
                 sort3d(shape3d.getDepth,shape3d.getBA,1,circle.circ);
                 break;
             case "rectangle":
                 sort3d(shape3d.getDepth,shape3d.getBA,4,rectangle.sidLen);
                 break;
             default:
                 System.out.println("Error Error Error Cannot Compute Error Error Error");
         }
       }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String bash=sortBA(); //<-- base shape (ba+ sh)
        // TODO code application logic here
        System.out.println("Program Commencing");
        shape3d.getBA(bash);
        sortBash();



    }

}
