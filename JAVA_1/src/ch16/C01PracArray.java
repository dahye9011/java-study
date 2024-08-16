package ch16;

import java.util.Scanner;

public class C01PracArray {
	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		for(int var : arr) {
			System.out.print(var + " ");
		}
		
		double average = (double)sum / arr.length;
		
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if (max <= arr[i]) {
				max = arr[i];
			}
		}
		
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if (min >= arr[i]) {
				min = arr[i];
			}
		}
	
		System.out.println("\n합 : " + sum);
		System.out.println("평균 : " + average);
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}
}
