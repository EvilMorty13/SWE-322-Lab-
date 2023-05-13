/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concrete_Creator.Level1;

import Concrete_Product.Asteroids.Ice_Asteroids;
import Concrete_Product.Asteroids.Iron_Asteroids;
import Creator.AsteroidsFactory;
import Product.Asteroids;

/**
 *
 * @author Avik
 */
public class Level1AsteroidsFactory extends AsteroidsFactory {

    @Override
    public Asteroids createAsteroids(int score) {
        if(score < 1000) return new Ice_Asteroids();
        else return new Iron_Asteroids();
    }
}
