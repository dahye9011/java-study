package ch13;

class C10Person {
	String name;
	int age;
	String addr;
	
	public void setPerson(String name) {
		this.name = name;
	}
	
	public void setPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setPerson(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name + " 나이 : " + age + " 주소 : " + addr);
	}
	
	public void talk() {
		System.out.println(name + " 님이 말합니다.");
	}
	
	public void walk() {
		System.out.println(name + " 님이 걷습니다.");
	}
}

public class C10PracPerson {

	public static void main(String[] args) {
		C10Person obj = new C10Person();
		obj.setPerson("홍길동");	// 멤버변수 name에 홍길동 저장
		obj.showInfo();
		obj.talk();
		
		obj.setPerson("서길동", 10);
		obj.showInfo();
		obj.walk();
		
		obj.setPerson("남길동", 55, "서울");
		obj.showInfo();
	}
}
