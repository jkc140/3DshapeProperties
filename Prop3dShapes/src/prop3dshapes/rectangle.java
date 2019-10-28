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
public class rectangle extends shape2d{

    //variables

    sideLen =new double[4];

    //functions

    public void getProps(){
      boolean tLoop=false;
      String checker="";
      Scanner sc=new Scanner(System.in);
      for(int x=0;x<=2;x++){
        do{
          switch(x){
            case 0:
              System.out.println("What is the length of the rectangle");
            case 1:
              System.out.println("What is the width of the rectangle");
            default:
              System.out.println("No more");
          }
          checker=sc.nextLine();
          try{
            sideLen[x]=Double.valueOf(checker);
            sideLen[x+2]=sLen[x];
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
        baseArea = sideLen[0]*sideLen[1];
    }
}
