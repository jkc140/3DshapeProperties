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
    public void volume(){
        volume= baseArea*depth;
    }

    public void SA(shape2d inst2dShape){
        SA= (2*baseArea)+sidA(inst2dShape.sideLen.length,inst2dShape.sideLen,depth);
    }

}
