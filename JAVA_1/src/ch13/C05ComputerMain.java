package ch13;

class Computer {
	String serialNo;
	String cpu;
	String ram;
	String disk;
	
	public Computer(String serialNo, String cpu, String ram, String disk) {
		this.serialNo = serialNo;
		this.cpu = cpu;
		this.ram = ram;
		this.disk = disk;
	}
	
	public void PowerOn() {
		System.out.printf("SerialNo %s의 전원을 켭니다.\n", serialNo);
	}
	
	public void showInfo() {
		System.out.println("### Computer Information ###");
		System.out.println("SerialNo : " + serialNo);
		System.out.println("CpuSpec : " + cpu);
		System.out.println("RamSpec : " + ram);
		System.out.println("DickSpec : " + disk);
	}
	
	public void PowerOff() {
		System.out.printf("SerialNo %s의 전원을 끕니다.\n", serialNo);
	}
}

public class C05ComputerMain {
	public static void main(String[] args) {
		Computer gram = new Computer("1010", "I7", "16G", "2TB");
		
		gram.PowerOn();		// SerialNo 1010의 전원을 켭니다.
		System.out.println();
		gram.showInfo();	// ### Computer Information ###
		System.out.println();
		gram.PowerOff();	// SerialNo 1010의 전원을 끕니다.
	}
}