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
public class rectangle extends shape2d{ //creates a subclass called rectangle that's parent class is shap2d

    //functions
	public  rectangle() { //creates a constructor
		sideLen =new double[4]; //initializes the array sideLen to have 4 spots
	}
    public void getProps(){ //overrides
        //same thing as all the other getProps, but different questions and different places to store
      boolean tLoop=false; //same as  subclass triangle
      String checker=""; //same as  subclass triangle
      Scanner sc=new Scanner(System.in); //same as  subclass triangle
      for(int x=0;x<2;x++){ //loops 2 times because there is atmost 2 different side lengths in a rectangle
        do{ //cehcks to see if valid input
          switch(x){ //determines what question to ask user
            case 0: //asking for length
              System.out.println("What is the length of the rectangle"); 
              break;
            case 1: //asking for width
              System.out.println("What is the width of the rectangle");
              break;
            default://if there is no more questions 
              System.out.println("No more");
          }
          checker=sc.nextLine();
          try{
            sideLen[x]=Double.valueOf(checker); //checks to see if valid input by converting user input to double and storing it in the sidelength array
            sideLen[x+2]=sideLen[x]; //since two sides are the same it will also store the value in a different location (+2 to x value because if you go in a clockwise direction there is a different length inbetween two idetical sides) 
            tLoop=true;
          }
          catch(java.lang.NumberFormatException e){ //same as  subclass triangle
            System.out.println("Invalid entry Please try again");
            tLoop=false;
          }
          finally{ //same as  subclass triangle
            checker="";
          }
        }while(tLoop==false); //exits when input is valid
      }
    }

    public double area(){ //override area function to use the formula length * width
        return sideLen[0]*sideLen[1];
    }
}
