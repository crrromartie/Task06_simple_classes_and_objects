package by.htp.les.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.les.entity.Customer;

public class CustomerLogic {

	public List<Customer> sort(List<Customer> customers) {
		List<Customer> sortedCustomers = new ArrayList<Customer>();
		sortedCustomers.addAll(customers);
		for (int i = 0; i < sortedCustomers.size() - 1; i++) {
			for (int j = 0; j < sortedCustomers.size() - 1 - i; j++) {
				Customer customer1 = sortedCustomers.get(j);
				Customer customer2 = sortedCustomers.get(j + 1);
				if (customer1.getName().compareTo(customer2.getName()) > 0) {
					sortedCustomers.set(j, customer2);
					sortedCustomers.set(j + 1, customer1);
				}
			}
		}
		return sortedCustomers;
	}

	public List<Customer> numberCardInterval(int min, int max, List<Customer> customers) {
		List<Customer> sortedCustomers = new ArrayList<Customer>();
		sortedCustomers = sort(customers);
		List<Customer> numberCardIntervalCustomers = new ArrayList<Customer>();
		for (int i = 0; i < sortedCustomers.size(); i++) {
			if (sortedCustomers.get(i).getCreditCardNumber() >= min
					&& sortedCustomers.get(i).getCreditCardNumber() <= max) {
				numberCardIntervalCustomers.add(sortedCustomers.get(i));
			}
		}
		return numberCardIntervalCustomers;
	}
}
