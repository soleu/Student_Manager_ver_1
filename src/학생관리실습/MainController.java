package �л������ǽ�;

import java.util.Scanner;

public class MainController {

	Scanner scan = new Scanner(System.in);
	DeleteStudent DelS = new DeleteStudent();
	PrintStudent PrtS = new PrintStudent();

	void menu() {
		while (true) {
			System.out.println("1.�߰� 2.���� 3.��� 4.��ü���");
			System.out.println("��ȣ�� �Է��ϼ���.");
			int choice = scan.nextInt();
			if (choice == 1) {
				insertStu();
			} else if (choice == 2) {
				deleteStu();
			} else if (choice == 3) {
				printStu();
			} else if (choice == 4) {
				printAllStu();
			}
		}
	}

	void insertStu() {
		System.out.println("[�߰�] ��ȣ�� �Է��ϼ���. : ");
		int no = scan.nextInt();
		System.out.println("[�߰�] ���̵� �Է��ϼ��� : ");
		String id = scan.next();
		// ���̵�� �ߺ��Ǹ� ������.
		System.out.println("[�߰�] �̸��� �Է��ϼ��� : ");
		String name = scan.next();

		Student stu = new Student(no, id, name);// �����ڷ� �Է�
		InsertStudent InsS = new InsertStudent(stu);
	}

	void deleteStu() {
		System.out.println("[����] ���̵� �Է��ϼ��� : ");
		String id = scan.next();
		DelS.deleteStu(id);
	}

	void printStu() {
		System.out.println("[���] ���̵� �Է��ϼ��� : ");
		String id = scan.next();
		PrtS.PrintStu(id);
	}

	void printAllStu() {
		PrtS.PrintStu();
	}

	public void run() {
		menu();
	}
}
