package day12;

import java.util.Scanner;

public class MainClass01 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	MemberService01 ms = new MemberService01();

	
	int menu, ice, size=0, num;
	while(true) {
		System.out.println("1.커피메뉴 선택");
		System.out.println("2.커피 사이즈 선택");
		System.out.println("3.커피 온도 선택");
		System.out.println("4.주문 확인하기");
		System.out.print(">>>> : ");
		num = input.nextInt();
		switch( num ) {
		case 1:
			System.out.println("1.아메리카노|2.카페라떼|3.카페모카");
			menu = input.nextInt();
			ms.Menu(menu);
			break;
		case 2:
			System.out.println("1.L size|2.M size|3.S size");
			size = input.nextInt();
			ms.Size(size);
			break;
		case 3:
			System.out.println("1.Ice | 2.Hot");
			ice = input.nextInt();
			ms.Ice(ice);
			break;
		case 4:
			
			ms.menuCheck();
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
			
		}
		
		
		
		
		
		
	}
}
}
