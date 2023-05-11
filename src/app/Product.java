package app;

import java.util.concurrent.ThreadLocalRandom;

public class Product {

  // Attributi
  // private Long id;
  private Long id = ThreadLocalRandom.current().nextLong(9223327036854775807L);

  private String name;
  private String category;
  private Double price;

  // Costruttore
  public Product(String n, String c, Double p) {
    this.setName(n);
    this.setCategory(c);
    this.setPrice(p);
  }

  // Getters & Setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

}
