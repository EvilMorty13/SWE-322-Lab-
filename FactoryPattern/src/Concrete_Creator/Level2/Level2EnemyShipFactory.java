/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concrete_Creator.Level2;

import Concrete_Product.EnemyShips.Huge_EnemyShip;
import Concrete_Product.EnemyShips.Large_EnemyShip;
import Creator.EnemyShipFactory;
import Product.EnemyShip;

/**
 *
 * @author Avik
 */
public class Level2EnemyShipFactory extends EnemyShipFactory{

    @Override
    public EnemyShip createEnemyShip(int score) {
        if(score < 1000) return new Large_EnemyShip();
        else return new Huge_EnemyShip();
    } 
}
