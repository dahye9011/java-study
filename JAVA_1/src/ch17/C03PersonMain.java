package ch17;

class C02Person {
	String name;
	String age;
	String addr;
}

public class C03PersonMain {
	public static void main(String[] args) {
		// 클래스 배열을 자료형으로 가지는 employee 변수 생성
		// => C02Person 객체를 세 개 저장할 수 있는 배열을 생성
		C02Person employee[] = new C02Person[3];
		// 배열의 요소로 객체 사용 가능
		employee[0] = new C02Person();
		employee[0].name = "홍길동";
		employee[0].age = "35";
		employee[0].addr = "대구";
		
		employee[1] = new C02Person();
		employee[1].name = "남길동";
		employee[1].age = "24";
		employee[1].addr = "서울";
		
		employee[2] = new C02Person();
		employee[2].name = "서길동";
		employee[2].age = "12";
		employee[2].addr = "울산";
		
		for(int i = 0; i < employee.length; i++) {
			System.out.println("이름 : " + employee[i].name);
			System.out.println("나이 : " + employee[i].age);
			System.out.println("주소 : " + employee[i].addr);
		}
	}
}
