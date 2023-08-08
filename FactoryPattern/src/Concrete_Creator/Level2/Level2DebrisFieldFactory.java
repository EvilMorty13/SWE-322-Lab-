/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concrete_Creator.Level2;

import Concrete_Product.DebrisField.Huge_DebrisField;
import Concrete_Product.DebrisField.Large_DebrisField;
import Creator.DebrisFieldFactory;
import Product.DebrisField;

/**
 *
 * @author Avik
 */
public class Level2DebrisFieldFactory extends DebrisFieldFactory{

    @Override
    public DebrisField createDebrisField(int score) {
        if(score < 1000) return new Large_DebrisField();
        else return new Huge_DebrisField();
    }
    
}
