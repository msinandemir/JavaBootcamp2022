package getterAndSetterWithConstructor;

import getterAndSetterWithConstructor.entities.Product;
import getterAndSetterWithConstructor.service.ProductManager;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Asus Laptop", 10000.0, 3, "Siyah");
		ProductManager productManager = new ProductManager();
		

		
		productManager.add(product);

	}

}
