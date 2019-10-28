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
public class triangle extends shape2d{ //creates a subclass of class shape2d called triangle

    //variables
    public double height; //creaets variable called height to hold the base's height of the triangle

    //functions
	public triangle() { //creates a constructor
		sideLen=new double[3]; //initiate sideLen to number of side length a triangle has (set the number of slots the array has)
	}
    public void getProps(){ //overides getProps function from parent function
      // basically the same as any of the get functions, but with different variables holding final value and different questions
      Scanner sc=new Scanner(System.in); //creates a new instance of the scanner module/class
      boolean tLoop=false; //hold value related to whether input is valid or not
      String checker=""; //temporary holds user input
      for(int x=0;x<4;x++){ //loops 4 tims as there is 4 values needed for a triangle
    	  while(tLoop==false){ //loops until the input is valid
          switch(x){ //uses switch statements to determine what value is being looked for
            case 0: //if x (value number) is 0
              System.out.println("What is the base of the triangle"); //asking for base of triange
              break; //exiting the switch statement
            case 1: //same as case 0, but for hypotenous
              System.out.println("What is the hypotenous of the triangle");
              break;
            case 2: //same as case 0 but for the last side
              System.out.println("What is the last side of the triangle");
              break;
            case 3: //same as case 0, but for height of triangle
              System.out.println("What is the height of the triangle");
              break;
          }
          checker=sc.nextLine(); //gets user inputs
          try{ //checks to see if input is valid
            switch(x){ //uses switch case to determine if it is a side length or if it is the height
              case 3: //if it is the height (3)
                height=Double.valueOf(checker); //will test user input to see if it is a valid input by converting it to a double then set height to user input
                break; //exit the switch statement
              default: //if it is not the height it is a side length and will add to the array of side length
                sideLen[x]=Double.valueOf(checker);
            }
            tLoop=true; //says the input is valid
          }
          catch(java.lang.NumberFormatException e){ //if there is an error in converting
            System.out.println("Invalid entry Please try again"); //tells user the input is invalid
            tLoop=false; //says in put is invalid
          }
          finally{ //resets value of checker
            checker="";
          }
        }
    	  tLoop=false; //loops until input is valid
      }
    }

    public double area(){ //overides area function from parent class to use area formula for a triangle
        return sideLen[0]*height/2;
    }
}
