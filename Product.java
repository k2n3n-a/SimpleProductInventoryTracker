import java.util.ArrayList;
import java.util.List;

public class Product {
    String name;
    String category;
    int quantity;
    double price;


    public Product(String name, String category, int quantity, double price) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    public double total_products_price(){

        return  quantity*price;

    }

    @Override
    public String toString() {
        return
                "- " + name + " -- " +
                        category + " -- quantity: " +
                        quantity +
                        " -- price: " + "$" + price;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}




