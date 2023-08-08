/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concrete_Creator.Level2;

import Concrete_Product.SolarFlares.Huge_SolarFlare;
import Concrete_Product.SolarFlares.Large_SolarFlare;
import Creator.SolarFlareFactory;
import Product.SolarFlare;

/**
 *
 * @author Avik
 */
public class Level2SolarFlareFactory extends SolarFlareFactory {

    @Override
    public SolarFlare createSolarFlare(int score) {
        if(score < 1000) return new Large_SolarFlare();
        else return new Huge_SolarFlare();
    }
    
}
