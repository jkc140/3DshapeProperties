package shape3d;

public class pyramid extends shape3d{
  public double BA;
  public double depth;
  public double v;
  public double sH;
  public double s;
  public double sidA(int sNum,double[] sLen){
    double tempA=0;
    for(int x=0;x<sNum<x++){
      tempA=tempA+(sLen[x]*sH);
    }
    return tempA();
  }
  public void volume(double d){
    v=BA*h/3;
  }
  public void SA(int sNum, double[] sLen){
      s=BA+sidA;

  }

}
