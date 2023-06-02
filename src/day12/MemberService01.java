package day12;

public class MemberService01 {
	private MemberDTO01 dto = new MemberDTO01();
	public void register(int menu, int size, int ice) {
		dto.setMenu( menu );
		dto.setSize( size );
		dto.setIce( ice );
	}
	public void Menu(int menu) {
		dto.setMenu(menu);
	}
	public void Size(int size) {
		dto.setSize(size);
	}
	public void Ice(int ice) {
		dto.setIce(ice);
	}
	public void menuCheck() {
		if(dto.getMenu()==1)
			System.out.println("커피 메뉴: 아메리카노");
		else if (dto.getMenu()==2)
			System.out.println("커피 메뉴: 카페라떼");
		else
			System.out.println("커피 메뉴: 카페모카");
		
		if(dto.getSize()==1)
			System.out.println("커피 사이즈: Large");
		else if(dto.getSize()==2)
			System.out.println("커피 사이즈: Medium");
		else
			System.out.println("커피 사이즈: Small");
		
		if(dto.getIce()==1)
			System.out.println("커피 온도: Ice");
		else
			System.out.println("커피 온도: Hot");
	}
	
}
