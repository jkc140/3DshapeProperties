/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape3d;

/**
 *
 * @author S331474817
 */
public class Prism {
    public double BA;
    private double v;
    private double s;
    protected double depth;
    public void volume(){
        v=BA*depth;
    }
    public double sidA(int sNum,double[] sLen ){
        double tempA=0;
        for(int x=0;x<sNum;x++){
           tempA=tempA+sLen[x]*depth;
        }
        return tempA;
    }
    public void SA(int sNum,double[]sLen){
        s=(2*BA)+sidA(sNum,sLen);
    }
    
}
