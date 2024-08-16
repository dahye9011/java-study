package ch21;

// 일반 클래스 간의 다중 상속 X
// 일반 클래스가 인터페이스 다중 상속 O 
// 인터페이스 간 다중 상속 O
// interface A {}
// interface B {}
// interface C extends A, B {} // 가능 (다중 상속을 하면 가독성 떨어져서 좋지는 X)


interface Flyable {
	void fly();
}

interface Swimmable {
	void swim();
}

// 다중 상속을 받는 클래스
class Bird implements Flyable, Swimmable {
	@Override
	public void fly() {
		System.out.println("새가 날아갑니다.");
	}
	
	@Override
	public void swim() {
		System.out.println("새가 수영합니다.");
	}
}

public class C02MultipleInheritance {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.fly();
		bird.swim();
		
		Flyable a = new Bird();
		a.fly();
//		a.swim();	// 불가능
	}
}
