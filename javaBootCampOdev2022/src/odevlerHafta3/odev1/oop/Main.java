package oop;

import oop.entities.Company;
import oop.entities.Customer;
import oop.entities.Person;
import oop.service.CustomerManager;
import oop.service.MilitaryCreditManager;

public class Main {

	public static void main(String[] args) {
		/*
		 * Customer customer = new Person(); CustomerManager customerManager = new
		 * CustomerManager(customer); Company company = new Company(); CustomerManager
		 * customerManager2 = new CustomerManager(new Company()); Customer customer2 =
		 * new Customer(); Customer customer3 = new Person(); Customer customer4 = new
		 * Company();
		 * 
		 * customer.setId(1); customer.setCity("Ýstanbul");
		 * 
		 * 
		 * customerManager.save(); customerManager.delete();
		 * 
		 * company.setId(100); company.setTaxNumber("10000");
		 * company.setCompanyName("arçelik");
		 * 
		 * customerManager2.save();
		 */
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.giveCredit();
	}

}
