package shape3d;
import java.util.Scanner;

import prop3dshapes.shape2d;

public class pyramid extends shape3d{
  public double faceHeight=0;
  public void getSidH(){
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
  public double volume(){
    return baseArea*depth/3;
  }
  public double SA(shape2d inst2dShape ){
    return baseArea+sidA(inst2dShape.sideLen.length,inst2dShape.sideLen,faceHeight);
  }

}
