package product;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ProductService {
	private List<Product> l1 = new LinkedList<>();

	public void addProduct(Product p) {
		l1.add(p);
	}

	public void getAllProduct() {
		for (Product p : l1)
			System.out.println(p);

	}

	public void getAllShirts() {
		for (Product p : l1) {
			if (p instanceof Shirt)
				System.out.println(p);

		}
	}

	public void getAllChair() {
		for (Product p : l1) {
			if (p instanceof Chair)
				System.out.println(p);

		}
	}

	public void getAllSweater() {
		for (Product p : l1) {
			if (p instanceof Sweater)
				System.out.println(p);

		}
	}

	public void getAllMobile() {
		for (Product p : l1) {
			if (p instanceof Mobile)
				System.out.println(p);

		}
	}

	public void getAllLaptop() {
		for (Product p : l1) {
			if (p instanceof Laptop)
				System.out.println(p);

		}
	}

	public void getAllProductOnCategory() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the category : ");
		String u_cat = sc.nextLine();
		for (Product p : l1) {
			if (p.category.equalsIgnoreCase(u_cat))
				System.out.println(p);
		}
	}

	public void getProductCountOnCategory() {
		Map<String, Integer> m1 = new HashMap<>();
		for (Product p : l1) {
			if (m1.containsKey(p.category)) {
				m1.put(p.category, m1.get(p.category) + 1);
			} else {
				m1.put(p.category, 1);
			}
		}
		System.out.println(m1);
	}

	public void getAllCategory() {
		Set<String> s1 = new TreeSet<>();
		for (Product p : l1) {
			s1.add(p.category);
		}
		System.out.println(s1);
	}

	public void getProductType() {
		Set<String> s1 = new HashSet<>();
		for (Product p : l1) {
			if (p instanceof Shirt)
				s1.add("Shirt");
			else if (p instanceof Mobile)
				s1.add("Mobile");
			else if (p instanceof Laptop)
				s1.add("Laptop");
			else if (p instanceof Sweater)
				s1.add("Sweater");
			else if (p instanceof Chair )
				s1.add("Chair");

		}
		System.out.println(s1);
	}

	public void removeProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to remove on brand");
		System.out.println("Press 2 to remove on Category");
		Iterator<Product> itr = l1.iterator();
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("Enter the Brand: ");
			sc.nextLine();
			String brand = sc.nextLine();
			while (itr.hasNext()) {
				Product x = itr.next();
				if (x.brand.equalsIgnoreCase(brand))
					itr.remove();
			}

		} else if (choice == 2) {
			System.out.println("Enter the Category: ");
			sc.nextLine();
			String catg = sc.nextLine();
			while (itr.hasNext()) {
				Product x = itr.next();
				if (x.category.equalsIgnoreCase(catg))
					itr.remove();
			}
		}
		System.out.println("Product removed Successfully!!");
	}

}
