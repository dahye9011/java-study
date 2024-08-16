package ch19;
//### 업캐스팅과 다운캐스팅 ###

// 1. 업캐스팅 : 하위 클래스의 객체를 상위 클래스 타입으로 변환하는 것을 의미.
// class Animal { }
// class Dog extends Animal { }
// Animal myAnimal = new Dog(); // 업캐스팅

// 2. 다운캐스팅 :  상위 클래스 타입으로 캐스팅된 객체를 다시 원래의 하위 클래스 타입으로 변환하는 것을 의미 ==> 업캐스팅이 전제되어야 함.
// 명시적인 형 변환 연산자가 필요 ==> 강제 형변환 필요
// 이를 통해 객체를 다시 원래 타입으로 사용할 수 있음.

// ### 다운캐스팅은 주의점 ###
// 실제로 해당 객체가 원하는 하위 타입의 인스턴스인지를 확인하는 작업이 필요함.
// class Animal { }
// class Dog extends Animal { }

// Animal myAnimal = new Dog();
// Dog myDog = (Dog) myAnimal; // 다운캐스팅
//
// 다운캐스팅 전에 instanceof 연산자를 사용하여 객체의 타입을 확인하는 것이 안전 ==> boolean 타입으로 결과값을 반환
// if (myAnimal instanceof Dog) {
// Dog anotherDog = (Dog) myAnimal;				// myAnimal이 Dog 클래스의 인스턴스라면 다운캐스팅을 진행해라.
// }

// ### 객체와 인스턴스의 차이점 ###
// Dog mydog = new Dog();						// mydog는 Dog 클래스의 인스턴스이자, 실제 객체이기도 함.
											// mydog는 Animal 클래스의 인스턴스이지만, 실제 객체는 아닙니다.
// ==> Dog클래스는 Animal클래스로 부터 상속을 받았기 때문에 (파생되었기 때문에) Animal의 인스턴스가 될 수 있지만 객체는 꼭 아니다.


class A {
	void hello () {
		System.out.println("HELLO");
	}

}

class B extends A {
	void bye() {
		System.out.println("BYE");
	}
	
}

public class C05Upcasting {
	
	public static void main(String[] args) {
		
		A test = new B();			// 업캐스팅 (자식 객체 --> 부모 클래스)
		test.hello();				// 가능
//		test.bye()					// 불가능
		
		A test1 = new A();
		
		B down = null;
		if (test instanceof B) {
			down = (B) test;			// 다운캐스팅(부모 클래스 --> 자식 클래스)
		}
		down.hello();				// 가능
		down.bye();					// 가능
	}

}

