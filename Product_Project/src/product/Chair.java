package product;

import java.time.LocalDate;

public class Chair extends Product{
	double size;
	double width;
	String color;
	String mfd;
	Chair(){
		
	}
	 
	Chair(String brand ,  String category ,  String color , String mfd , double price ,double size , double width ){
		super(brand , category , price);
		this.size = size;
		this.width = width;
		this.color = color;
		this.mfd = mfd;
		
	}

	@Override
	public String toString() {
		return "Chair [size=" + size + ", width=" + width + ", color=" + color + ", mfd=" + mfd + ", brand=" + brand
				+ ", category=" + category + ", price=" + price + "]";
	}

}
