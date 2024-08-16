package ch13;

public class C05AccountMain {
	// 속성 (멤버 변수) 선언
	private String accountNumber;
	private int balance;
	
	// Parameter Constructor
	public C05AccountMain(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	// 입금 기능
	public void deposit(int account) {
		balance += account;
		System.out.printf("[SYSTEM] : 입금 완료. 현재 잔액 : %d원\n", balance);
	}
	
	
	// 출금 기능
	public void withdraw(int account) {
		if(balance < account) {
			System.out.println("잔액이 부족합니다.");
		}
		else {
		balance -= account;
		System.out.printf("[SYSTEM] : 출금 완료. 현재 잔액 : %d원\n", balance);
		}
	}
	
	// 통장 잔고와 계좌 번호를 알려주는 기능
	public void printMyAccount() {
		System.out.printf("%s 계좌번호의 현재 잔액은 %d원입니다.", accountNumber, balance);
	}
	
	public static void main(String[] args) {
		C05AccountMain myAcc = new C05AccountMain("123-4567-89", 100000000);
		
		myAcc.deposit(30000);
		myAcc.withdraw(20000000);
		myAcc.printMyAccount();
	}
}
