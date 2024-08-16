package ch16;

public class C03MultiArray {
	public static void main(String[] args) {
		// 이차원 배열 [행][열]
		int arr1[][] = new int[2][3];
		
		arr1[0][0] = 10;
		arr1[0][1] = 20;
		arr1[0][2] = 30;
		
		arr1[1][0] = 11;
		arr1[1][1] = 22;
		arr1[1][2] = 33;
		
		System.out.println("행 개수 : " + arr1.length); // 2
		System.out.println("0번 행의 열 개수 : " + arr1[0].length); // 3
		System.out.println("1번 행의 열 개수 : " + arr1[1].length); // 3
		
		// 중첩 반복문
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {	// 이차원 배열이 가변 길이의 열을 가질 수 있는 경우, 각 행마다 다른 열 개수를 확인하여 적절히 순회
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		// 개량 반복문
		for(int[] a : arr1) { // int[] 타입의 변수 a == 1차원 배열을 참조하는 변수 / arr1의 각 행을 차례로 꺼내서 a라는 이름의 1차원 배열에 넣음
			for(int b : a) { // => a는 한 행을 의미 => a의 각 원소를 차례로 꺼내서 b라는 변수에 넣음
				System.out.print(b + " ");
			}
			System.out.println();
		}
		
		// for (타입 변수명 : 배열 또는 컬렉션) {
		    // 변수명을 사용하여 작업 수행
		// }
	}
}
