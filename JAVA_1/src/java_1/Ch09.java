package java_1;

import java.util.*;

public class Ch09 {

	public static void main(String[] args) {
//		System.out.println("----- while문 무한 루프 예제 -----");
//		
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		int num;
//		
//		while(true) {
//			System.out.println("정수 입력 (-1 입력 시 종료) : ");
//			num = sc.nextInt();
//			
//			if(num == -1) {
//				System.out.println("종료합니다.");
//				break;
//			}
//			sum += num;
//		}
//		System.out.println("누적된 총합 : " + sum);

//		System.out.println("----- while - if문 문제 01 -----");
//		System.out.println("정수 입력 : ");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		
//		while (i <= n) {
//			if (i % 3 == 0) {	// 3의 배수인지 확인
//				sum += i;
//			}
//			i++;	// 다음 반복을 위해 수 증가
//		}
//		System.out.printf("1부터 %d까지의 수 중, 3의 배수의 합은 %d입니다.", n, sum);
		
//		System.out.println("----- while - if문 문제 02 -----");
//		Scanner sc = new Scanner(System.in);
//		int num;
//		int sum1 = 0; // 짝수 합
//		int sum2 = 0; // 홀수 합
//		
//		while (true) {
//			System.out.println("정수 입력 (-1 입력 시 종료) : ");
//			num = sc.nextInt();
//			
//			if (num == -1) {
//				System.out.println("종료합니다.");
//				break;
//			}
//			
//			else if (num % 2 == 0) {
//				sum1 += num;
//			}
//			
//			else if (num % 2 != 0) {
//				sum2 += num;
//			}
//		}
//		System.out.printf("짝수의 합 : %d\n홀수의 합 : %d", sum1, sum2);

//		System.out.println("----- while - if문 문제 03 -----");
//		int i = 1;
//		
//		while (i <= 100) {
//			if ((i % 3 == 0) && (i % 4 == 0)) {
//				System.out.println("i의 값 : " + i);
//			}
//			i++;
//		}
		
//		System.out.println("----- while - if문 문제 04 -----");
//		System.out.println("정수 입력 : ");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 1;
//
//		while (i <= n) {			
//			int j = 1;
//			int cnt = 0; // 나누어떨어지는 횟수를 저장하는 변수
//			
//			while (j <= i) {
//				if (i % j == 0) {
//					cnt++;
//				}
//				j++;
//			}
//			if (cnt == 2) {
//				System.out.println("i의 값 : " + i + " <- 소수");
//			}
//			else {
//				System.out.println("i의 값 : " + i);
//			}
//			i++;
//		}
		
//		System.out.println("----- while - continue 예제 -----");
//		// 1부터 10까지의 수 중, 3의 배수는 제외하고 출력
//		int i = 1;
//		while (i <= 10) {
//			if (i % 3 == 0) {
//				i++;
//				continue;	// 근접한 반복문의 조건식으로 돌아감 
//				// continue 문이 실행되면, 
//				// 현재 반복의 나머지 코드 (System.out.println("i = " + i); 및 i++)는 실행 X
//			}
//			System.out.println("i = " + i);
//			i++;
//		}
		
		
	}		
}
