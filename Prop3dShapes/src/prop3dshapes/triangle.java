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
    public double height;
    //functions
	public triangle() {
		sideLen=new double[3];
	}
    public void getProps(){
      Scanner sc=new Scanner(System.in);
      boolean tLoop=false;
      String checker="";
      double tempVal;
      for(int x=0;x<4;x++){
    	  while(tLoop==false){
          switch(x){
            case 0:
              System.out.println("What is the base of the triangle");
              break;
            case 1:
              System.out.println("What is the hypotenous of the triangle");
              break;
            case 2:
              System.out.println("What is the last side of the triangle");
              break;
            case 3:
              System.out.println("What is the height of the triangle");
              break;
          }
          checker=sc.nextLine();
          try{
            switch(x){
              case 3:
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
        }
    	  tLoop=false;
      }
    }

    public double area(){
        return sideLen[0]*height/2;
    }
}
