package product;

public class Mobile extends Product{
	
	int ram ;
	int hd;
	Mobile(){
		
	}
	Mobile(String brand , double price , String category , int ram ,  int hd){
		super(brand , category , price);
		this.ram = ram;
		this.hd = hd;
		
	}
	@Override
	public String toString() {
		return "Mobile [ram=" + ram + ", hd=" + hd + ", brand=" + brand + ", category=" + category + ", price=" + price
				+ "]";
	}

}
