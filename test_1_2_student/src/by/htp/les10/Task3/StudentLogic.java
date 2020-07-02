package by.htp.les10.Task3;

public class StudentLogic {

	public boolean isBotan(Student student) {
		int[] marks = student.getMarks();
		for (int mark : marks) {
			if (mark < 8) {
				return false;
			}
		}
		return true;
	}

	public int countBotan(Student[] students) {
		int counter = 0;
		for (Student st : students) {
			if (isBotan(st)) {
				counter++;
			}
		}
		return counter;
	}

	public Student[] botan(Student[] students) {
		int size = countBotan(students);
		Student[] botan = new Student[size];
		int i = 0;
		for (Student st : students) {
			if (isBotan(st)) {
				botan[i] = st;
				i++;
			}
		}
		return botan;
	}
}
