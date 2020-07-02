package by.htp.les10.Task3;

public class StudentView {

	public void viewInfo(Student[] students) {
		for (Student st : students) {
			viewGroupLastName(st);
		}
	}

	public void viewGroupLastName(Student student) {
		System.out.println(student.getLastName() + " " + "[" + student.getGroupNamber() + "]");
	}

}
