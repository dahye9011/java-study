package ch19;
// ### 멤버변수의 동작 방식 ###

// 클래스 영역에서의 저장 : static 변수, static 메서드
// static은 객체 생성 전에 클래스 영역에 저장
// 일반 메서드는 객체 1회 이상 생성 시 클래스 영역에 저장 (재사용성)

//++)
//메서드의 코드 				: 메서드 영역에 저장되어 해당 클래스의 메서드 호출 시 실행됨.
//메서드의 로컬 변수			: 스택 영역에 생성되고 사용됨.
//스택 영역					: 메서드호출 시 지역 변수, 메서드 호출 스택, 리턴 값 등이 저장됨, 각각의 스레드마다 별도의 스택이 생성
//메서드 코드					: 클래스의 구조와 함께 클래스 로더에 의해 한번 읽힌 후 메서드 영역에 저장되며, 모든 스레드가 공유

// 클래스 영역: static 변수와 메서드가 저장되고, 클래스 로드 시 할당되어 프로그램 종료 시까지 유지됨.
// 메서드 영역: 메서드 코드가 저장되고, 클래스 로드 시 할당되어 프로그램 종료 시까지 유지됨. 모든 스레드가 공유.
// 스택 영역: 메서드 호출 시마다 스택 프레임이 생성되고, 로컬 변수와 리턴 값 등이 저장됨. 메서드 종료 시 스택 프레임이 제거됨. 각 스레드마다 별도의 스택이 존재.
// 힙 영역: 객체와 배열이 동적으로 생성되어 저장됨. 모든 스레드가 공유.


class Super {
	int num1;
	
	public void sound() {
		System.out.println("Sound1()");
	}
}

class Sub extends Super {
	int num2;
	
	public void move() {
		System.out.println("Sub move1()");
	}
	
	public void sound() {
		System.out.println("Sub sound1()");
	}
}

public class C04MethodInfo {
	public static void main(String[] args) {
		// 정상범위 (Nocasting)
		Super ob1 = new Super();
		Super ob2 = new Super();
		Sub ob3 = new Sub();
		
		// Upcasting (상위클래스 참조변수 = 하위객체)
		Super ob4 = new Sub();
		ob4.sound();	// 부모 타입이지만 자식 객체의 오버라이드 된 메서드가 있다면 그 메서드를 찾아서 시행
	}
}
