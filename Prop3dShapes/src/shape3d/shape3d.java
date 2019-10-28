/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape3d;
import java.util.Scanner; //import scanner module to get user input
import prop3dshapes.*; //importing prop3dshapes package to use the classes from it
/**
 *
 * @author S331474817
 */
public class shape3d {

    //variables
    public double depth=0; //variable to hold depth
    public double baseArea=0; //variable to hold base area

    // Functions
    public double sideA(int sNum,double[] sLen, double depth){ //function that takes in 3 parameters, number of sides (sNum), an array of side length (sLen) and depth to calculate the area of each base on the 3dshape excluding the bases
      double faceArea=0; //variable to temporaly hold the area of one face
      for(int x=0;x<sNum;x++){ //loops the number of faces on the 3d shape
        faceArea=faceArea+(sLen[x]*depth); //calculating the total face area
      }
      return faceArea; //seting sideA to get the total face area
    }

    public void getDepth(){ //function to get the depth of the 3d shape
      boolean tLoop=false; //determines if it should continue looping
      String checker=""; //temporarly holds the user input,
      Scanner sc=new Scanner(System.in); //creates an instance of the scanner module
      do{ //loops until input is valid
        System.out.println("What is the depth of the 3d shape"); //ask user for depth of 3d shape
        checker=sc.nextLine(); //gets user input
        try{ //checks to see if user input is valid
          depth=Double.valueOf(checker); // converts temporary user input storage (checker) into a double
          tLoop=true; //says input is valid
        }
        catch(java.lang.NumberFormatException e){ //if the input is invalid (conversion does not work) it goes to catch statement
          System.out.println("Invalid entry Please try again"); //tells user their entry is invalid and to try again
          tLoop=false; //says input is invalid
        }
        finally{ //resets checker to nothing
          checker="";
        }
      }while(tLoop==false); //loops until input is valid
    }

    public void setBase(shape2d inst2dShape){ //function to get area of the base, takes in the parameter of an instance of class shape2d
      baseArea=inst2dShape.area(); //calls function area from class shape2d and sets baseArea equal to it
    }

    //interface
    public double volume() { //create a class to calculate volume
    	return 0; //it is empty because each 3d shape has its own way of calculating volume, has return 0 because it must return something
    }
    public double SA(shape2d inst2dShape) { //samething as volume, but is for surface area. Also has a parameter of an instance of a 2s shape
    	return 0;
    }

}
