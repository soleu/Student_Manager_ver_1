package �л������ǽ�;

public class DeleteStudent {
	Mapping map = Mapping.getMap();
	StudentManager sm = StudentManager.getsm();

	void deleteStu(String id) {
		int idx = map.findMap(id);
		sm.stuVec.remove(idx);
		map.deleteMap(id);
	}

}
