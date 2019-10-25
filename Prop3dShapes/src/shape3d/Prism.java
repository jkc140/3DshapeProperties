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
    public double volume(){
        return shape3d.BA*shape3d.depth;
    }
    
    public double SA(int sNum,double[]sLen,double d){
        return(2*shape3d.BA)+shape3d.sidA(sNum,sLen,d);
    }
    
}
