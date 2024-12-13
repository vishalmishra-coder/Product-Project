package product;

public class Shirt extends Product{
	int size;
	String color;
	Shirt(){
		
	}
	Shirt(String brand , double price  ,String category, int size ,String color ){
		super(brand , category , price );
		this.size = size;
		this.color = color;
		
	}
	@Override
	public String toString() {
		return "Shirt [size=" + size + ", color=" + color + ", brand=" + brand + ", category=" + category + ", price="
				+ price + "]";
	}
	

}
