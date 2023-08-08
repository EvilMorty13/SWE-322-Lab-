/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordersystem;

/**
 *
 * @author Avik
 */
class Check extends Payment {
  private String bankId;

  public Check(String bankId) {
    this.bankId = bankId;
  }

  @Override
  public void pay(double amount) {
    System.out.println("Paid " + amount + " by check, check number " + bankId);
  }
}