package getterAndSetterWithConstructor.service;

import getterAndSetterWithConstructor.entities.Product;

public class ProductManager {

	public void add(Product product) {
		System.out.println("ürün eklendi, ürün kodu: " + product.getKod());
	}
}
