/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategypattern;

/**
 *
 * @author Avik
 */
public class Plane extends Vehicle{
    public Plane(){
       tireX = new HasTires();
       flyX = new CanFly();
    }
}
