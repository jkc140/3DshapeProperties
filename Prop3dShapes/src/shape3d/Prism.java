/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape3d;

import prop3dshapes.shape2d;

/**
 *
 * @author S331474817
 */
public class Prism extends shape3d{
    public double volume(){
        return baseArea*depth;
    }

    public double SA(shape2d inst2dShape){
        return (2*baseArea) + sideA(inst2dShape.sideLen.length,inst2dShape.sideLen,depth);
    }

}
