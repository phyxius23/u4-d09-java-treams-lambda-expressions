package app;

import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Logger;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static Logger logger = (Logger) LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {

    /* ********** PRODOTTI ********** */
    List<Product> products = new ArrayList<>(); // all'interno di <> non serve specificare il tipo in quanto è implicito

    Product productOne = new Product("Libro Java", "Books", 154.99);
    Product productTwo = new Product("Libro Javascript", "Books", 151.99);
    Product productThree = new Product("Libro React", "Books", 24.99);
    Product productFour = new Product("Libro HTML/CSS", "Books", 19.99);
    Product productFive = new Product("Pallone Tango", "Boys", 20.00);
    Product productSix = new Product("Maglia R.Baggio", "Boys", 1000000.00);
    Product productSeven = new Product("Sciarpa Italia", "Boys", 19.99);
    Product productEight = new Product("Bandiera Italia", "Boys", 30.99);
    Product productNine = new Product("Bavaglio", "Baby", 9.99);
    Product productTen = new Product("Vestito", "Baby", 14.99);
    Product productEleven = new Product("Ciuccio", "Baby", 4.99);
    Product productTwelve = new Product("Calzini", "Baby", 4.99);

    // Riempio Products
    // esiste un metodo per aggiungere tutti i prodotti in un unico passaggio?
    products.add(productOne);
    products.add(productTwo);
    products.add(productThree);
    products.add(productFour);
    products.add(productFive);
    products.add(productSix);
    products.add(productSeven);
    products.add(productEight);
    products.add(productNine);
    products.add(productTen);
    products.add(productEleven);
    products.add(productTwelve);

    /**
     * ********** *********** **********
     * ********** ESERCIZIO 1 **********
     * ********** *********** **********
     */
    List<String> listBooks = products.stream().filter(book -> book.getCategory().equals("Books"))
        .filter(book -> book.getPrice() > 100).map(Product::getName).toList();
    logger.info("Book con prezzo maggiore a 100: " + listBooks);

    /**
     * ********** *********** **********
     * ********** ESERCIZIO 2 **********
     * ********** *********** **********
     */
    LocalDate orderDate = LocalDate.now();
    LocalDate deliveryDateOne = orderDate.plusDays(2);
    LocalDate deliveryDateTwo = orderDate.plusDays(4);

    /* ********** CLIENTI ********** */
    Customer antonio = new Customer("Antonio", 3);
    Customer ilaria = new Customer("Ilaria", 5);
    Customer schia = new Customer("Schia", 4);
    Customer nina = new Customer("Nina", 9);
    Customer leon = new Customer("Leon", 18);

    /* ********** ORDINI ********** */
    List<Order> orders = new ArrayList<>();
    Order orderOne = new Order("In elaborazione", orderDate, deliveryDateOne, products, schia);
    Order orderTwo = new Order("Spedito", orderDate, deliveryDateTwo, products, nina);

    orders.add(orderOne);
    orders.add(orderTwo);

    List<Order> listBaby = orders.stream()
        .filter(order -> order.getProducts().stream().anyMatch(product -> product.getCategory().equals("Baby")))
        .toList();

    logger.info("Boys con sconto del 10%: " + listBaby);

    /**
     * ********** *********** **********
     * ********** ESERCIZIO 3 **********
     * ********** *********** **********
     */
    List<Product> listBoys = products.stream().filter(boy -> boy.getCategory().toString().equals("Boys")).map(boy -> {
      boy.setPrice(boy.getPrice() - ((Math.round(boy.getPrice() * 10) / 100)));
      return boy;
    }).toList();
    logger.info("Boys con sconto del 10%: " + listBoys);
    logger.info("");
  }
}
