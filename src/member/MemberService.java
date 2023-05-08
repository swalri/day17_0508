package member;

public class MemberService {
	// 생성
	private FileService fs;

	public MemberService() {
		fs = new FileService();
	}

	// 저장
	public void save(MemberDTO dto) {
		fs.inputData(dto);
	}

	// 중복확인
	public boolean checkUser(String name) {
		return fs.checkUser(name);
	}

	// 검색
	public MemberDTO getMember(String name) {
		return fs.readData();
	}
}
