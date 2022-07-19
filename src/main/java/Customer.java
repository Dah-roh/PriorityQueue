import java.util.ArrayList;
import java.util.List;

public class Customer implements Comparable<Customer>{
    private String name;
    private List<Product> cart = new ArrayList<>();
    private double wallet;

    public Customer() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public Customer(String name, List<Product> cart, double wallet) {
        this.name = name;
        this.cart = cart;
        this.wallet = wallet;
    }

    @Override
    public int compareTo(Customer o) {
        return 0;
    }
}
