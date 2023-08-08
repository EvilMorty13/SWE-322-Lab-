/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordersystem;

import java.util.List;

/**
 *
 * @author Avik
 */
class Order {
  private Customer customer;
  private List<OrderDetail> orderDetails;
  private Payment payment;

  public Order(Customer customer, List<OrderDetail> orderDetails, Payment payment) {
    this.customer = customer;
    this.orderDetails = orderDetails;
    this.payment = payment;
  }

  public double calcSubtotal() {
    double subtotal = 0;
    for (OrderDetail orderDetail : orderDetails) {
      subtotal += orderDetail.calcSubtotal();
    }
    return subtotal;
  }

  public double calcWeight() {
    double weight = 0;
    for (OrderDetail orderDetail : orderDetails) {
        weight += orderDetail.calcWeight();
    }
    return weight;
  }

  public double calcTax() {
    double tax = 0;
        for (OrderDetail orderDetail : orderDetails) {
            tax += orderDetail.calcTax();
        }
        return tax;
    }
  
   public double calcBill(){
      return calcSubtotal()+calcTax();
   }
  
     public void Payment() {
        payment.pay(calcBill()); 
    }
}
