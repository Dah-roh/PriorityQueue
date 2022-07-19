import java.util.Comparator;

public class CustomerDTO implements Comparator<CustomerDTO> {
    private String name;
    private long quantity;


    public CustomerDTO() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compare(CustomerDTO o1, CustomerDTO o2) {
        return Long.compare(o1.quantity, o2.quantity);
    }
}
