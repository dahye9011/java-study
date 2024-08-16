package ch20;

// ### 추상 클래스와 추상 메서드 ###

// 추상 클래스 : 하나 이상의 추상 메서드를 포함하는 클래스
//		     : 객체를 직접 생성할 수 없음, abstract 키워드 사용

// 추상 메서드 : 추상 메서드는 선언만 있고 구현이 없는 메서드
//			 : 하위 클래스에서 반드시 구현되어야 함, abstract 키워드 사용

// => 추상 클래스는 객체를 직접 생성할 수 없기 때문에 하위 클래스를 통해 인스턴스를 생성하고 사용

// ## 추상 클래스가 왜 필요할까? ##
// 추상 클래스는 클래스 간의 계층 구조에서 공통된 특성을 갖는 클래스를 정의

abstract class Shape {
	// 추상 메서드 선언
	abstract void draw();
	
	// 일반 메서드 선언
	void resize() {
		System.out.println("Resizing the shape");
	}
}

class Circle extends Shape {
	// 추상 메서드 구현
	@Override
	void draw() {
		System.out.println("Drawing a circle");
	}
}

class Square extends Shape {
	// 추상 메서드 구현
	@Override
	void draw() {
		System.out.println("Drawing a square");
	}
}

public class ch20 {
	public static void main(String[] args) {
		Circle circle = new Circle();
		Square square = new Square();
		
		circle.draw();
		circle.resize();	// 추상 클래스가 가지고 있는 일반 메서드도 사용O
		square.draw();
	}
}