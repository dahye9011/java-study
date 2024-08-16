package java_1;

public class Ch01 {
	public static void main(String[] args) {
		System.out.println("----- 변수 선언 예제 -----");
		
		int age;
		age = 22;
		System.out.println(22);
		System.out.printf("age : %d\n", age);
		
		int num1 = 10;
		int num2 = 20;
		int num3 = num1 + num2;
		System.out.println(num3);
		System.out.println();
		
		// int : 4byte 정수, 기본자료형
		System.out.println("----- 정수 자료형 - int형 예제 -----");
		int n1 = 0b10101101;
		int n2 = 173;
		int n3 = 0255;
		int n4 = 0xad;
		System.out.printf("%d %d %d %d\n", n1, n2, n3, n4);
		System.out.println();
		
		// byte : 1byte 정수, 부호O
		System.out.println("----- 정수 자료형 - byte형 예제 -----");
		byte m1 = -128;
		byte m2 = -30;
		byte m3 = 30;
		byte m4 = 127;
		// byte m5 = 128; <- ERROR
		System.out.printf("%d %d %d %d\n", m1, m2, m3, m4);
		
	}

}
