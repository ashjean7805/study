package staticex;

public class StudentTest2 {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setSetudentName("이지원");
//		System.out.println(studentLee.serialNum);
		System.out.println(Student.serialNum);
		System.out.println(studentLee.studentName + " 학번: " + studentLee.studentID);

		
		Student studentSon = new Student();
		studentSon.setSetudentName("손수경");
//		System.out.println(studentSon.serialNum);
		System.out.println(Student.serialNum);

		System.out.println(studentSon.studentName + " 학번: " + studentSon.studentID);
	}

}
