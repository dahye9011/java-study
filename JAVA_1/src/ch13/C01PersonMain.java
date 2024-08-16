package ch13;

public class C01PersonMain {

	public static void main(String[] args) {
		C01Person hong = new C01Person();
		hong.name = "홍길동";
		hong.age = 30;
		hong.address = "대구광역시";
		hong.hello();
		System.out.printf("%s 님의 나이는 %d이고 주소는 %s입니다.", hong.name, hong.age, hong.address);

	}

}
