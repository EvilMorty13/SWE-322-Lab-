/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordersystem;

/**
 *
 * @author Avik
 */
class Credit extends Payment {
  private String cardNumber;
  private String type;
  private String expirationDate;


  public Credit(String cardNumber,String type,String expirationDate) {
    this.cardNumber = cardNumber;
    this.type = type;
    this.expirationDate = expirationDate;
  }

  @Override
  public void pay(double amount) {
    System.out.println("Paid " + amount + " through credit card, card number " + cardNumber);
  }
}
