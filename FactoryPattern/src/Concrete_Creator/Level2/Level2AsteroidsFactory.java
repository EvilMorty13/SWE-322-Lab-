/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concrete_Creator.Level2;

import Concrete_Product.Asteroids.Rocky_Asteroids;
import Concrete_Product.Asteroids.Silicon_Asteroids;
import Creator.AsteroidsFactory;
import Product.Asteroids;

/**
 *
 * @author Avik
 */
public class Level2AsteroidsFactory extends AsteroidsFactory {

    @Override
    public Asteroids createAsteroids(int score) {
        if(score < 1000) return new Rocky_Asteroids();
        else return new Silicon_Asteroids();
    }
}
