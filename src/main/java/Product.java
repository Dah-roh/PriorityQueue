public class Product {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private String name;
    private String productCategory;
    private long quantity;
    private double price;

    public Product(String name, String productCategory, long quantity, double price) {
        this.name = name;
        this.productCategory = productCategory;
        this.quantity = quantity;
        this.price = price;
    }
}
