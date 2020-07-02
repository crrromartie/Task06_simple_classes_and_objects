package by.htp.les10.Task3;

import java.util.Arrays;

public class Student {

	private String firstName;
	private String lastName;
	private int groupNamber;
	private int[] marks;

	public Student(String firstName, String lastName, int groupNamber, int[] marks) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.groupNamber = groupNamber;
		this.marks = marks;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getGroupNamber() {
		return groupNamber;
	}

	public void setGroupNamber(int groupNamber) {
		this.groupNamber = groupNamber;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + groupNamber;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + Arrays.hashCode(marks);
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
		Student other = (Student) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (groupNamber != other.groupNamber)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (!Arrays.equals(marks, other.marks))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", groupNamber=" + groupNamber
				+ ", marks=" + Arrays.toString(marks) + "]";
	}

}
