/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concrete_Creator.Level1;

import Concrete_Product.SolarFlares.Medium_SolarFlare;
import Concrete_Product.SolarFlares.Small_SolarFlare;
import Creator.SolarFlareFactory;
import Product.SolarFlare;

/**
 *
 * @author Avik
 */
public class Level1SolarFlareFactory extends SolarFlareFactory {

    @Override
    public SolarFlare createSolarFlare(int score) {
        if(score < 1000) return new Small_SolarFlare();
        else return new Medium_SolarFlare();
    }
    
}
