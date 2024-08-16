package ch13;

public class C06PracOddEven {
	public int sum(int n1, int n2, int n3, int n4) {
		int oddsum = 0;
		int evensum = 0;
		
		if(n1 % 2 == 0) {
			evensum += n1;
		} else {
			oddsum += n1;
		}
		
		if(n2 % 2 == 0) {
			evensum += n2;
		} else {
			oddsum += n2;
		}
		
		if(n3 % 2 == 0) {
			evensum += n3;
		} else {
			oddsum += n3;
		}
		
		if(n4 % 2 == 0) {
			evensum += n4;
		} else {
			oddsum += n4;
		}
		
		System.out.println("짝수의 합 : " + evensum);
		System.out.println("홀수의 합 : " + oddsum);
		
		return n1 + n2 + n3 + n4;
		
	}

	public static void main(String[] args) {
		C06PracOddEven obj = new C06PracOddEven();
		int result = obj.sum(20, 21, 12, 111);
		System.out.println("result = " + result);
	}

}
