package oop.entities;

public class Customer {
	public Customer() {
		System.out.println("M��teri nesnesi ba�lat�ld�");
	}

	private int id;

	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
