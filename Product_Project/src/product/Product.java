package product;

public class Product {
	String brand;
	String category;
	double price;
	Product(){
		
	}
	    Product(String brand, String category ,  double price) {
		super();
		this.brand = brand;
		this.category = category;
		this.price = price;
	}
		@Override
		public String toString() {
			return "Product [brand=" + brand + ", category=" + category + ", price=" + price + "]";
		}
		

}
