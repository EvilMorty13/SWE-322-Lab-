/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordersystem;

/**
 *
 * @author Avik
 */
class Cash extends Payment {
  @Override
  public void pay(double amount) {
    System.out.println("Paid " + amount+" in cash ");
  }
}
