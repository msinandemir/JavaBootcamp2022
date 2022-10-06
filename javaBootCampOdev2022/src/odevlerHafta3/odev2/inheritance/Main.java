package inheritance;

import inheritance.entities.Customer;
import inheritance.entities.Employee;
import inheritance.service.CustomerManager;
import inheritance.service.EmployeeManager;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();

	}

}
