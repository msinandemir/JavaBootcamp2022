package oop.service;

import oop.entities.Customer;

public class CustomerManager {
	private Customer customer;
	private ICreditManager creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		this.customer = customer;
		this.creditManager = creditManager;
	}

	public void save() {
		System.out.println("Müþteri kaydedildi: " + customer.getId());
	}
	
	public void delete() {
		System.out.println("Müþteri silindi: " + customer.getId());
	}
	
	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Kredi verildi");
	}
}
