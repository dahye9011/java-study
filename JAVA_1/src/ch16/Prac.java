package ch16;

import java.util.Scanner;

public class Prac {
	public static void printArray(int[] arr) {
		for(int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	public static void inputArray(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	public static void initializeReverseArray(int[] arr) {
		int value = 9;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = value;
			value--;
		}
	}

	public static double calculateAverage(int[] arr) {
		int sum = 0;
		for(int num : arr) {
			sum += num;
		}
		return (double) sum / arr.length;
	}
	
	public static int calculateSum(int[] arr) {
		int sum = 0;
		for(int num : arr) { // int num은 배열의 각 요소를 순서대로 담는 변수, 루프가 돌 때마다 arr 배열의 다음 요소를 가리킴, arr은 메서드에 전달된 배열
			sum += num;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// 문제 01
	    // 5개의 정수를 저장할 수 있는 배열을 선언하고 모든 요소를 0으로 초기화하고 배열을 출력합니다.
		int arr1[] = new int[5];
		printArray(arr1); // Prac 클래스의 static 메서드이기 때문에 Prac.printArray(arr1);처럼 클래스명으로 호출할 수도 있고, 
						  // Prac 클래스 내부에서는 클래스명 없이 직접 printArray(arr1);로 호출 가능
		
	    // 문제 02
	    // 5개의 정수를 저장할 수 있는 배열을 선언하고 사용자로부터 5개의 정수를 입력받아 배열에 저장하고 배열을 출력합니다.
		int arr2[] = new int[5];
		inputArray(arr2);
		printArray(arr2);

	    // 문제 03
	    // 10개의 정수를 저장할 수 있는 배열을 선언하고 배열을 역순으로 초기화하고(사용자로 부터 값을 입력받는 것 X, 9876543210 이 값을 차례로 넣으면 됨, 직접 대입 X) 배열을 출력합니다.
		int arr3[] = new int[10];
	    initializeReverseArray(arr3);
	    printArray(arr3);
		
	    // 문제 04
	    // 3명의 학생의 시험 점수를 저장하는 배열을 선언하고, 사용자로부터 점수를 입력받아 배열에 저장하고 평균 점수를 출력합니다.
	    int[] scores = new int[3];
	    inputArray(scores);
	    double avg = calculateAverage(scores);
	    System.out.println("평균 점수: " + avg);

	    // 문제 05
	    // 정수로 이루어진 배열을 선언하고, 배열에 저장된 모든 정수의 합을 계산하여 출력합니다.
	    int arr4[] = {3, 7, 2, 8, 5};
	    int sum = calculateSum(arr4);
	    System.out.println("배열의 합: " + sum);
	}
}
