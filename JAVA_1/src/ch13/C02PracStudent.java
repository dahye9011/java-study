package ch13;

class C02Student {
	String name;
	int age;
	String address;
	double height;
}

public class C02PracStudent {
	
	String name;
	int age;
	String address;
	
	void gotoSchool() {
		System.out.println(name + "이/가 학교에 갑니다.");
	}

	public static void main(String[] args) {
		
		C02PracStudent student1 = new C02PracStudent();
		student1.name = "학생1";
		student1.age = 17;
		student1.address = "대구";
		student1.gotoSchool();	// 학생1이 학교에 갑니다.
		
		C02Student student2 = new C02Student();
		student2.name = "학생2";
		student2.age = 13;
		student2.address = "서울";
		student2.height = 170.2;
	}
	
}
