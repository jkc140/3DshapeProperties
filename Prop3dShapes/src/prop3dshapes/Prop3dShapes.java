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
        boolean shLoop=false;
        System.out.println("What is the base shape of the 3d shape?");
        do{
          shape=sc.nextLine();
          switch(shape.toLowerCase()){
            case "triangle":
              break;
            case "circle":
              break;
            case "rectangle":  
              break;
            default:
              System.out.println("Not a valid base shape.");
              System.out.println("Please try again.");
            }

        }while(shLoop==true);
        return shape.toLowerCase();
    }
    public static double sortBA(){
        triangle trig = new triangle();
        circle circ=new circle();
        rectangle rect=new rectangle();
        double BA=0;
        switch(sortShap()){
            case "triangle":
                BA= trig.area(5,30);
                break;
            case "circle":
                BA= circ.area(circ.getRad());
                break;
            case "rectangle":  
                BA= rect.area(50,50);
                break;
            default:
                System.out.println("Error");
        }
        return BA;
       }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        // TODO code application logic here
        System.out.println("Program Commencing");
        shape3d.getBA(sortBA());
    }

}
