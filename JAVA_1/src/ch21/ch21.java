package ch21;
// ### Interface ###

// 인터페이스 : 추상 메서드의 집합을 정의하는 데 사용됨
// 클래스가 특정 메서드를 반드시 구현하도록 강제하며, 다중 상속을 지원
// interface 키워드를 사용하여 정의되며, 메서드는 선언만 하고 몸체 X

// ## 인터페이스와 추상 클래스의 차이점 ##
// => 일반 메서드의 유무

// Interface : Java 8 이후 추상 메서드, 디폴트 메서드, 정적 메서드 가질 수 O
// 상수 필드(자동으로 public static final 적용됨) 가질 수 O

// Abstract Class : 일반 메서드와 추상 메서드 모두를 가질 수 O
// 필드, 생성자, 일반 메서드, 추상 메서드 등 가질 수 O

interface MyInterface {
	public static final int age = 12; // public static final 생략되어 있음
									  // static : 인터페이스 이름으로 호출 O
									  // final : 상수로 만드는 키워드 => 값을 변경할 수 X
	void myMethod();	// 추상 메서드
}

class Myclass implements MyInterface {
	public void myMethod() {
		// 추상 메서드 구현
	}
}

public class ch21 {

}
