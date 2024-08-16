package ch23;

public class C03NumberFormatExceptionExample {
	public static void main(String[] args) {
		try {
			String data1 = "100";
			String data2 = "a100";
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2); // 문자가 포함된 내용 Integer로 변환
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("JUST EXECUTED!!!");
		}
		System.out.println("프로그램 종료!!");
	}
}
