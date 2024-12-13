package product;

public class Sweater extends Product{
	int size;
	String color;
	Sweater(){
		
	}
	
	Sweater(String brand , String category , String color, double price , int size ){
		super(brand , category , price);
		this.size = size;
		this.color = color;
		
	}

	@Override
	public String toString() {
		return "Sweater [size=" + size + ", color=" + color + ", brand=" + brand + ", category=" + category + ", price="
				+ price + "]";
	}
	

}
