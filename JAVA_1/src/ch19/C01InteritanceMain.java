package ch19;

// ## 상속의 특징 ##
// 1. 재사용성(Reuse) : 부모 클래스에서 정의된 멤버 변수와 메서드를 자식 클래스에서 그대로 사용할 수 있음
//					  => 코드 중복을 줄이고 유지보수성 향상
// 2. 확장성(Extension) : 자식 클래스에서 부모 클래스의 기능을 확장하거나 수정할 수 있음
//						새로운 멤버 변수를 추가하거나, 부모 클래스의 메서드를 오버라이딩하여 재정의 가능
// 3. 다형성(Polymorphism) : 상속 관계에서 부모 클래스 타입의 참조 변수로 자식 클래스의 객체를 참조할 수 있음
//							=> 하나의 변수로 여러 타입의 객체를 다룰 수 있음

// ## 주의사항 ##
// 1. 단일 상속 : 자바에서는 단일 상속만을 지원함
//				=> 하나의 클래스는 하나의 부모 클래스만을 가질 수 있음 -> 이로 인해 클래스 간의 강한 결합을 피하고 복잡성 감소
// 2. 접근 제어자 : 상속 관계에서 부모 클래스의 멤버 변수 및 메서드의 접근 제어자에 따라 자식 클래스에서의 접근 여부가 결정됨
//				 private으로 선언된 멤버는 상속이 되지만, 직접 접근할 수 X
// 3. 생성자 호출 : 자식 클래스의 생성자가 호출될 때 부모 클래스의 기본 생성자가 자동으로 호출됨
//				 만약 부모 클래스에 매개변수가 있는 생성자가 정의되어 있다면, 자식 클래스에서 명시적으로 super()를 사용하여 호출해야 함

class Point2D {
	int x;
	int y;
	
	void showPoint() {
		System.out.println("x = " + x + " y = " + y);
	}
}

class Point3D extends Point2D {
	int z;
	
	void showPoint3D() {
		System.out.println("x = " + x + " y = " + y + " z = " + z);
	}
}


public class C01InteritanceMain {
	public static void main(String[] args) {
		Point3D ob1 = new Point3D();
		ob1.x = 10;
		ob1.y = 20;
		ob1.showPoint();
		
		ob1.z = 30;
		ob1.showPoint3D();
	}
}
