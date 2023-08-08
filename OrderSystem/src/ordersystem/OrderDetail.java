/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordersystem;

/**
 *
 * @author Avik
 */
class OrderDetail {
  private Item item;
  private int quantity;

  public OrderDetail(Item item, int quantity) {
    this.item = item;
    this.quantity = quantity;
  }

  public double calcSubtotal() {
    return item.getPrice() * quantity;
  }

  public double calcWeight() {
    return item.getWeight() * quantity;
  }
  
  public double calcTax() {
    return item.getTaxRate() * quantity;
  }
}
