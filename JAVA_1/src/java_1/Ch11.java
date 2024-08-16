package java_1;

public class Ch11 {

	public static void main(String[] args) {
		
		boolean flag = false;	// flag의 defualt value : false
								// 5 * 5 = 25를 출력하고 flag를 true로 만들면서
								// i while문으로 탈출했을 때 flag가 true일 때 다시 break 시켜주는 코드
		
//		int i = 2;
//		while (i <= 9) {
//			int j = 1;
//			while (j <= 9) {
//			System.out.printf("%d * %d = %d\n", i, j, i*j);
//			if( i == 5 && j == 5) {
//				flag = true;
//				break;	// j while문을 종료
//			}
//			j++;
//		}
//			// i == 5 && j == 5일 때 탈출 후 실행 코드 구간
//			
////			if(i == 5) {
////				break;
////			}
//			
//			// flag가 true인 건 i == 5 && j == 5
//			if (flag == true) { // i == 5라는 의미
//				break;			// 첫 번째 i while문을 종료
//			}
//			
//			System.out.println();
//			i++;
//		}
		
//		int i = 1;
//		while (i <= 10) {
//			if (i % 3 == 0) {
//				i++;
//				continue;
//			}
//			System.out.println("i의 값 : " + i);
//			i++;
//		}
		
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			// i > 50인 경우 반복 중단
			if (i > 50) {
				break;
			}
			
			// 5의 배수라면 sum에 더하고 i 증가
			if(i % 5 == 0) {
				sum += i;
				i++;
				continue;
			}
			
			System.out.printf("%d\n", i);
			i++;
		}
		System.out.printf("5의 배수의 총합 : %d", sum);
		
	}

}
