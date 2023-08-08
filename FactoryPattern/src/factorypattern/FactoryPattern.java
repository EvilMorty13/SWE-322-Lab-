/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorypattern;

import Concrete_Creator.Level1.Level1AsteroidsFactory;
import Concrete_Creator.Level1.Level1BlackHoleFactory;
import Concrete_Creator.Level1.Level1DebrisFieldFactory;
import Concrete_Creator.Level1.Level1EnemyShipFactory;
import Concrete_Creator.Level1.Level1SolarFlareFactory;
import Concrete_Creator.Level2.Level2AsteroidsFactory;
import Concrete_Creator.Level2.Level2BlackHoleFactory;
import Concrete_Creator.Level2.Level2DebrisFieldFactory;
import Concrete_Creator.Level2.Level2EnemyShipFactory;
import Concrete_Creator.Level2.Level2SolarFlareFactory;
import Creator.AsteroidsFactory;
import Creator.BlackHoleFactory;
import Creator.DebrisFieldFactory;
import Creator.EnemyShipFactory;
import Creator.SolarFlareFactory;
import Product.Asteroids;
import Product.BlackHole;
import Product.DebrisField;
import Product.EnemyShip;
import Product.SolarFlare;

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
        BlackHoleFactory blackHoleFactory;
        DebrisFieldFactory debrisFieldFactory;
        SolarFlareFactory solarFlareFactory;
        
        if(level == 1){  
             asteroidsFactory = new Level1AsteroidsFactory();
             enemyShipFactory = new Level1EnemyShipFactory();
             blackHoleFactory = new Level1BlackHoleFactory();
             debrisFieldFactory = new Level1DebrisFieldFactory();
             solarFlareFactory = new Level1SolarFlareFactory();
        }
        else{
            asteroidsFactory = new Level2AsteroidsFactory();
            enemyShipFactory = new Level2EnemyShipFactory();
            blackHoleFactory = new Level2BlackHoleFactory();
            debrisFieldFactory = new Level2DebrisFieldFactory();
            solarFlareFactory = new Level2SolarFlareFactory();
        }
        
        
        System.out.println("Now playing level : "+level);
        System.out.println("Current Score : "+score);
        Asteroids asteroids = asteroidsFactory.createAsteroids(score);
        EnemyShip enemyShip = enemyShipFactory.createEnemyShip(score);
        BlackHole blackHole = blackHoleFactory.createBlackHole(score);
        DebrisField debrisField = debrisFieldFactory.createDebrisField(score);
        SolarFlare solarFlare = solarFlareFactory.createSolarFlare(score);
        asteroids.show();
        enemyShip.show();
        blackHole.show();
        debrisField.show();
        solarFlare.show();
    }
}
/*
Sample Output
Now playing level : 1
Current Score : 601
Ice_Asteroids popped up
Small enemyship popped up
Small_BlackHole popped up
Small_DebrisField popped up
Small_SolarFlare popped up
*/