package ch18;
// ### 자바의 메모리 구조 ###

// 1. 스택영역 : {} 내의 지역변수, 메서드 호출 및 리턴값, 연산 중 발생하는 임시 데이터 등이 저장
// {} 내에서 생성, 벗어나면 소멸
// 메서드 호출 시마다 프레임(Frame)이라는 작은 메모리 블록이 생성되어 메서드의 지역 변수와 연상 중 발생한 중간 결과 등을 저장함
// 메서드가 종료되면 해당 프레임이 스택에서 제거됨

// 후입선출 (LIFO, Last In, First Out) 구조 (프링글스 과자 생각하면 편함)

// 2. 힙영역 : 객체 저장 공간
// new 예약어 사용 시 생성
// 동적으로 생성된 객체와 배열이 저장되는 공간
// 모든 스레드가 공유하는 메모리 영역, 객체의 생성 및 소멸은 여기서 이루어짐
// 소멸은 JVM의 가비지 컬렉터(Garbage Collector)에 의해서 소멸 (더이상 참조되지 않는 객체들을 정리)

// 3. 클래스영역 (== 메서드영역, 정적 영역, Static 영역) : 공유메모리, static 변수, 일반 메서드, 생성자 메서드, 클래스 정보, 정수
// 클래스 정보(클래스의 구조, 필드, 메서드 코드 등)가 저장되는 영역
// 프로그램 시작과 동시에 생성, 프로그램 종료 시 소멸

class C01Simple {
	static int Num1 = 0;	// 공유변수 (static)
	int Num2;				// non-static
	
	void showNum() {
		System.out.printf("Num1 : %d Num2 : %d\n", Num1, Num2);
	}
}

class C02Simple {
	int n1;
	static int n2;
	
	static void func1() {	// static 메서드 -> 겍체를 만들지 않고도 사용할 수 있는 메서드
							// 비정적 변수(객체) : 불가능
							// ㄴ func1()은 객체 없이도 사용할 수 있는 메서드인데, n1과 같이 객체가 있어야 접근할 수 있는 변수는 사용 불가
//		n1 = 10;	
		n2 = 20;
		System.out.printf("n2 : %d", n2);
	}
}

public class C01Sttiac {
	public static void main(String[] args) {
		// static이 붙은 변수(정적 멤버)는 클래스 자체에 속함
		// ===> 클래스명.변수 이름 으로 변수를 호출할 수 있음 !!!
		// ===> static 변수는 클래스가 공유하고 있는 변수
		
		// 비정적 멤버는 객체(인스턴스)에 속함
		// ===> 객체마다 그 값이 다를 수 있음
		
		C01Simple obj1 = new C01Simple();
		C01Simple obj2 = new C01Simple();
		
//		obj1 = obj2;
//		System.out.println(System.identityHashCode(obj1));
//		System.out.println(System.identityHashCode(obj2));
		
		obj1.Num1 = 10;
		obj1.Num2 = 20;
		obj1.showNum(); // 10, 20
		
		obj2.showNum();	// 10, 0
		System.out.println();
		
		C01Simple.Num1 = 255;
		
		obj1.showNum(); // 255, 20
		obj2.showNum(); // 255, 0
		
		C02Simple.n2 = 22;
//		C02Simple.func1();
	}
}
