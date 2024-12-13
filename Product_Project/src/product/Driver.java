package product;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {

		ProductService service = new ProductService();
		Scanner sc = new Scanner(System.in);
		char c;
		do {
			System.out.println("Enter your choice : \n 1.Insert \n 2.Display \n 3.Delete");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter your choice :\n Chair \t Sweater \t Laptop \t Mobile \t Shirt ");
				String option = sc.next();
				switch (option) {
				case "Sweater": {
					System.out.println("Enter a brand : ");
					String brand = sc.next();
					System.out.println("Enter a Category : ");
					String category = sc.next();
					System.out.println("Enter a Color : ");
					String color = sc.next();
					System.out.println("Enter a Price : ");
					double price = sc.nextDouble();
					System.out.println("Enter a Size : ");
					int size = sc.nextInt();
					service.addProduct(new Sweater(brand , category , color , price , size));
					System.out.println("Data added");
					break;
				}
				case "Mobile": {
					System.out.println("Enter a brand : ");
					String brand = sc.next();
					System.out.println("Enter a Price : ");
					double price = sc.nextDouble();
					System.out.println("Enter a Category : ");
					String category = sc.next();
					System.out.println("Enter a ram : ");
					int ram = sc.nextInt();
					System.out.println("Enter a hd : ");
					int hd = sc.nextInt();
					service.addProduct(new Mobile(brand , price , category , ram , hd));
					System.out.println("Data added");
					break;
				}
				
				case "Chair": {
					System.out.println("Enter a brand : ");
					String brand = sc.next();
					System.out.println("Enter a Category : ");
					String category = sc.next();
					System.out.println("Enter a Color : ");
					String color = sc.next();
					System.out.println("Enter a mfd : ");
					String mfd = sc.next();
					System.out.println("Enter a Price : ");
					double price = sc.nextDouble();
					System.out.println("Enter a size : ");
					double size = sc.nextDouble();
					System.out.println("Enter a width : ");
					double width = sc.nextDouble();
					service.addProduct(new Chair(brand , category , color , mfd , price , size , width));
					System.out.println("data added");
					break;
				}
				case "Laptop":{
					System.out.println("Enter a brand : ");
					String brand = sc.next();
					System.out.println("Enter a Price : ");
					double price = sc.nextDouble();
					System.out.println("Enter a Category : ");
					String category = sc.next();
					System.out.println("Enter a ram : ");
					int ram = sc.nextInt();
					System.out.println("Enter a hd : ");
					int ssd = sc.nextInt();
					service.addProduct(new Laptop(brand , category , price, ram , ssd));
					System.out.println("Data added");
					break;
				}
				case "Shirt":{
					System.out.println("Enter a brand : ");
					String brand = sc.next();
					System.out.println("Enter a Category : ");
					String category = sc.next();
					System.out.println("Enter a Color : ");
					String color = sc.next();
					System.out.println("Enter a Price : ");
					double price = sc.nextDouble();
					System.out.println("Enter a Size : ");
					int size = sc.nextInt();
					service.addProduct(new Shirt(brand , price , category , size , color));
					System.out.println("Data added");
					break;
				}
				}
				break;
			}
			case 2: {
				System.out.println("Enter your choice :\n Chair \t Sweater \t Laptop \t Mobile \t Shirt \n ProductOnCategory \n allCategory \n allProducts ");
				String option = sc.next();
				switch (option) {
				case "Sweater": {
					service.getAllSweater();
					break;
				}
				case "Mobile": {
					service.getAllMobile();
					break;
				}
				case "Chair":{
					service.getAllChair();
					break;
				}
				case "Laptop":{
					service.getAllLaptop();
					break;
				}
				case "Shirt":{
					service.getAllShirts();
					break;
				}
				case "ProductOnCategory":{
					service.getAllProductOnCategory();
					break;
				}
				case "allCategory":{
					service.getAllCategory();
					break;
				}
				case "allProducts":{
					service.getProductType();
					break;
				}
				}
				break;
			}
			case 3:{

				System.out.println("Enter your choice :\n Chair \t Sweater \t Laptop \t Mobile \t Shirt ");
				String option = sc.next();
				switch (option) {
				case "Sweater": {
					service.removeProduct();
					break;
				}
				case "Mobile": {
					service.removeProduct();
					break;
				}
				case "Chair":{
					service.removeProduct();
					break;
				}
				case "Laptop":{
					service.removeProduct();
					break;
				}
				case "Shirt":{
					service.removeProduct();
					break;
				}
				}
				break;
			
				
			}
			}
			System.out.println("Press Y/y to continue :");
		    c = sc.next().charAt(0);

		}while(c=='y' || c=='Y');

	}
}
