package by.htp.les.entity;

public class Customer {

	private String name;
	private String surname;
	private String city;
	private String street;
	private int house;
	private int creditCardNumber;
	private int bankAccountNumber;

	public Customer() {
		this.name = null;
		this.surname = null;
		this.city = null;
		this.street = null;
		this.house = 0;
		this.creditCardNumber = 0;
		this.bankAccountNumber = 0;
	}

	public Customer(String name, String surname, String city, String street, int house, int creditCardNumber,
			int bankAccountNumber) {
		this.name = name;
		this.surname = surname;
		this.city = city;
		this.street = street;
		this.house = house;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHouse() {
		return house;
	}

	public void setHouse(int house) {
		this.house = house;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bankAccountNumber;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + creditCardNumber;
		result = prime * result + house;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (bankAccountNumber != other.bankAccountNumber)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (creditCardNumber != other.creditCardNumber)
			return false;
		if (house != other.house)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", surname=" + surname + ", city=" + city + ", street=" + street + ", house="
				+ house + ", creditCardNumber=" + creditCardNumber + ", bankAccountNumber=" + bankAccountNumber + "]";
	}

}
