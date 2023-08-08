/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordersystem;

/**
 *
 * @author Avik
 */
class Item {
  private String description;
  private double price;
  private double weight;
  private double taxRate;

  public Item(String description, double price, double weight,double taxRate) {
    this.description = description;
    this.price = price;
    this.weight = weight;
    this.taxRate = taxRate;
  }

  public double getPrice() {
    return price;
  }

  public double getWeight() {
    return weight;
  }
  
  public double getTaxRate() {
    return taxRate;
  }
}