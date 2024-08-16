package ch23;

// ### ClassCatsException ###
// 자바에서 형 변환(Casting)을 할 때, 실제 객체가 원하는 타입으로 변환될 수 없기 때문에 발생하는 예외
// 객체가 특정 클래스의 인스턴스가 아닌데도 그 클래스로 캐스팅을 시도할 때 발생

// lassCatsException을 피하는 방법은 주로 형변환 전에 적절한 검사(타입 확은)를 수행하거나, instanceof 연산자를 사용하여 변환이 안전한지 확인하는 것

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class C04ClassCastExceptionExample {
	public static void changeDog(Animal animal) {
//		if(animal instanceof Dog) {
			try {
				Dog dog = (Dog) animal;		// ClassCastException
			} catch (ClassCastException e) {
				System.out.println("캐스트 오류 발생");
				e.printStackTrace();
			} finally {
				System.out.println("Finally 구문");
			}
		}
//	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		System.out.println("----- Dog 객체 changeDog Exit -----");
		System.out.println();
		
		Cat cat = new Cat();
		changeDog(cat); // 잘못된 참조변수 전달
		System.out.println("----- Cat 객체 changeDog Exit -----");
		System.out.println("Main 함수로 복귀");
	}
}
