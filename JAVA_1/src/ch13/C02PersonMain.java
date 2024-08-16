package ch13;

class C02Person { // 같은 파일 안에서 다른 클래스 정의 가능
	String name;
	int age;
	String addr;
}

public class C02PersonMain { // public class는 파일 이름과 동일 (파일 주인)
	public static void main(String[] args) {
		C02Person hong = new C02Person();
		
		hong.name = "홍길동";
		hong.age = 55;
		hong.addr = "대구대구대구";
		
		System.out.printf("%s %d %s \n", hong.name, hong.age, hong.addr);
	}

}
