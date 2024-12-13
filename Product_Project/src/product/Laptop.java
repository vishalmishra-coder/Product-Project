package product;

public class Laptop extends Product{
	int ram;
	int ssd;
	
	Laptop(){
		
	}
	Laptop(String brand , String category , double price , int ram , int ssd ){
		super(brand , category , price);
		this.ram = ram;
		this.ssd = ssd;	
	}
	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", ssd=" + ssd + ", brand=" + brand + ", category=" + category + ", price="
				+ price + "]";
	}
	

}
