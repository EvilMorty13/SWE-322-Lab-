/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concrete_Creator.Level1;

import Concrete_Product.DebrisField.Medium_DebrisField;
import Concrete_Product.DebrisField.Small_DebrisField;
import Creator.DebrisFieldFactory;
import Product.DebrisField;

/**
 *
 * @author Avik
 */
public class Level1DebrisFieldFactory extends DebrisFieldFactory{

    @Override
    public DebrisField createDebrisField(int score) {
        if(score < 1000) return new Small_DebrisField();
        else return new Medium_DebrisField();
    }
    
}
