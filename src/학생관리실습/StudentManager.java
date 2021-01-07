package �л������ǽ�;

import java.util.Vector;

public class StudentManager {
	// Singleton
	private StudentManager() {
		System.out.println("���� ȸ�� �� : " + stuVec.size() + "��");
	};

	static private StudentManager sm = new StudentManager();

	static public StudentManager getsm() {
		return sm;
	}

	Vector<Student> stuVec = new Vector<>();

	void insSM(Student stu) {
		int no = stu.getNo();
		String id = stu.getId();
		String name = stu.getName();
		stuVec.add(new Student(no, id, name));
//		System.out.println(stuVec.size());
	}

}
