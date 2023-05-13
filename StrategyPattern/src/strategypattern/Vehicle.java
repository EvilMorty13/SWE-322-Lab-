/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategypattern;

/**
 *
 * @author Avik
 */
public class Vehicle {
       Fly flyX;
       Tire tireX;
       
    
       
       public void tireExistance(){
           tireX.tire();
       }
       
       public void flyAbility(){
           flyX.fly();
       }
}
