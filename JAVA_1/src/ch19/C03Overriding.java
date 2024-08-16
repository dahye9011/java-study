package ch19;

// 오버라이딩 (== 함수 재정의) : 상속 관계에서 부모 클래스의 메서드를 자식 클래스에서 재정의하는 것 (== 덮어쓰기!)

// 메서드의 헤더 부분은 동일하나 바디{} 부분의 로직이 다를 수 있음
// 메서드 이름, 매개변수 타입, 반환 타입이 같은 메서드 헤더를 가지고 몸체에 다른 코드 삽입 O
// 접근 제어자는 같거나 더 넓은 범위를 가져야 함

class Animal {
	public void sound() {
		System.out.println("소리를 냅니다.");
	}
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("멍멍 소리를 냅니다.");
	}
	
	public void sound1() {
		System.out.println("왈왈 소리를 냅니다.");
	}
}

class Cat extends Animal {
	public void sound() {
		System.out.println("야옹 소리를 냅니다.");
	}
}

public class C03Overriding {
	public static void main(String[] args) {
		Animal test = new Animal();
		test.sound();
		System.out.println();
		
		Dog mydog = new Dog();
		mydog.sound();
		mydog.sound1();
		System.out.println();
		
		Cat mycat = new Cat();
		mycat.sound();
	}
}
