/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prop3dshapes;
import java.math.*; //import math module
import java.util.Scanner; //import scanner module
/**
 *
 * @author S331474817
 */
public class circle extends shape2d{ //creats a subclass of shape2d called circle

    //variable
    public double radius; //creates a variable to hold the radius value

    //functions
    public  circle() { //creates a constructor
    	sideLen=new double[1]; //initiate sideLen to have 1 slot as the circumference can count as 1 side
    }
    public void getProps(){ //overrides parent function's getProps function. Same as triangle getProps function, but ask for different values
      boolean tLoop=false; //same as triangle getProps
      String checker=""; //same as triangle getProps
      Scanner sc=new Scanner(System.in); //same as triangle getProps
      do{ //same as triangle getProps
        System.out.println("What is the radius of the circle?: "); //ask user for the radius of the circle
        checker=sc.nextLine(); //same as triangle getProps
        try{ //same as triangle getProps
          radius=Double.valueOf(checker); //checks to see if input is valid by converting input to double and storing it in radius
          tLoop=true; //same as triangle getProps
        }
        catch(java.lang.NumberFormatException e){ //same as triangle getProps
          System.out.println("Invalid entry Please try again"); //same as triangle getProps
          tLoop=false; //same as triangle getProps
        }
        finally{ //same as triangle getProps
          checker=""; 
        }
      }while(tLoop==false); //same as triangle getProps
      sideLen[0]=Math.PI*radius*2; //calculates the circumference of the circle and stores it in sideLen
    }

    public double area(){ //overides parent function's area function to use the circle formula for area
        return radius*radius*Math.PI; //call math variable pi as it is easier and more accurate to use this pi value.
    }
}
