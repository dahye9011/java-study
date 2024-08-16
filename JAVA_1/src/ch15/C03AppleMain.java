package ch15;

class Seller {
	int savedMoney;
	int sellerAppleCnt;
	int applePrice;
	
	public Seller(int savedMoney, int sellerAppleCnt, int applePrice) {
		this.savedMoney = savedMoney;
		this.sellerAppleCnt = sellerAppleCnt;
		this.applePrice = applePrice;
	}
	
	int returnApple(int money) {
		savedMoney += money;
		int cnt = money / applePrice;
		sellerAppleCnt -= cnt;
		return cnt;
	}

	void ShowInfo() {
		System.out.println("seller 보유 금액 : " + savedMoney);
		System.out.println("seller 사과 개수 : " + sellerAppleCnt);
	}
}

class Buyer {
	int myMoney;
	int appleCnt;
	
	public Buyer(int myMoney, int appleCnt) {
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
	}
	
	void pay(Seller seller, int money) { // 매개변수로 Seller 자료형의 seller 선언
		myMoney -= money;
		int cnt = seller.returnApple(money); // seller 객체의 returnApple 메서드를 호출하여 money 지불하고 얻은 사과를 cnt에 저장
		appleCnt += cnt;
	}
	
	void ShowInfo() {
		System.out.println("buyer 보유 금액 : " + myMoney);
		System.out.println("buyer 사과 개수 : " + appleCnt);
	}
}

public class C03AppleMain {
	public static void main(String[] args) {
		Seller seller1 = new Seller(10000, 100, 1000); // 보유금액, 사과 재고량, 사과 가격
		Seller seller2 = new Seller(20000, 50, 2000);
		Buyer buyer = new Buyer(5000, 0);				// 보유금액, 사과 보유량
		
		buyer.pay(seller2, 2000);					// 어떤 사과장수에게 살 건지(사과장수 객체), 지불한 돈
		
		seller2.ShowInfo(); 	//보유금액, 사과개수 출력
		buyer.ShowInfo(); 	//보유금액, 사과개수 출력
	}
}
