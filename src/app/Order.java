package app;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Order {

  // Attributi
  // private Long id;
  // long v = ThreadLocalRandom.current().nextLong(100);
  private Long id = ThreadLocalRandom.current().nextLong(9223327036854775807L);

  private String status;
  private LocalDate orderDate;
  private LocalDate deliveryDate;
  private List<Product> products;
  private Customer customer;

  // Costruttore
  public Order(String s, LocalDate od, LocalDate dd, List<Product> p, Customer c) {
    this.setStatus(s);
    this.setOrderDate(od);
    this.setDeliveryDate(dd);
    this.setProducts(p);
    this.setCustomer(c);
  }

  // Getters & Setters
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public LocalDate getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(LocalDate orderDate) {
    this.orderDate = orderDate;
  }

  public LocalDate getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  // public Long getId() {
  // return id;
  // }

  // public void setId(Long id) {
  // this.id = id;
  // }

  // private int numberRandom() {

  // }

}
