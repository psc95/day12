package day12;

public class MemberService {
	private MemberDTO dto = new MemberDTO();
	public void register( int age, String name ) {
		dto.setAge( age );
		dto.setName( name );
	}
	public int getAge() {
		return dto.getAge() - 1;
	}
	public MemberDTO getMember() {
		return dto;
	}
}
