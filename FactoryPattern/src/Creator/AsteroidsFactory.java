/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creator;

import Product.Asteroids;

/**
 *
 * @author Avik
 */
public abstract class AsteroidsFactory {
    public abstract Asteroids createAsteroids(int score);
}
