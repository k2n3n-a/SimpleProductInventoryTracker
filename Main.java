import java.util.List;

public class Main {


    static Product appleProduct() {
        return new Product("Apple AirPods","electronic",15,193.03);
    }
    static Product samsungProduct() {
        return new Product("Samsung Galaxy Watch","electronic",5,219.99);
    }
    static Product xiaomiProduct() {
        return new Product("Xiaomi Smart Camera","electronic",25,54.99);
    }



    static Store store=new Store("Kontakt Home","Acami m/s",List.of(appleProduct(),samsungProduct(),xiaomiProduct()));


    public static void main(String[] args){
        System.out.println(store);
        store.printSummary();

    }





}