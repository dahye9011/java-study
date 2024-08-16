package ch23;

// ### IllegalArgumentException ###
// 메소드에 전달된 인수가 유효하지 않은 경우 발생하는 예외

public class C05IllegalArgumentException {
	public static int squareRoot(int value) {
		if (value < 0) {
			throw new IllegalArgumentException("음수는 허용되지 않습니다.");
		}
		// 간단한 제곱근 계산을 위해 예시적으로 value를 반환합니다.
		return (int) Math.sqrt(value); // sqrt : "square root"의 약자, 주어진 숫자의 제곱근을 계산
	}
	
	public static void main(String[] args) {
		try {
			int result = squareRoot(-1);
			System.out.println("결과 : " + result);
		} catch (IllegalArgumentException e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
	}
}
