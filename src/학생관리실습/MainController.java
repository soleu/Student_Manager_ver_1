package 학생관리실습;

import java.util.Scanner;

public class MainController {

	Scanner scan = new Scanner(System.in);
	DeleteStudent DelS = new DeleteStudent();
	PrintStudent PrtS = new PrintStudent();

	void menu() {
		while (true) {
			System.out.println("1.추가 2.삭제 3.출력 4.전체출력");
			System.out.println("번호를 입력하세요.");
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
		System.out.println("[추가] 번호를 입력하세요. : ");
		int no = scan.nextInt();
		System.out.println("[추가] 아이디를 입력하세요 : ");
		String id = scan.next();
		// 아이디는 중복되면 수정됨.
		System.out.println("[추가] 이름을 입력하세요 : ");
		String name = scan.next();

		Student stu = new Student(no, id, name);// 생성자로 입력
		InsertStudent InsS = new InsertStudent(stu);
	}

	void deleteStu() {
		System.out.println("[삭제] 아이디를 입력하세요 : ");
		String id = scan.next();
		DelS.deleteStu(id);
	}

	void printStu() {
		System.out.println("[출력] 아이디를 입력하세요 : ");
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
