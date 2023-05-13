/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategypattern;

/**
 *
 * @author Avik
 */
public class Main {
    public static void main(String[] args) {
        Vehicle testVehicle = new Plane();
        System.out.println("Plane : ");
        testVehicle.tireExistance();
        testVehicle.flyAbility();
        
        testVehicle = new SpeedBoat();
        System.out.println("SpeedBoat : ");
        testVehicle.tireExistance();
        testVehicle.flyAbility();
    }
}
