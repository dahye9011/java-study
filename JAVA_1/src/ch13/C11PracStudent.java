package ch13;

class Student {
	String name;
	int studentID;
	char grade;
	
	public Student() {
		
	}
	
	public Student(String name, int studentID) {
		this.name = name;
		this.studentID = studentID;
	}
	
	public void calculateGrade(int score) {
		if(score >= 90) {
			grade = 'A';
		}
		else if (score >= 80) {
			grade = 'B';
		}
		else if (score >= 70) {
			grade = 'C';
		}
		else if (score >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
	}
	
	public void displayInfo() {
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + studentID);
		System.out.println("학점 : " + grade);
	}
}

public class C11PracStudent {
	public static void main(String[] args) {
		Student student1 = new Student("홍길동", 20210001);
		int examScore = 85;
		student1.calculateGrade(examScore);
		student1.displayInfo();
	}
}
