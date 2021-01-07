package �л������ǽ�;

import java.util.HashMap;
import java.util.Map;

public class Mapping {
	// Singleton
	private Mapping() {
	};

	static private Mapping map = new Mapping();

	static public Mapping getMap() {
		return map;
	}

	Map<String, Integer> m = new HashMap<String, Integer>();// id - idx ����
	StudentManager sm = StudentManager.getsm();

	void inputMap(Student stu) {
		int idx = sm.stuVec.size();
		m.put(stu.getId(), idx);// id, idx����
		sm.stuVec.add(stu);// Vector�� �־��ֱ�
	}

	int findMap(String id) {// ���̵� �Է��ϸ�, idx ��ȯ
		int idx = m.get(id);
		return idx;
	}

	void deleteMap(String id) {// Ű ����
		int idx = m.get(id);
		m.remove(id);
		for (int i = idx; i < sm.stuVec.size(); i++) {
			m.put(id, i);// idx�̵�
		}
	}
}
