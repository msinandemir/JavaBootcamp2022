package getterAndSetterWithConstructor.service;

import getterAndSetterWithConstructor.entities.Product;

public class ProductManager {

	public void add(Product product) {
		System.out.println("�r�n eklendi, �r�n kodu: " + product.getKod());
	}
}
