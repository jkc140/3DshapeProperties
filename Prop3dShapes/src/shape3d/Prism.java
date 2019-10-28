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
    public static double volume(double d,double ba){
        return ba*d;
    }

    public static double SA(double d,double ba,int sNum,double[]sLen){
        return(2*ba)+shape3d.sidA(sNum,sLen,d);
    }

}
