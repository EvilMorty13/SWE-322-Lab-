/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpattern;

/**
 *
 * @author Avik
 */
public class Main {
    public static void main(String[] args) {
        Burger b = new BurgerBuilder().setCheese(2).setMeat(2).setOnions(3).getBurger();
        
        System.out.println("Cheese : "+b.getCheese());
        System.out.println("Tomato : "+b.getTomato());
        System.out.println("Meat : "+b.getMeat());
        System.out.println("Onions : "+b.getOnions());
        System.out.println("Total Toppings : "+b.getTotalToppings());
        System.out.println();
        System.out.println("Cheese Price : "+b.getCheesePrice());
        System.out.println("Tomato Price : "+b.getTomatoPrice());
        System.out.println("Meat Price : "+b.getMeatPrice());
        System.out.println("Onions Price : "+b.getOnionsPrice());
        System.out.println("Total Price : "+b.getTotalPrice());
    }
}
