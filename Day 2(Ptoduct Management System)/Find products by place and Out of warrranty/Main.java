package ProductManagementSystem;
 
import java.util.List;
public class Main {
     public static void main(String args[])
     {
    	  ProductService service= new ProductService();
    	  
    	  //hey service, add the products
    	  
    	  service.addProduct(new Product("Asus Vivobook","Laptop","Brown Table",2022));
    	  service.addProduct(new Product("Type C","Cable","Black Drawer",2024));
    	  service.addProduct(new Product("Mac Studio","Computer","White Table",2025));
    	  service.addProduct(new Product("Focusrite Mixer","Audio System","White Table",2025));
    	  service.addProduct(new Product("Asus Vivobook","Laptop","Brown Drawer",2021));
    	  service.addProduct(new Product("Asus Rog","Laptop","Black Table",2021));
    	  service.addProduct(new Product("Macbook pro","Laptop","Brown Drawer",2022));
    	  service.addProduct(new Product("Wacon Pad","Writing Pad","Black Drawer",2020));
    	  service.addProduct(new Product("Apple keyboard","keyboard","White Table",2022));
    	  service.addProduct(new Product("Logitech Keyboard","Keyboard","Black Table",2024));
    	  service.addProduct(new Product("Hdmi Cable","Cable","Black Drawer",2024));
    	  service.addProduct(new Product("Logi Mouse","Mouse","Black Table",2022));
    	  service.addProduct(new Product("Apple Mouse","Mouse","White Table",2022));
    	  service.addProduct(new Product("Lenovo Mouse","Mouse","Black Drawer",2022));
    	  service.addProduct(new Product("BlackBeast","Computer","White Table",2022));
    	  
    	 List<Product> products = service.getAllProducts();
    	 for(Product p : products) {
    		 System.out.println(p);
    	 }
    	 System.out.println("=========================================");
    	 
    	 System.out.println("a Particular product");
    	 
    	 List<Product> prods = service.getProductWithText("black");
    	 for(Product p : prods)
    	 {
    		 System.out.println(p);
    	 }
    	 
    	 
    	 
    	//ASSIGNMENT 1
    	 //searching a product by  place
         System.out.println("==============================================");
         System.out.println("Search by a place : ");

         String place = "Table";
         System.out.println("Searched String = " + place + "\n");

    	 
    	 List<Product> prod =  service.getProductByPlace(place);
    	 for(Product p : prod)
    	 {
    		System.out.println(p);
    	 }
    	 
    	 
    	 
    	 //Assignment 2
    	 //finding products out of warranty
    	    System.out.println("==============================================");
            System.out.println("Products that are out of warranty : \n");

            List<Product> outOfWarranty = service.getProductsOutOfWarranty();

            for(Product p : outOfWarranty){
                System.out.println(p);
            }
    	 
    	 

     }
}
