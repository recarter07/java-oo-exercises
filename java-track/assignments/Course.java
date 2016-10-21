
public class Course {

	private String name;
	private double credits;
	private int seatsLeft;
	private String roster;      // roster is array of Student objs
	
	
	/*
	 * template
	 * 
	 */
//	CONSTRUCTOR:
// 	instantiate Rect obj
//	public S1Rect(double length, double width) {
//		this.length = length;
//		this.width = width;
//	}
	
	
//	CONSTRUCTOR
//	instantiate Course obj
	public Course(String name, double credits, int seatsLeft, String roster) {
		this.name = name;
		this.credits = credits;
		this.seatsLeft = seatsLeft;
		this.roster = roster;
	}
	
	
	/*
	 * template
	 * 
	 */
//	get area
//	public double getArea() {
//		double area = this.length * this.width;
//		return area;
//	}
	
	
//	METHODS
//	get Course name
	public String getName() {
		return name;
	}
	
	
//	get Course credits
	public double getCredits() {
		return credits;
	}
	
	
//	get Course seatsLeft
	public int getSeatsLeft() {
		return seatsLeft;
	}
	
	
//	///////////
//	get Course roster []
	public String getRoster() {  // should be array of Student objs
		return roster;
	}
	
	
//	OTHER METHODS
//	addStudent () method
	
	
	
	
//	generateRoster() method
	
	
	
	
//	averageGPA() method
	
	
	
	
	
//	toString() method
	public String toString() {
		return this.name + ", " + this.credits + " credits";
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * template
		 * 
		 */
//		S1Rect rectangle = new S1Rect(10, 20);
		
		Course co = new Course ("Herstory", 3.5, 9, "Jack, Jill, Basley");
		System.out.println(co.getName());
		System.out.println(co.getCredits());
		System.out.println(co.getSeatsLeft());
		System.out.println(co.getRoster());
		
		
		
		
	}

}
