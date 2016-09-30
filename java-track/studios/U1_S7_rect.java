//package studio7; from Eclipse (orig) workspace3
//previously "public class Rect { "

public class U1_S7_rect {

	private double length, width;
	
	
	
//	public void setArea() {
//		double area = length * width;
//		double perim = (2 * length) + (2 * width); 
//	}
	
	
	
	public double getArea() {
		double area = this.length * this.width;
		return area;
	}
	
	
	public double getPerim() {
		double perim = (2 * this.length) + (2 * this.width);
		return perim;
	}
	
	
	public boolean isSquare() {
		if (this.length == this.width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	/**
	 * template
	 * 
	 */
//	public class Person {
//		
//		private int height, age;
//		
//		public Person(int height) {
//			this.height = height;
//			this.age    = 0;
//		}
//		
//		public void setHeight(int height) {
//			this.height = height;
//		}
//
//		public int getHeight() {
//			return this.height;
//		}
		
		
}
