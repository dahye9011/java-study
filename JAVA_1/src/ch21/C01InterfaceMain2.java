package ch21;

interface Shape01 {
	// 추상 메서드
	double calculateArea(); 
	void display();
}

class Circle01 implements Shape01 {
	private double radius;
	
	public Circle01(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public void display() {
		System.out.println("원의 넓이 : " + calculateArea());
	}
}

class Rectangle01 implements Shape01 {
	private double length;
	private double width;
	
	public Rectangle01(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double calculateArea() {
		return length * width;
	}
	
	@Override
	public void display() {
		System.out.println("사각형의 넓이 : " + calculateArea());
	}
}

public class C01InterfaceMain2 {
	public static void main(String[] args) {
	     Circle01 circle = new Circle01(5);
	     circle.display();
	     Rectangle01 rectangle = new Rectangle01(4, 6);
	     rectangle.display();
	}
}
