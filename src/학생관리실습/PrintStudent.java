package 학생관리실습;

public class PrintStudent {
	Mapping map = Mapping.getMap();
	StudentManager sm = StudentManager.getsm();
	Student stu = new Student();

	void PrintStu() {
		int count = sm.stuVec.size();
//		System.out.println(count);
		for (int i = 0; i < count; i++) {
			stu = sm.stuVec.get(i);
			System.out.println(stu);
		}

	}

	void PrintStu(String id) {
		int idx = map.findMap(id);
		stu = sm.stuVec.get(idx);
		System.out.println(stu);
	}

	@Override
	public String toString() {
		String str = "";
		str = "출력 = " + "[no] : " + stu.getNo() + " [ID] : " + stu.getId() + " [Name] : " + stu.getName();
		return str;
	}
}
