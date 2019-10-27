package shape3d;
import java.util.Scanner;

public class pyramid extends shape3d{
  public double sH;
  public static void getSidH(){
      Scanner sc = new Scanner(System.in);
      System.out.println("What is the side height of the pyramid");
      sH=sc.nextDouble();
  }
  public static double volume(double d,double ba){
    return ba*d/3;
  }
  public static double SA(double ba,int sNum, double[] sLen ){
    return ba+shape3d.sidA(sNum,sLen,sH);
  }

}
