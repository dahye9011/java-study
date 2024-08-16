package ch19;
class Animal01 {
	void makeSound() {
		System.out.println("동물이 소리를 낸다.");
	}
}

class Dog01 extends Animal01 {
	@Override
	void makeSound() {
		System.out.println("개가 짖는다.");
	}
	
	void bark() {
		System.out.println("왈왈!");
	}
}

public class C03Overriding2 {
	public static void main(String[] args) {
		Animal01 animal = new Dog01();	// 다형성을 통한 객체 생성
		animal.makeSound();		// 오버라이딩 된 Dog 클래스의 makeSound() 호출
//		animal.bark();			// bark()는 자식 객체의 확장 요소이므로 사용 불가 (범위초과부분)

		// animal은 부모 클래스 타입의 자료형을 가지고 있지만 자식 객체를 참조함
		// 오버라이딩 된 메서드가 자식 객체에 있다면 부모 클래스 타입을 자료형으로 가지는 참조변수는 오버라이딩 된 메서드 사용
		
		Dog01 dog = new Dog01();
		dog.makeSound();
		dog.bark();
	}
}
