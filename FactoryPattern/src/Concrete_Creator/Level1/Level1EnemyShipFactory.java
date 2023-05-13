/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concrete_Creator.Level1;

import Concrete_Product.EnemyShips.Medium_EnemyShip;
import Concrete_Product.EnemyShips.Small_EnemyShip;
import Creator.EnemyShipFactory;
import Product.EnemyShip;

/**
 *
 * @author Avik
 */
public class Level1EnemyShipFactory extends EnemyShipFactory{

    @Override
    public EnemyShip createEnemyShip(int score) {
        if(score < 1000) return new Small_EnemyShip();
        else return new Medium_EnemyShip();
    } 
}
