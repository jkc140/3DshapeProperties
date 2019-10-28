/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prop3dshapes;
import java.util.Scanner;
/**
 *
 * @author S331474817
 */
public class triangle extends shape2d{

    //variables
    sideLen=new double[3];
    public double height;
    //functions
    public void getProps(){
      boolean tLoop=false;
      String checker="";
      double tempVal;
      for(int x=0;x<=4;x++){
        do{
          switch(x){
            case 0:
              System.out.println("What is the base of the triangle");
            case 1:
              System.out.println("What is the hypotenous of the triangle");
            case 2:
              System.out.println("What is the last side of the triangle");
            default:
              System.out.println("What is the height of the triangle");
          }
          checker=sc.nextLine();
          try{
            switch(x){
              case 4:
                height=Double.valueOf(checker);
                break;
              default:
                sideLen[x]=Double.valueOf(checker);
            }
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
      }
    }

    public void area(){
        baseArea=sidLen[0]*height/2;
    }
}
