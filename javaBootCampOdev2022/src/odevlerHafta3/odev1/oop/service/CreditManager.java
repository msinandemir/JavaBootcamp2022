package oop.service;

public class CreditManager implements ICreditManager {

	@Override
	public void calculate() {

		System.out.println("Kredi Hesapland�");
	}

	@Override
	public void save() {
		System.out.println("Kredi Verildi");
	}
}
