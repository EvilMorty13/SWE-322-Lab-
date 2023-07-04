/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIP;

/**
 *
 * @author Avik
 */
public class Cash implements CanteenPayment{

    @Override
    public void canteenBill(int amount) {
        System.out.println("Paid in cash");
    }
    
}
