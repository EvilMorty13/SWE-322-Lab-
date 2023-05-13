
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpattern;

/**
 *
 * @author Avik
 */
public class Burger {
    private int cheese;
    private int tomato;
    private int meat;
    private int onions;

    public Burger(int cheese, int tomato, int meat, int onions) {
        this.cheese = cheese;
        this.tomato = tomato;
        this.meat = meat;
        this.onions = onions;
    }

    public int getCheese() {
        return cheese;
    }

    public int getTomato() {
        return tomato;
    }

    public int getMeat() {
        return meat;
    }

    public int getOnions() {
        return onions;
    }  
    
    public int getTotalToppings() {
        return getCheese()+getTomato()+getMeat()+getOnions();
    } 
}
