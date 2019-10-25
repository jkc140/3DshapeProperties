package shape3d;
import java.util.Scanner;

public class pyramid extends shape3d{
  public double BA;
  public double depth;
  public double v;
  public double sH;
  public double s;

  public void getSidH(){
      Scanner sc = new Scanner(System.in);
      System.out.println("What is the side height of the pyramid");
      sH=sc.nextDouble();
  }
  public double volume(double d){
    return BA*d/3;
  }
  public double SA(int sNum, double[] sLen ){
    return BA+shape3d.sidA(sNum,sLen,sH);
  }

}
