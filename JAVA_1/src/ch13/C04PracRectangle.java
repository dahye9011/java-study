package ch13;

class Rectangle {
	double width;
	double height;
	
	// Default Constructor
	public Rectangle() {
		
	}
	
	// Parameter Constructor
	public Rectangle(double width, double height) {	// 매개변수 width, height를 인스턴스 변수 this.width, this.height에 대입
		this.width = width;
		this.height = height;
	}
	
	// 기능 : 사각형의 넓이 구하기
	public double getArea() {
		return width * height;
	}
	
	// 기능 : 사각형의 둘레 구하기
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
}

public class C04PracRectangle {
	public static void main(String[] args) {
		Rectangle test = new Rectangle(5.0, 3.0);
		double area = test.getArea();
		double round = test.getPerimeter();
		
		System.out.println("넓이 : " + area);
		System.out.println("둘레 : " + round);
	}
}
