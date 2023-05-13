/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategypattern;

/**
 *
 * @author Avik
 */
public class NoTires implements Tire{

    @Override
    public void tire() {
        System.out.println("It don't have tires");
    }
    
}

