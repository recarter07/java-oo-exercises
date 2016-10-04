
public class Prep1_Robot {

		
		private String name;
		private int position;
		private int speed;
		private int orientation;
		
		/*
		 * template
		 * 
		 */

//		CONSTRUCTOR:
//	 	instantiate Rect obj
//		public S1Rect(double length, double width) {
//			this.length = length;
//			this.width = width;
//		}
		
//		instantiate Robot obj
		public Prep1_Robot(String name, int position, int speed, int orientation) {
			this.name = name;
			this.position = position;
			this.speed = speed;
			this.orientation = orientation;
		}
		
			
		// OTHER METHODS
//		get area
//		public double getArea() {
//			double area = this.length * this.width;
//			return area;
//		}
		
//		get position
		public int getPosition() {
			return position;
		}
		
		
//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//			S1Rect rectangle = new S1Rect(10, 20);
//			System.out.println(rectangle.length);
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Prep1_Robot bot = new Prep1_Robot("Jorge", 5, 20, 0);
			System.out.println(bot.name);
		
	}

}
