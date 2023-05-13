/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorypattern;

import Concrete_Creator.Level1.Level1AsteroidsFactory;
import Concrete_Creator.Level1.Level1EnemyShipFactory;
import Concrete_Creator.Level2.Level2AsteroidsFactory;
import Concrete_Creator.Level2.Level2EnemyShipFactory;
import Creator.AsteroidsFactory;
import Creator.EnemyShipFactory;
import Product.Asteroids;
import Product.EnemyShip;

/**
 *
 * @author Avik
 */
public class FactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int level = (int)(Math.random() * 2) + 1;
        int score = (int)(Math.random() * 2000);
        
        AsteroidsFactory asteroidsFactory;
        EnemyShipFactory enemyShipFactory;
        
        if(level == 1){  
             asteroidsFactory = new Level1AsteroidsFactory();
             enemyShipFactory = new Level1EnemyShipFactory();
        }
        else{
            asteroidsFactory = new Level2AsteroidsFactory();
            enemyShipFactory = new Level2EnemyShipFactory();
        }
        
        
        System.out.println("Now playing level : "+level);
        System.out.println("Current Score : "+score);
        Asteroids asteroids = asteroidsFactory.createAsteroids(score);
        EnemyShip enemyShip = enemyShipFactory.createEnemyShip(score);
        asteroids.show();
        enemyShip.show();
    }
}
