package ch15;

class Controller {
	MemberInfo member;	// 참조변수 member
	
	void SetMember(MemberInfo member) {
		this.member = member;
	}
	
	MemberInfo getMember() {	// 반환 타입이 객체 타입 (MemberInfo)인 메서드 (이 메서드가 MemberInfo 타입의 객체를 반환)
		return member;			// ㄴ 메서드가 member 를 return 하는데 member 가 MemberInfo 타입이라서 
	}
}

class MemberInfo {
	String name;
	int age;
	String addr;
	
	public MemberInfo(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "MemberInfo [name= " + name + ", age= " + age + ", addr= " + addr + "]";
	}
}

public class C01ClassMethod {
	public static void main(String[] args) {
		MemberInfo obj = new MemberInfo("홍길동", 55, "대구");
		Controller controller = new Controller();
		controller.SetMember(obj);
		MemberInfo tmp = controller.getMember();
		System.out.println(tmp.toString());
	}
}
