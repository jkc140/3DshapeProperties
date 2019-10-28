package shape3d;
import java.util.Scanner; //imports scanner module
import prop3dshapes.shape2d; //imports the class shape2d from package Prop3dShapes

public class pyramid extends shape3d{ // creates a subclass of shape3d called pyramid

  //variables
  public double faceHeight=0; //creates a variable to hold the face height of the pyramid

  //functions
  public void getSideH(){ //creates a function to get the height of the face on the pyramid
      //works the same way as the getDepth function, except using variable faceHeight to store the face height instead of depth
      boolean tLoop=false;
      String checker="";
      Scanner sc = new Scanner(System.in);
      do{
        System.out.println("What is the side height of the pyramid");
        checker=sc.nextLine();
        try{
          faceHeight=Double.valueOf(checker);
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
  public double volume(){ //function called volume which is an override of the parent class' volume function by using the pyramid volume equation
    return baseArea*depth/3;
  }
  public double SA(shape2d inst2dShape ){ //overrides SA function in parent class to use SA formula for pyramid
    return baseArea+(sideA(inst2dShape.sideLen.length,inst2dShape.sideLen,faceHeight)/2); //adds the base area and the total side/face area divided by 2.
    //calls function sideA from parent class using the paremeters isnt2dShape.sideLen.length <-- gets lenth of array (number of sides)
    //inst2dShape.sideLen is the array holding sidelength values, faceHeight is the height of the faces on triangle
  }

}
