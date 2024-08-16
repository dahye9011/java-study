package ch23;

// ### throw keyword ###
// 자바에서 예외를 명시적으로 발생시키기 위한 키워드
// throw 키워드를 사용하여 특정 예외를 강제로 발생시킬 수 있음

// ## 기본 구문 ##
// throw 예외객체;
// '예외객체'는 특정 예외 클래스의 인스턴스임

// 예외 처리 방식
// 1. 예외의 직접적인 던지기 (direct throwing) : 메소드 내에서 예외 조건을 발견했을 때, 해당 예외를 직접 던지는 방식
// 2. 메소드에게 예외를 떠넘기기 (rethrowing) 	  : 메소드에서 예외를 처리하지 않고, 해당 예외를 다시 호출한 메소드로 떠넘기는 방식
//											<- 주로 예외를 발생한 메소드가 예외를 해결할 수 없는 경우에 사용

// 1. 직접 던지기 Example

//public void exampleMethod(String input) throws CustomException {
//	if (input == null) {
//		throw new CustomException("Input cannot be null");
//	}
//	// 메소드 로직
//}
//
//public class ThrowExample {
//	public static void main(String[] args) {
//		try {
//			int value = -5;
//			if(value < 0) {
//				// 여기서 throw문을 사용하여 IllegalArgumentException을 명시적으로 던짐
//				throw new IllegalArgumentException("음수는 허용되지 않습니다.");
//			}
//			System.out.println("값: " + value);
//		} catch (IllegalArgumentException e) {
//			System.out.println("예외 발생: " + e.getMessage());
//		}
//	}
//}

// 2. 메소드에게 예외를 떠넘기기

//public class Example {
//	public static void main(String[] args) {
//		try {
//			someMethod();
//		} catch (CustomException e) {
//			System.out.println("Caught exception in main: " + e.getMessage());
//		}
//	}
//	
//	public static void someMethod() throws CustomException {
//		try {
//			// 예외가 발생할 수 있는 코드
//			int result = 10 / 0; // ArithmeticException 발생
//		} catch (ArthmeticException e) {
//			// ArithmeticException에 해당하는 예외가 발생했을 때 실행되는 코드
//			System.out.println("Exception caught in someMethod: " + e.getMessage());
//			// 예외를 다시 던짐 (CustomException으로 변환하여)
//			throw new CustomException("Custom exception", e);
//		}
//	}
//}

//class CustomException extends Exception {
//	public CustomException(String message, Throwable cause) {
//		super(message, cause);
//	}
//}

// 예외를 떠넘기는 메소드가 throws를 사용하여 예외를 선언했다고 해도, 해당 메소드를 호출한 곳에서 반드시 예외를 처리할 필요는 없음
// 메소드를 호출한 곳에서 예외를 처리하지 않으면, 예외는 호출 스택을 따라 더 상위의 메소드로 전파됨
// 최종적으로는 예외가 처리되지 않은 채로 프로그램이 종료될 수 있음

// +) 예외를 상위로 떠넘김 == 예외가 발생한 메소드에서 예외를 처리하지 않고, 호출한 상위 메소드로 예외를 전파시키는 것
// 호출 스택(call stack)을 따라서 예외가 전파되어 나가게 됨

//public class Example {
//	public static void main(String[] args) {
//		try {
//			methodA();
//		} catch(Exception e) {
//			System.out.println("Exception caught in main: " + e.getMessage());
//		}
//	}
//	
//	public static void methodA() {
//		try {
//			methodB();
//		} catch (ArthmeticException e) {
//			// 예외를 처리하지 않고 다시 떠넘김
//			throw e;
//		}
//	}
//	
//	public static void methodB() {
//		// 산술 예외 발생
//		int result = 10 / 0;
//	}
//}

// # 로직 #

// main 메소드에서 methodA를 호출하고 있음
// methodA에서는 methodB를 호출하고, methodB에서는 산술 예외를 발생시킴
// methodA에서는 methodB에서 발생한 산술 예외를 처리하지 않고, 다시 main으로 떠넘기고 있음
// ==> methodA를 호출한 main 메소드에서 예외를 처리하게 됨

// ==> 예외는 호출 스택을 따라 올라가면서 예외를 처리할 수 있는 첫 번째 catch 블록이 있는 곳에서 처리되거나,
// 		만약 어떤 곳에서도 처리되지 않았다면, 예외는 프로그램이 종료되기 전까지 계속해서 전파됨
// 		나중에는 JVM으로 전파되어 JVM이 처리

public class C08Throw {
//	public static void Ex1() {
//		try {
//			throw new ArithmeticException();
//		} catch (Exception e) {
//			System.out.println("Ex1의 예외처리");
//		}
//		System.out.println("Ex1에서의 코드");
//	}
//	
//	public static void Ex2() throws ArithmeticException { // main에서 실행했으니 main에서 예외 처리를 해줘야 함
//		 throw new ArithmeticException();
//	}
//	
//	public static void Ex3() {
//		
//	}
//	
	public static void main(String[] args) {
//		Ex1();		// direct throwing
//		
//		try {
//			Ex2();	// rethrowing
//		} catch (Exception e) {
//			System.out.println("main에서 예외 처리");
//		}
//		
//		try {
//			// 예외를 떠넘기는 메소드 호출
//			methodWithException();
//		} catch (ArthmeticException e) {
//			System.out.println("ArithmeticException caught in main: " + e.getMessage());
//			// 추가적인 조치 (Ex. 로깅)
//		}
	}
//
//	public static void methodWithException throws ArithmeticException {
//		// 산술 예외 발생
//		throw new ArithmeticException("Custom ArithmeticException");
//	}
}
