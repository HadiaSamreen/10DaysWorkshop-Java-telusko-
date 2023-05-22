package ProductManagementSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
	
	List<Product> products= new ArrayList<>();
    
	public void addProduct(Product p) {
    	 products.add(p);
     }
	
	public List<Product> getAllProducts(){
		return products;
	}
	
	public Product getProduct(String name) {
		for(Product p: products)
		{
			if(p.getName().equals(name))
				return p;
		}
		return null;
	}
	
	public List<Product> getProductWithText(String text){
		String str = text.toLowerCase();
		
		List<Product> products = new ArrayList<>();
		
		for(Product p : products) {
			if(p.getName().contains(str) || p.getType().contains(str) ||p.getPlace().contains(str))
			{
				products.add(p);
			}
		}
		return products;
	}
	
	
	//Assignment 1
	//getting a product by place
	public List<Product> getProductByPlace(String place) {
		List<Product> searchedList = new ArrayList<>();
		
		for(Product p: products)
		{
			if(p.getPlace().contains(place))
				searchedList.add(p);
		}
		return searchedList;
	}
	
	//Assignment 2
	//Finding products which are out of warranty
	public List<Product> getProductsOutOfWarranty(){
		List<Product> outOfWarranty =new ArrayList<>();
		LocalDate currentDate = LocalDate.now();
		
		int currentYear = currentDate.getYear();
		
		for(Product p : products)
		{
			if(p.getWarranty() < currentYear)
				outOfWarranty.add(p);
		}
		return outOfWarranty;
	}
	
}
