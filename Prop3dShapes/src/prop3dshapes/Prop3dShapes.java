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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      triangle trig = new triangle();
      circle circ=new circle();
      rectangle rect=new rectangle();
      String shape;
      double BA;
      boolean shLoop=false;
        // TODO code application logic here
        System.out.println("Program Commencing");
        System.out.println("What is the base shape of the 3d shape?");
        do{
          shape=sc.nextLine();
          switch(shape.toLowerCase()){
            case "triangle":
              trig.area(5,30);
              shLoop=true;
              break;
            case "circle":

              BA=circ.area(circ.getRad());
              shLoop=true;
              break;
            case "rectangle":
              rect.area(50,50);
              shLoop=true;
              break;
            default:
              System.out.println("Not a valid base shape.");
              System.out.println("Please try again.");
            }

        }while(shLoop==true);
    }

}
