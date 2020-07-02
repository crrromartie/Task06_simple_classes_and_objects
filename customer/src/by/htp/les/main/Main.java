package by.htp.les.main;

import java.util.List;

import by.htp.les.entity.Customer;
import by.htp.les.entity.CustomerBase;
import by.htp.les.logic.CustomerLogic;
import by.htp.les.view.CustomerView;

public class Main {

	public static void main(String[] args) {

		CustomerBase cb = new CustomerBase();
		CustomerView cv = new CustomerView();
		CustomerLogic cl = new CustomerLogic();

		cb.addCustomer(new Customer("Pavel", "Bure", "Minsk", "Pushkina", 17, 7845, 125478));
		cb.addCustomer(new Customer("Ivan", "Glybovskiy", "Gomel", "Barykina", 220, 7717, 125211));
		cb.addCustomer(new Customer("Akaki", "Akakov", "Brest", "Glebki", 12, 7778, 125237));
		cb.addCustomer(new Customer("Vasili", "Pupkin", "Grodno", "Sunshine", 45, 7790, 125258));
		cb.addCustomer(new Customer("Igor", "Sivadzed", "Rechitsa", "Sportstreet", 4, 7833, 125264));
		cb.addCustomer(new Customer("Kate", "Ivanova", "Svetlogorsk", "Sovetskaya", 96, 7858, 125480));

		List<Customer> sortedCustomers;
		sortedCustomers = cl.sort(cb.getCustomers());
		cv.printAllCustomerInfo("A-z names", sortedCustomers);

		System.out.println();
		List<Customer> numberCardIntervalCustomers;
		numberCardIntervalCustomers = cl.numberCardInterval(7725, 7846, cb.getCustomers());
		cv.printAllCustomerInfo("Card number interval", numberCardIntervalCustomers);

	}

}
