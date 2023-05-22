package UsingStreamAPI;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
        service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));


        //NOTE: THIS PART OF CODE IS ADDED BY ME

        //Searching with name
        System.out.println("Search by a name : ");
        String name = "Java";
        System.out.println("Searched name = " + name + "\n");

        List<Product> searchByName = service.getProduct(name);
        for(Product p : searchByName)
            System.out.println(p);
        

        //Searching with text
        System.out.println("==============================================");
        System.out.println("Search by a text : ");
        String text = "Mouse";
        System.out.println("Searched text = " + text + "\n");

        List<Product> searchByText = service.getProductWithText(text);
        for(Product p : searchByText){
            System.out.println(p);
        }

        //Searching with place
        System.out.println("==============================================");
        System.out.println("Search by a place : ");
        String place = "Drawer";
        System.out.println("Searched Place = " + place + "\n");

        List<Product> searchByPlace = service.getProductsWithPlace(place);

        for(Product p : searchByPlace){
            System.out.println(p);
        }

        //Searching with warranty
        System.out.println("==============================================");
        System.out.println("Products that are out of warranty : \n");

        List<Product> outOfWarranty = service.getAllProductsWithoutWarranty();

        for(Product p : outOfWarranty){
            System.out.println(p);
        }

    }
}