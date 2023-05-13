/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategypattern;

/**
 *
 * @author Avik
 */
public class SpeedBoat extends Vehicle {

    public SpeedBoat() {
        tireX = new NoTires();
        flyX = new CannotFly();
    }
    
}
