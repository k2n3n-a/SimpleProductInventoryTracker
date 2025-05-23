import java.util.List;

public class Store {

    String name;
    String location;
    static List<Product> productList;



    public Store(String name, String location, List<Product> productList) {
        this.name = name;
        this.location = location;
        Store.productList = productList;
    }



    public void printSummary(){
        System.out.println("Products: ");
        double total_price=0;
        for (Product p:productList){

            total_price+=p.total_products_price();
            System.out.println(p);

        }
        System.out.println("Total Price: $"+total_price);
    }

    @Override
    public String toString() {
        return "Store: " + name + "\n" +
                "Location: " + location;
    }
}

