package app;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    /**
     * ISTANZA DELLA CLASSE CUSTOMER
     * ***********************************************
     */
    Customer antonio = new Customer("Antonio", 3);
    Customer ilaria = new Customer("Ilaria", 5);
    Customer schia = new Customer("Schia", 4);
    Customer nina = new Customer("Nina", 9);
    Customer leon = new Customer("Leon", 18);

    /**
     * ISTANZA DELLA CLASSE PRODUCT
     * ***********************************************
     */
    List<Product> products = new ArrayList<>(); // all'interno di <> non serve specificare il tipo in quanto è implicito

    Product productOne = new Product(null, null, null);
    Product productTwo = new Product(null, null, null);
    Product productThree = new Product(null, null, null);
    Product productFour = new Product(null, null, null);
    Product productFive = new Product(null, null, null);
    Product productSix = new Product(null, null, null);
    Product product = new Product(null, null, null);
    Product product = new Product(null, null, null);
    Product product = new Product(null, null, null);
    Product product = new Product(null, null, null);
    Product product = new Product(null, null, null);
    Product product = new Product(null, null, null);
  }

}
