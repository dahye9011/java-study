package ch23;

// ### ArrayIndexOutOfBoundsException ###

// 배열의 인덱스가 허용 범위를 벗어날 때 발생하는 예외
// 이 예외는 실행 시간(Runtime)에 발생
// ==> 배열을 다루는 코드에서 인덱스 오류를 나타냄

public class C02ArrayIdxException {
	public static void main(String[] args) {
		try {
			int arr[] = {10, 20, 30};
			
			for(int i = 0; i < 5; i++) {
				System.out.println(arr[i]); // for는 5번 반복, 배열은 3개 => 예외 발생
			}
		} catch (ArrayIndexOutOfBoundsException e) { // Exception으로 받아도 됨 <- Exception이 상위 클래스이므로 업캐스팅 됨
			e.printStackTrace(); // 프로그램 종료 전 예외 발생 정보 출력
		}
		
		System.out.println("실행코드1");
		System.out.println("실행코드2");
	}
}
