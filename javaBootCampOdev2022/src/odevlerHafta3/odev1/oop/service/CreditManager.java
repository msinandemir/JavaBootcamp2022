package oop.service;

public class CreditManager implements ICreditManager {

	@Override
	public void calculate() {

		System.out.println("Kredi Hesaplandý");
	}

	@Override
	public void save() {
		System.out.println("Kredi Verildi");
	}
}
