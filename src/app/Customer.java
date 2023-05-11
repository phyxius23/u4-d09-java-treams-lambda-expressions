package app;

import java.util.concurrent.ThreadLocalRandom;

public class Customer {

  // Attributi
  // private Long id;
  private Long id = ThreadLocalRandom.current().nextLong(9223327036854775807L);

  private String name;
  private Integer tier;

  // Costruttore
  public Customer(String n, Integer t) {
    this.setName(n);
    this.setTier(t);
  }

  // Getters & Setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getTier() {
    return tier;
  }

  public void setTier(Integer tier) {
    this.tier = tier;
  }
}
