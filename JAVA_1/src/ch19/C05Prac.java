package ch19;

class Employee {
	String name;
	int age;
	String addr;
	
	public Employee(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
}

class Parttimer extends Employee {
	int wage;
	
	public Parttimer(String name, int age, String addr, int wage) {
		super(name, age, addr);
		this.wage = wage;
	}
	
}

class Regular extends Employee {
	int salary;
	
	public Regular(String name, int age, String addr, int salary) {
		super(name, age, addr);
		this.salary = salary;
	}
}

public class C05Prac {
	public static void showInfo(Employee emp) {
		System.out.println("이름 : " + emp.name);
		System.out.println("나이 : " + emp.age);
		System.out.println("주소 : " + emp.addr);
		
		if(emp instanceof Parttimer) {
			Parttimer pt = (Parttimer) emp;
			System.out.println("시급 : " + pt.wage);
		} else if (emp instanceof Regular) {
			Regular rg = (Regular) emp;
			System.out.println("월급 : " + rg.salary);
		}
	}
	
	public static void main(String[] args) {
		Parttimer emp1 = new Parttimer("홍길동", 25, "대구", 20000);
		Regular emp2 = new Regular("서길동", 45, "울산", 50000000);
		C05Prac.showInfo(emp1);
		System.out.println();
		C05Prac.showInfo(emp2);
	}
}
