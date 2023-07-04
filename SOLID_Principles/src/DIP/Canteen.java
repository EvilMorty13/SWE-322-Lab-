/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIP;

/**
 *
 * @author Avik
 */
public class Canteen {
    private CanteenPayment canteenPayment;
    public Canteen(CanteenPayment canteenPayment) {
        this.canteenPayment = canteenPayment;
    }
    public void pay(int amount) {
        canteenPayment.canteenBill(amount);
    }
}
