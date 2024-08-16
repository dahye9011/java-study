package java_1;

import java.util.*;

public class Ch05 {

	public static void main(String[] args) {
		// 00. 입력문 (값 입력받기, Scanner)
		// System.out	: 표준 출력 스트림 생성
		// System.in 	: 표준 입력 스트림 생성
		
		// 실수
		// nextDouble()
		// nextFloat()
		
		// 정수
		// nextInt()
		// nextLong()
		// nextByte()
		// nextShort()
		
		// 논리
		// nextBoolean()
		
		// 한 단어 (String)
		// next()
		
		// 한 줄 (String)
		// nextLine()
		
		Scanner sc = new Scanner(System.in); // sc라는 이름으로 System.in 스트림 도구를 사용
		
//		System.out.println("----- Scanner 버퍼 비우기 예제 -----");
//		System.out.print("수 입력: ");
//		int num = sc.nextInt();
//		
//		sc.nextLine(); // 개행문자를 없애줄 코드라인
//		
//		System.out.println("문자열 입력: ");
//		String str2 = sc.nextLine();
//		System.out.println("입력한 문자열: " + str2);
		
//		System.out.println("직사각형 가로 길이 입력: ");
//		int width = sc.nextInt();
//		
//		System.out.println("직사각형 세로 길이 입력: ");
//		int height = sc.nextInt();
//		
//		int area = width * height;
//		int round = (width + height)*2;
//		
//		System.out.printf("가로 길이 %d이고 세로 길이 %d인 직사각형의 넓이는 %d입니다.\n", width, height, area);
//		System.out.printf("가로 길이 %d이고 세로 길이 %d인 직사각형의 둘레는 %d입니다.", width, height, round);
		
		System.out.println("이름을 입력하세요.");
		String name = sc.next();
		
		System.out.println(name + " 님의 나이를 입력하세요.");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println(name + " 님의 주소를 입력하세요.");
		String address = sc.nextLine();
		
		System.out.printf("%s 님의 나이는 %d세 주소는 %s입니다.", name, age, address);
	}

}
