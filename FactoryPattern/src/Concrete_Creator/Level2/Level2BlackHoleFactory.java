/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concrete_Creator.Level2;

import Concrete_Product.BlackHoles.Huge_BlackHole;
import Concrete_Product.BlackHoles.Large_BlackHole;
import Creator.BlackHoleFactory;
import Product.BlackHole;

/**
 *
 * @author Avik
 */
public class Level2BlackHoleFactory extends BlackHoleFactory {

    @Override
    public BlackHole createBlackHole(int score) {
        if(score < 1000) return new Large_BlackHole();
        else return new Huge_BlackHole();
    }

}
