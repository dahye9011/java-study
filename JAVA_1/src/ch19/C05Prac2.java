package ch19;
class StationaryStore {
	static int penCnt = 100;
	static int pencilCnt = 100;
	
	void write() {
		
	}
}

class Pen extends StationaryStore {
	public Pen() {
		penCnt--;
	}
	
	@Override
	void write() {
		System.out.println("펜으로 씁니다.");
	}
}

class Pencil extends StationaryStore {
	public Pencil() {
		pencilCnt--;
	}
	
	@Override
	void write() {
		System.out.println("연필로 씁니다.");
	}
}

public class C05Prac2 {
	public static void Writing(StationaryStore item) {	// 업캐스팅 된 상태로 객체를 받음
		item.write();
	}
	
	public static void ShowInfo() {
		System.out.printf("펜 재고량 : %d\n연필 재고량 : %d", StationaryStore.penCnt, StationaryStore.pencilCnt);
	}
	
	public static void main(String[] args) {
		Pen item1 = new Pen();
		Pencil item2 = new Pencil();
		Writing(item1);
		Writing(item2);
		ShowInfo();
	}
}
