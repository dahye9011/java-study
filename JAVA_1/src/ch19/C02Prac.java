package ch19;

class TV {
	int size;
	
	public TV(int size) { // 초기화: 생성자를 통해 객체 생성 시 필요한 초기 설정을 수행
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) { // 변경 : 설정자 메서드를 통해 객체가 생성된 후에도 속성 값 변경 가능
		this.size = size;
	}
}

class ColorTV extends TV {
	int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	
	public void printProperty() {
		System.out.printf("%d인치 %d컬러", size, color);
	}
}

public class C02Prac {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);	// size, color
		myTV.printProperty();
		myTV.setSize(120);
		myTV.getSize();
	}
}
