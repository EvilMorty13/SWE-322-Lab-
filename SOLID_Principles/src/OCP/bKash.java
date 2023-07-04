/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP;

/**
 *
 * @author Avik
 */
public class bKash implements CreditFee {

    @Override
    public double cashback(double amount) {
       return amount*0.025;
    }
}
