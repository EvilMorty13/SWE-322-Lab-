/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIP;

/**
 *
 * @author Avik
 */
public class Main {
    public static void main(String[] args) {
        CanteenPayment canteenPayment = new Cash();
        Canteen canteen = new Canteen(canteenPayment);
        canteen.pay(200);
    }
}
