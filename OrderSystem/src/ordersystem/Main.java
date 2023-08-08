/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordersystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Avik
 */
public class Main {
    
    public static void main(String[] args) {
        
        Customer customer = new Customer("Sakib Al Hasan", "Magura,Khulna");

        Item flour = new Item("Fresh flour", 130.00, 2,5);
        Item rice = new Item("Chinigura rice", 150.00, 1,10);


        OrderDetail flourOrder = new OrderDetail(flour, 5);
        OrderDetail riceOrder = new OrderDetail(rice, 2);


        List<OrderDetail> groceryList = new ArrayList<>();
        groceryList.add(flourOrder);
        groceryList.add(riceOrder);


        Payment payment = new Check("123456");

        Order order = new Order(customer, groceryList, payment);
        
        System.out.println("Name : "+customer.getName()+", Address : "+customer.getAddress());
        System.out.println("Price : "+order.calcSubtotal());
        System.out.println("Tax : "+order.calcTax());
        System.out.println("Weight : "+order.calcWeight());
        System.out.println("Total Bill : " + order.calcBill());
        order.Payment();
    }    
}

/*

Name : Sakib Al Hasan, Address : Magura,Khulna
Price : 950.0
Tax : 45.0
Weight : 12.0
Total Bill : 995.0
Paid 995.0 by check, check number 123456

*/
