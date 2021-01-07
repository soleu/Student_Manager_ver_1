package 학생관리실습;

public class Student {
	private int no;
	private String name;
	private String id;

	Student() {
	}

	Student(int no, String id, String name) {
		this.no = no;
		this.id = id;
		this.name = name;
	}

	int getNo() {
		return no;
	}

	void setNo(int no) {
		this.no = no;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getId() {
		return id;
	}

	void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		String str = "";
		str = no + " " + id + " " + name;
		return str;
	}

}
