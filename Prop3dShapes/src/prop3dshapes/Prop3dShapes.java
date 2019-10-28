/*
created 23/10/19
This program will determine the volume and surface area of a 3d shape with the base of a circle, triangle or rectangle

By Joshua C
 */
package prop3dshapes;
import shape3d.*; //importing the shape3d package <-- spearated into different packages to organize better
import java.util.Scanner; //import the scanner module to get user input
/**
 *
 * @author S331474817
 */
public class Prop3dShapes {
    public static shape2d getBaseShape(){  //create a function of type shape2d calleg getBaseShape to determine what the shape of the base and return an object of that base shape

      //variables
      Scanner sc=new Scanner(System.in); //initiating the scanner module and calling it sc
      shape2d inst2dShape; // declaring a variable of type shape2d (creating a variable that is of class shape2d)
      boolean shapeCheck =false; //declaring a boolean variable to see if the input is good or not
      String shape; //declaring a string variable to hold the user input

      //function
      do{ //loops until shapeCheck is true (when it is a valid user input)
        System.out.println("What is the base shape of the 3d shape? (triangle, circle or rectangle)"); // ask the user what base shae they are inputting
        shape=sc.nextLine(); // getting the base shape
        switch(shape.toLowerCase()){ //using a switch case to determine if the base shape is valid (setting the input to all lowercase)
          case "triangle": //checking to see if it is a triangle
            inst2dShape=new triangle(); // initiating the variable called inst2dShape of type shape2d class to an instanstiation of the triangle subclass (initiating an object of the triangle class)
            shapeCheck=true; //sets shapeCheck to true, saying it is a valid input
            break; //exits swtch statement
          case "circle": //does the samething as when checking triangle, but with the circle
            inst2dShape=new circle();//creates an instance of class circle using the variable inst2dShape that is of the shape2d class
            shapeCheck=true;
            break;
          case "rectangle"://does the samething as when checking triangle, but with the rectangle
            inst2dShape=new rectangle(); //creates an instance of class rectangle using the variable inst2dShape that is of the shape2d class
            shapeCheck=true;
            break;
          default: //if it is not one of the recogonized inputs it is invalid and gets them to input it again
            System.out.println("Not a valid base shape.");
            System.out.println("Please try again.");
          }

      }while(shapeCheck==false); //continous looping if the input is invalid
      inst2dShape.getProps(); //gets the properties of the instanstiated object from the switch statement
      return inst2dShape; //returns an object of the baseshape that is entered
    }
    public static shape3d get3dShape(shape2d inst2dShape){ //create a function of type shape3d calleg get3dShape to determine what the 3d shape is and return an object of that 3d shape, has the parameters of an instance of shape2d
      //samething as getBaseShape, but checking the 3d shape

      //variables
      Scanner sc=new Scanner(System.in); //same as previous declaration
      shape3d inst3dShape; //creating a variable of type shape3d
      String shape; //same as getBaseShape declaration
      boolean shapeCheck =false; //same as getBaseShape declaration

      //function
      do{ //loop until it is a valid input
        System.out.println("What type of 3d shape are you entering (prism or pyramid)"); //ask user to input type of 3d shape
        shape=sc.nextLine(); //gets user input
        switch(shape.toLowerCase()){ //use switch statement to determine if valid input, and setting the user input to be all lowercase
          case "prism": //checks to see if the input is a prism
            inst3dShape=new Prism(); //creates an object of type prism from the variable of type shape3d
            shapeCheck=true; //says that the input is valid
            break; // exits the switch statement
          case "pyramid": //same as prism, but checking pyramid
            inst3dShape=new pyramid(); //creating an instance of class pyramid out of the shape3d type variable
            shapeCheck=true;
            break;
          default: //if the input is not any of the options tells the user to re input the value
            System.out.println("Not a valid base shape.");
            System.out.println("Please try again.");
          }
      }while(shapeCheck==false); //exits when the input is valid
      inst3dShape.setBase(inst2dShape); // calls setBase function from the instnace of a 3dshape determined in the switch statement (sets the base of the 3d shape to be an object/instance of class shape2d)
      inst3dShape.getDepth(); //calls getDepth function from the instance of the 3d shape determined in the swtich statement
      return inst3dShape; //returns an instance of a shape3d, subclassed/type determined with the switch statement
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //main function
      System.out.println("Program Commencing"); //tells the user the program is starting
      shape2d user2dShape=getBaseShape(); //creates a instance of shape2d that is based on the value of getBaseShape
      shape3d user3dShape=get3dShape(user2dShape); //creates a instance of shape3d that is based on the value of get3dShape
      System.out.println("The volume of your shape is :" + user3dShape.volume()); //prints the volume of the 3d shape by calling initiatted shape3d's (user3dShape) function for determine volume
      System.out.println("The Surface Area of your shape is :" + user3dShape.SA(user2dShape)); //same as the volume, but for SA. takes in the parameters the instance of a 2d shape as the 2d shape object holds the side values
      }

}
