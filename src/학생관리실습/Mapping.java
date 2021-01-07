package 학생관리실습;

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

	Map<String, Integer> m = new HashMap<String, Integer>();// id - idx 매핑
	StudentManager sm = StudentManager.getsm();

	void inputMap(Student stu) {
		int idx = sm.stuVec.size();
		m.put(stu.getId(), idx);// id, idx매핑
		sm.stuVec.add(stu);// Vector에 넣어주기
	}

	int findMap(String id) {// 아이디를 입력하면, idx 반환
		int idx = m.get(id);
		return idx;
	}

	void deleteMap(String id) {// 키 삭제
		int idx = m.get(id);
		m.remove(id);
		for (int i = idx; i < sm.stuVec.size(); i++) {
			m.put(id, i);// idx이동
		}
	}
}
