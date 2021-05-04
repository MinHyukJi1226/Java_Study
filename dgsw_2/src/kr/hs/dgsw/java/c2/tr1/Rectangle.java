package kr.hs.dgsw.java.c2.tr1;

public class Rectangle extends Polygon{
	private double length;
	private double height;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return length * height;
	}
	
	@Override
	public String getName() {
		return "사각형";
	}
	
	@Override
	protected void input() {
		System.out.println("밑변의 길이를 입력하세요");
		setLength(scanner.nextDouble());
		
		System.out.println("높이의 길이를 입력하세요");
		setHeight(scanner.nextDouble());
	}
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		
//		rectangle.setHeight(5);
//		rectangle.setLength(4);
		
		rectangle.input();
		
		rectangle.printArea();
		
		rectangle.closeScanner();
	}
}
