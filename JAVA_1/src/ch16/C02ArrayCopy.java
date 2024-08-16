package ch16;

import java.util.Arrays;

public class C02ArrayCopy {
	public static void main(String[] args) {
		int arr[] = {10, 20, 30};
		
		System.out.println(arr);
		System.out.println(arr.hashCode());
		System.out.println(System.identityHashCode(arr));
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
		
		// 배열의 경우, hashCode() 메서드는 오버라이딩되지 않아서 Object 클래스의 기본 구현을 사용
		// => 배열 객체의 hashCode()는 여전히 메모리 주소를 기반으로 한 해시 코드를 반환
		
		// 얕은 복사 (위치값 복사) -> arr1의 요소를 변경하면 arr2의 요소값도 변경됨
		// 여러 개의 참조변수를 연결하는 경우가 아니라면 얕은 복사 사용 X
		int arr2[] = arr;
		
		// 깊은 복사 (데이터 값 복사) => 두 배열이 서로 다른 메모리 주소 가짐
		int arr3[] = new int[3];
		for(int i = 0; i < arr3.length; i++) {
			arr3[i] = arr[i];
		}
		
		// 복사 원본, 얼만큼 복사할 건지 길이
		int arr4[] = Arrays.copyOf(arr, arr.length);
		
		System.out.println();
		System.out.println(arr);	// 주소값(배열 객체의 참조값) 출력
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println(arr4);
		
		// arr2의 배열의 요소값 변경
		arr2[0] = 100;
		arr2[1] = 200;
		arr2[2] = 300;
		
		// => arr이 참조하고 있는 배열 객체가 arr2와 동일하기 때문에 arr의 요소값도 변경
		for(int n : arr) {
			System.out.println(n);
		}
		
		// arr4는 arr, arr2가 참조하고 있는 객체와 서로 다른 객체
		// => 요소값 변경과 관련 X
		
		for(int n : arr4) {
			System.out.println(n);
		}
	}
}
