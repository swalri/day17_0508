package member;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, age = 10;
		String name = null;
		MemberDTO dto = null;
		MemberService ms = new MemberService();

		while (true) {
			System.out.println("1. 저장");
			System.out.println("2. 검색");
			System.out.println("3. 종료");
			System.out.print(">>> ");
			num = scan.nextInt();
			switch (num) {
			case 1:// 저장
				System.out.print("이름 : ");
				name = scan.next();
				// 파일이 존재하면 true, 아니면 false
				if (ms.checkUser(name)) {
					System.out.println("존재하는 파일입니다");
					break;
				}
				System.out.print("나이 : ");
				age = scan.nextInt();
				dto = new MemberDTO();
				dto.setName(name);
				dto.setAge(age);
				ms.save(dto);
				break;
			case 2://검색
				System.out.print("이름 : ");
				name = scan.next();
				// 파일이 존재하면 true, 아니면 false
				if (ms.checkUser(name) == false) {
					System.out.println("존재하지 않는 파일입니다");
					break;
				}
				dto = ms.getMember(name);
				System.out.println("이름 : " + dto.getName());
				System.out.println("나이 : " + dto.getAge());

				break;
			case 3:
				System.out.println("종료");
				System.exit(0);
				break;
			default:
				break;
			}// switch
		} // while
	}
}
