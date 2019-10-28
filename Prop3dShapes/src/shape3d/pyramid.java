package shape3d;
import java.util.Scanner;

public class pyramid extends shape3d{
  public static double sH=0;
  public static void getSidH(){
      boolean tLoop=false;
      String checker="";
      Scanner sc = new Scanner(System.in);
      do{
        System.out.println("What is the side height of the pyramid");
        checker=sc.nextLine();
        try{
          sH=Double.valueOf(checker);
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
  public static double volume(double d,double ba){
    return ba*d/3;
  }
  public static double SA(double ba,int sNum, double[] sLen ){
    return ba+shape3d.sidA(sNum,sLen,sH);
  }

}
