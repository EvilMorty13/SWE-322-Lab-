/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concrete_Creator.Level1;

import Concrete_Product.BlackHoles.Medium_BlackHole;
import Concrete_Product.BlackHoles.Small_BlackHole;
import Creator.BlackHoleFactory;
import Product.BlackHole;

/**
 *
 * @author Avik
 */
public class Level1BlackHoleFactory extends BlackHoleFactory {

    @Override
    public BlackHole createBlackHole(int score) {
        if(score < 1000) return new Small_BlackHole();
        else return new Medium_BlackHole();
    }
    
}
