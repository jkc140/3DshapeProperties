/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prop3dshapes;
import shape3d.*;
import java.util.Scanner();
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
      int shape;
      double BA;
      bool shLoop=false;
        // TODO code application logic here
        System.out.println("Program Commencing");
        System.out.println("What is the base shape of the 3d shape?");
        do{
          shape=sc.nextInt();
          shape=shape.toLowerCase();
          switch(shape){
            case "triangle":

              triangle.BA();
              shLoop=true;
              break
            case "circle":

              BA=circle.BA(circle.getRad());
              shLoop=true;
              break
            case "rectangle":
              rectangle.BA();
              shLoop=true;
              break
            default:
              System.out.println("Not a valid base shape.")
              System.out.println("Please try again.")
            }

        }while(shLoop==true);
    }

}
