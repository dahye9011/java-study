package ch19;

// super : 부모 클래스를 뜻함
// super() : 부모 클래스의 기본 생성자를 뜻함
// super(매개변수) : 부모 클래스의 매개변수 생성자를 뜻함

// 부모 클래스의 생성자를 호출하는 이유 : 부모 클래스의 초기화 코드를 실행시켜야 하기 때문
//								  자식 클래스가 생성될 때 상위 수준의 기능, 속성을 정의하는 부모 클래스의 초기화 작업이 먼저 이루어져야 함	

class Parent {
	int x;
	int y;
	
	public Parent() {
		System.out.println("Parent 생성자 호출\n");
	}
	
	public Parent(int x) {
		System.out.printf("Parent(x = %d) 생성자 호출\n", x);
	}
	
	public Parent(int x, int y) {
		System.out.printf("Parent(x = %d y = %d) 생성자 호출\n", x, y);
		this.x = x;
		this.y = y;
	}
}

class Son extends Parent {
	int z;
	
	public Son() {
		System.out.println("Son() 생성자 호출\n");
	}
	
	public Son(int x) {
		super(x);
		System.out.printf("Son(x = %d) 생성자 호출\n", x);
	}
	
	public Son(int x, int y) {
		super(x, y);
		System.out.printf("Son(x = %d y = %d) 생성자 호출\n", x, y);	}
	
	public Son(int x, int y, int z) {
		super(x, y);
		this.z = z;
		System.out.printf("Son(x = %d y = %d z = %d) 생성자 호출\n", x, y, z);	}
}

public class C02InteritanceMain {
	public static void main(String[] args) {
		Son ob = new Son();
		System.out.println();
		
		Son ob2 = new Son(10);
		System.out.println();
		
		Son ob3 = new Son(10, 20);
		System.out.println();
		
		Son ob4 = new Son(10, 20, 30);
		System.out.println();
	}
}
