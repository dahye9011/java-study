package ch23;

// ### Exception 클래스 ###

// 자바에서 예외 처리를 위한 기본 클래스 중 하나
// 모든 에외의 부모 클래스로서 다양한 예외들이 Exception을 상속하고 있음, java.lang 패키지에 속해 있음

// ## 상속 관계 ##
// Exception 클래스는 Throwable 클래스를 상속하고 있음
// Throwable은 자바에서 예외 처리의 기본 클래스이며, Error와 Exception 클래스의 부모 클래스임

// ## Checked Exception과 Unchecked Exeption ##
// Exeption 클래스의 하위 클래스 중에서 RuntimeException(런타임 예외)을 제외한 예외들은 Checked Exception(컴파일 타임 예외)으로 분류됨
// Checked Exception(컴파일 타임 예외)은 반드시 예외 처리를 해주어야 하는 것이 특징임

public class C07Exception {
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.toString()); // null 예외
			int arr[] = new int[3];
			arr[4] = 10; // 배열 index 예외
			System.out.println(10/0); // 산술 오류
			Animal cat = new Cat();
			Dog dog = (Dog) cat; // 클래스 형변환 예외
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("실행코드1");
		System.out.println("실행코드2");
		System.out.println("실행코드3");
	}
}
