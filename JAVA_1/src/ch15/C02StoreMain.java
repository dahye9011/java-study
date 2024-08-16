package ch15;

class Customer {
	int myMoney;
	int cokeCnt;
	
	public Customer(int myMoney, int cokeCnt) {
		this.myMoney = myMoney;
		this.cokeCnt = cokeCnt;
	}
	
	// 구매 기능
	void pay(Store store, int money) {
		myMoney -= money;
		int cnt = store.returnCoke(money);
		cokeCnt += cnt;
	}
	
	void showInfo() {
		System.out.println("------------------- 고객 정보 -------------------");
		System.out.println("내 돈 : $" + myMoney);
		System.out.println("콜라 보유량 : " + cokeCnt);
		System.out.println("------------------------------------------------");
	}
}

class Store {
	int savedMoney;
	int cokeCnt;	// 매장 콜라 재고량
	int price;
	
	public Store(int savedMoney, int cokeCnt, int price) {
		this.savedMoney = savedMoney;
		this.cokeCnt = cokeCnt;
		this.price = price;
	}
	
	int returnCoke(int money) {
		savedMoney += money;
		int cnt = money / price;
		cokeCnt -= cnt;
		return cnt;
	}
	
	void showInfo() {
		System.out.println("------------------- 편의점 정보 -------------------");
		System.out.println("매장 돈 : $" + savedMoney);
		System.out.println("콜라 재고량 : " + cokeCnt);
		System.out.println("콜라 가격 : " + price);
		System.out.println("------------------------------------------------");
	}
}

public class C02StoreMain {

	public static void main(String[] args) {
		Customer gom = new Customer(100000, 0);
		Customer cat = new Customer(10000, 2);
		
		Store GS = new Store(1000000, 100, 500);
		Store CU = new Store(2000000, 50, 1200);
		
		cat.showInfo();
		System.out.println();
		
		cat.pay(CU, 4000);	// 어디서 구매, 지불 가격
		
		cat.showInfo();
		System.out.println();
		
		CU.showInfo();
		System.out.println();
	}

}
