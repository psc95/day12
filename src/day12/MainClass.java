package day12;

import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	MemberService ms = new MemberService();
	String name;
	int age;
	int num;
	while(true) {
		System.out.println("1.등록");
		System.out.println("2.회원 보기");
		System.out.println("3.나이 확인");
		System.out.print(">>> : ");
		num = input.nextInt();
		switch( num ) {
		case 1:
			System.out.println("이름 입력");
			name = input.next();
			System.out.println("나이 입력");
			age = input.nextInt();
			ms.register(age, name);
			System.out.println("등록 성공");
			break;
		case 2:
			MemberDTO dto = ms.getMember();
			System.out.println("이름 : "+dto.getName());
			System.out.println("나이 : "+dto.getAge());
			break;
		case 3:
			System.out.println("만 나이 : "+ms.getAge());
			break;
		}
	}
}
}
