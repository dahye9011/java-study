package ch20;
// ---------------------------- 일반 클래스 상속 관계 
class Super01 {
	void func01() {
	}
}

class Sub01 extends Super01 {
	void func01() {
		System.out.println("내 마음대로 재정의하고 출력하는 코드");
	}
}

// ---------------------------- 추상 클래스 상속 관계 
abstract class Super02 {
	abstract void func02();
}

class Sub02 extends Super02 {
	@Override
	void func02() {
		System.out.println("강제로 재정의하고 출력하는 코드");
	}
}

public class C01AbstractMain {
	public static void main(String[] args) {
		Super01 obj1 = new Sub01();	// 업캐스팅 -> 부모 클래스 객체 =  new 자식 클래스()
		obj1.func01();
		System.out.println();
		
//		Super02 obj2 = new Super02(); 		추상 클래스의 객체화(인스턴스화) ERROR
		Super02 obj3 = new Sub02();	// 업캐스팅 -> (추상)부모 클래스 객체 = new 자식 클래스()
		obj3.func02();				// 오버라이딩 된 func02() 사용
		
	}
}
