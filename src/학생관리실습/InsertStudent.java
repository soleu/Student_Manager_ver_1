package 切积包府角嚼;

import java.util.Scanner;

class InsertStudent {
	Scanner scan = new Scanner(System.in);
	Mapping map = Mapping.getMap();
	StudentManager sm = StudentManager.getsm();

	InsertStudent(Student stu) {
		map.inputMap(stu);// mapping 历厘
	}

}