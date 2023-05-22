package UsingStreamAPI;

//USING STREAM API FOR THIS CLASS
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProductService {

  List<Product> products = new ArrayList<>();

  public void addProduct(Product p){
      products.add(p);
  }

  public List<Product> getAllProducts(){
      return products;
  }

  //THIS FUNCTION WILL RETURN ALL THE PRODUCTS SEARCHED BY NAME
  //USING STREAM API
  public List<Product> getProduct(String name){

      // for(Product p : products){
      //     if(p.getName().equals(name))
      //         return p;
      // }

      List<Product> returnProd = products.stream()
                                      .filter(p -> p.getName().contains(name))
                                      .toList();

      return returnProd;
  }

  //THIS FUNCTION WILL RETURN ALL THE PRODUCTS SEARCHED BY TEXT
  //USING STREAM API
  public List<Product> getProductWithText(String text) {
      String str = text.toLowerCase();
      List<Product> prods = new ArrayList<>();

      // for(Product p : products){
      //     String name = p.getName().toLowerCase();
      //     String type = p.getType().toLowerCase();
      //     String place = p.getPlace().toLowerCase();
      //     if(name.contains(str) || type.contains(str) || place.contains(str))
      //         prods.add(p);
      // }

      prods = products.stream()
                      .filter(p -> (p.getName().toLowerCase().contains(str) || p.getType().toLowerCase().contains(str) || p.getPlace().toLowerCase().contains(str)))
                      .toList();

      return prods;

  }

  //THIS FUNCTION WILL RETURN ALL THE PRODUCTS WITH THE MATCHING PLACE SEARCHED BY THE USER
  //USING STREAM API
  public List<Product> getProductsWithPlace(String place) {

      List<Product> searchedList = new ArrayList<>();

      // for(Product p : products){
      //     if(p.getPlace().contains(place))
      //         searchedList.add(p);
      // }

      searchedList = products.stream()
                              .filter(p -> p.getPlace().contains(place))
                              .toList();

      return searchedList;
  }

  //THIS FUNCTION WILL RETURN THE PRODUCTS WHICH ARE OUT OF WARRANTY
  //USING STREAM API
  public List<Product> getAllProductsWithoutWarranty(){

      List<Product> outOfWarranty = new ArrayList<>();

      LocalDate currentDate = LocalDate.now();

      int currentYear = currentDate.getYear();

      // for(Product p : products){
      //     if(p.getWarranty() < currentYear)
      //         outOfWarranty.add(p);
      // }

      outOfWarranty = products.stream()
                              .filter(p -> (p.getWarranty() < currentYear))
                              .toList();

      return outOfWarranty;
  }
}