package java_1;

import java.util.*;

public class Ch10 {

	public static void main(String[] args) {

//		System.out.println("----- 2단 출력 -----");
//		int i = 1;
//		while (i <= 9) {
//			System.out.printf("%d * %d = %d\n", 2, i, 2*i);
//			i++;
//		}


//		System.out.println("----- 2단 역출력 -----");
//		int i = 9;
//		while (i >= 1) {
//			System.out.printf("%d * %d = %d\n", 2, i, 2*i);
//			i--;
//		}
		
//		System.out.println("----- N단 출력 -----");
//		System.out.println("정수를 입력하세요.");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int i = 1;
//		while (i <= 9) {
//			System.out.printf("%d * %d = %d\n", num, i, num*i);
//			i++;
//		}
		
//		System.out.println("----- N단 역출력 -----");
//		System.out.println("정수를 입력하세요.");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int i = 9;
//		
//		while (i >= 1) {
//			System.out.printf("%d * %d = %d\n", num, i, num*i);
//			i--;
//		}
		
//		System.out.println("----- 구구단 전체 출력 -----");
//		int i = 2;
//
//		while (i <= 9) {
//			int j = 1; // 내부 루프 시작될 때마다 j를 1로 초기화
//			while (j <= 9) {
//				System.out.printf("%d * %d = %d\n", i, j, i*j);
//				j++;
//			}
//			i++;
//		}
		
//		System.out.println("----- 구구단 N단부터 전체 출력 -----");
//		System.out.println("정수를 입력하세요.");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		while (num <= 9) {
//			int i = 1;
//			while (i <= 9) {
//				System.out.printf("%d * %d = %d\n", num, i, num*i);
//				i++;
//			}
//			num++;
//		}
		
//		System.out.println("----- 구구단 전체 역출력(단) -----");
//		int i = 9;
//		while (i >= 2) {
//			int j = 1;
//			while (j <= 9) {
//				System.out.printf("%d * %d = %d\n", i, j, i*j);
//				j++;
//			}
//			i--;
//		}
		
//		System.out.println("----- 구구단 역출력 -----");
//		int i = 9;
//		while (i >= 2) {
//			int j = 9;
//			while (j >= 1) {
//				System.out.printf("%d * %d = %d\n", i, j, i*j);
//				j--;
//			}
//			i--;
//		}
		
//		System.out.println("---- 별 출력 01 -----");
//		System.out.println("높이를 입력하세요.");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 1;
//		while (i <= n) {
//			int j = 1;
//		while(j <= 5) {
//			System.out.printf("*");
//			j++;
//		}
//		System.out.println();
//			i++;
//		}
		
//		System.out.println("---- 별 출력 02 -----");
//		System.out.println("높이를 입력하세요.");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 1;
//		
//		while (i <= n) {
//			int j = 1;
//			while (j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		System.out.println("----- 별 출력 03 -----");
//		System.out.println("높이를 입력하세요.");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 1;
//		
//		while (i <= n) {
//			int j = n;
//			while (j >= i) {
//				System.out.print("*");
//				j--;
//			}
//			System.out.println();
//			i++;
//		}
		
		System.out.println("----- 별 출력 04 -----");
		int i = 1;
		while(i <= 4) {
			// i = 1일 때 코드 섹션
			int space = 1;
			while(space <= 4-i) {
				System.out.print(" ");
				space++;
			}
			int star = 1;
			while (star <= 2 * i - 1) {
				System.out.print("*");
				star++;
			}
			System.out.println();
			i++;
		}
		
		
	}

}
