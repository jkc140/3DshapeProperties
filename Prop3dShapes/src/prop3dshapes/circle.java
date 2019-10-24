/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prop3dshapes;
import java.math.*;
/**
 *
 * @author S331474817
 */
public class circle extends shape2d{
    public double radius;
    public double area(double r){
        return r*r*Math.PI;
    }
}
