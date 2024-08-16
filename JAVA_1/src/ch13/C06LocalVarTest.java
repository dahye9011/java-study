package ch13;

class LocalVar {
	// 속성 (멤버변수)
	int num = 10;
	
	void Func1() {
		System.out.println("멤버변수 num = " + num);
		
		if(true) {
			int num = 100;
			System.out.println("if문 안의 지역변수 num = " + num);
			System.out.println(this.num);
		}
		System.out.println("멤버변수 num = " + num);
	}
	
	void Func2() {
		int i = 1;
		int num = 6;
		while (i <= 5) {
			System.out.println("num = " + (num++));
			i++;
		}
		System.out.println("while 벗어남 num = " + num);
		System.out.println("멤버변수 num = " + (this.num));
	}
}



public class C06LocalVarTest {

	public static void main(String[] args) {
		LocalVar obj = new LocalVar();
		obj.Func1();
		obj.Func2();
	}

}
