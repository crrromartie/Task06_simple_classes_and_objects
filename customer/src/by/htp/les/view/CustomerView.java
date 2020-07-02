package by.htp.les.view;

import java.util.List;

import by.htp.les.entity.Customer;

public class CustomerView {

	public void printAllCustomerInfo(String message, List<Customer> customers) {
		System.out.println(message);
		for (Customer customer : customers) {
			printOneCustomerInfo(customer);
		}
	}

	public void printOneCustomerInfo(Customer customer) {
		System.out.println(
				"Name:" + customer.getName() + "/Surname:" + customer.getSurname() + "/City:" + customer.getCity()
						+ "/Street:" + customer.getStreet() + "/House:" + customer.getHouse() + "/Credit card number:"
						+ customer.getCreditCardNumber() + "/Bank account number:" + customer.getBankAccountNumber());
	}

}
