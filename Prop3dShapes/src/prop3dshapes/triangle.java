/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prop3dshapes;

/**
 *
 * @author S331474817
 */
public class triangle extends shape2d{
   
    public double sL1;
    public double sL2;
    public double base;
    public double height;
   
    public double area(double b, double h){
        return b*h/2;
    }
}