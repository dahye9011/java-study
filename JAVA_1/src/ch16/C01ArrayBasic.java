package ch16;

import java.util.Scanner;

public class C01ArrayBasic {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int arr[] = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// ### for each문 ###
		for(int var : arr) {
			System.out.print(var + " ");
		}
		
		double arr1[] = new double[7];
		
		System.out.println("배열의 길이 : " + arr.length);
		System.out.println("배열의 길이 : " + arr1.length);
	}
}
