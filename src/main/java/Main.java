import java.util.*;

public class Main {

    public static void main(String[] args) {

        Product product0 = new Product("Oat meal", "Crackers", 123l, 12.0);
        Product product1 = new Product("Oat", "Cereals", 120l, 12.0);
        Product product2 = new Product("milk", "Diary", 456l, 12.0);
        Product product3 = new Product("milo", "chocolate", 12l, 12.0);
        Product product4 = new Product("cup", "Utensils", 3l, 12.0);
        Product product5 = new Product("chair", "Furniture", 103l, 12.0);
        Customer customer1 = new Customer("Eels", new ArrayList<>(Arrays.asList(product0, product1, product2, product3, product4, product5)), 12345.9876);
        Customer customer2 = new Customer("Princely", new ArrayList<>(Arrays.asList(new Product("Oat meal", "Crackers", 333l, 12.0), product4, product5)), 12345.9876);
        CustomerServiceImplementation customerServiceImplementation =  new CustomerServiceImplementation();
        CustomerDTO customerDTO0 =  new CustomerDTO();
        customerDTO0.setName(customer1.getName());
        CustomerDTO customerDTO1 =  new CustomerDTO();
        customerDTO1.setName(customer2.getName());
        customerServiceImplementation.getFifo().add(customer1);
        customerServiceImplementation.addToQueue(customer1, customerDTO0 );
        customerServiceImplementation.getFifo().add(customer2);
        customerServiceImplementation.addToQueue(customer2, customerDTO1);
        customerServiceImplementation.buyProduct(customerServiceImplementation.getFifo(), customerServiceImplementation.getPriorityQueueMap());

    }
}
