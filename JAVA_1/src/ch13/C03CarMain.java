package ch13;

public class C03CarMain {
	// 속성(멤버 변수) 선언
	String brand;
	String model;
	int year;
	double price;
	
	private String name;
	
	// 메서드 : 속성을 출력하는 메서드
	public void printCarInfo() {	// 객체 정보 확인하는 메서드
		System.out.println("Brand " + brand);
		System.out.println("Model " + model);
		System.out.println("Year " + year);
		System.out.println("Price $ " + price);
	}
	
	// ### 메서드의 구조 ###
	// 1. 메서드의 헤더
	// public		void		printCarInfo	(	)	==>		printCarInfo() 메서드는 매개변수가 없음
	// 접근 제어자		반환 자료형	메서드명			(매개변수)
	
	// 2. 메서드의 바디 (몸체)
	// {}
	
	// ### 접근 제어자 (Access Modifier) ###
	// 1. public					: 어떤 클래스에서든 접근이 가능
	// 2. protected					: 동일한 패키지 내의 클래스와 해당 클래스를 상속받은 외부 패키지의 클래스에서 접근 가능
	// 3. default (package-private)	: 동일한 패키지 내의 클래스에서만 접근 가능, 접근 제어자를 지정하지 않은 경우 기본으로 사용
	// 4. private					: 동일한 클래스 내에서만 접근 가능
	
	// public		: 모든 클래스에서 사용 가능
	// protected	: 동일 패키지에 속한 클래스 or 상속관계에서 하위 클래스에서만 접근 가능
	// private		: 현재 클래스에서만 접근 가능
	// default		: 동일 패키지에 속한 클래스에서만 사용 가능
	
	
	// ### Getter와 Setter ###
	// 객체 지향 프로그래밍에서 클래스의 속성(멤버 변수)에 접근하거나 값을 설정하기 위한 메서드
	
	// Getter() 메서드 (== 접근자 메서드) 지정
	// Getter는 클래스의 private 속성 값을 읽어오는 메서드
	// 일반적으로 속성 이름 앞에 "get"을 붙여서 메서드 이름을 지정
	// Getter 메서드는 주로 해당 속성의 값을 반환 (출력할 때)
	
	public String getName() {
		return name;
	}
	
	// Setter() 메서드 (== 설정자 메서드) 지정
	// Setter는 클래스의 private 속성 값을 설정하는 메서드
	// 일반적으로 속성 이름 앞에 "set"을 붙여서 메서드 이름을 지정
	// Setter 메서드는 주로 해당 속성에 값을 지정
	
	public void setName() {
		this.name = name;
	}
	
	
	// ### 'this' Keyword ###
	// 클래스 내에서 사용되는 예약어
	// 생성되는 객체의 위치정보를 가져오는 데 사용됨
	
	// 멤버변수 VS 매개변수 구별
	// this.name = name
	
	
	
	public static void main(String[] args) {
		// Car 클래스의 인스턴스 생성
		C03CarMain myCar = new C03CarMain();	// C03CarMain 클래스 객체 생성
		
		//		myCar.printCarInfo();	// 속성 초기화하지 않고 실행하면
										// 문자(String) = NULL로 초기화
										// 정수(int) 	   = 0으로 초기화
										// 실수(double) = 0.0으로 초기화
		
		// 속성 설정
		myCar.brand = "현대";
		myCar.model = "아반떼 cn7";
		myCar.year = 2022;
		myCar.price = 25000.50;
		myCar.name = "붕붕이";
		System.out.println(myCar.name);	// 같은 클래스 내 사용 가능
		
		myCar.printCarInfo();
	}

}
