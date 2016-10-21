
public class Student {

//	ATTRIBUTES
//	private String firstName;
//	private String lastName;
	private String name;
	private String ID;
	private int credits;
	private double gpatotal;
	
	
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
//	instantiate Student obj
	public Student(String name, String ID, int credits, double gpatotal) {
		this.name = name;
		this.ID = ID;
		this.credits = credits;
		this.gpatotal = gpatotal;
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
//	get Student fullName
	public String getName() {
		return name;
	}
	
//	get Student ID
	public String getStudentID() {
		return ID;
	}
	
//	get Student credits
	public double getCredits() {
		return credits;
	}
	
//	get Student GPA
	public double getGPA() {
		return gpatotal;
	}
	
	
//	add toString() method
//    to print name and ID
//	public String toString() {
//		return "name " + "ID";
//	}
	
	
//	OTHER METHODS
//	getClassStanding() method - assess class standing based on total credits
	public String getClassStanding() {
		this.getCredits();
		if (this.credits < 30) {
			return "Freshman";
		}
//		else if (this.credits > 30) {
		else {
			if (this.credits < 60) {
				return "Sophomore";
			}
			else if (this.credits < 90) {
				return "Junior";
			}
			else {
				return "Senior";
			}
		}
		
//		if (this.credits > 30 AND this.credits < 60) {
//			return "Sophomore";
//		}
//		if (this.credits > 60 AND this.credits < 90) {
//			return "Junior";
//		}
//		if (this.credits >= 90) {
//			return "Senior";
//		}
	}
	
	
//	submitGrade() method
	
	
	
	
	
	
//	computeTuition() method
	
	
	
	
	
	
	
	
//	createLegacy() method
	
	
	
	
	
//	toString() method
//	return "Name of Student: " + this.name + ", " + "Student ID # " + this.ID;
	public String toString() {
//		return "Name of Student: " + this.name + ", " + "Student ID # " + this.ID;
		return this.name + ", ID #: " + this.ID;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * template
		 * 
		 */
//		S1Rect rectangle = new S1Rect(10, 20);
		
		Student s = new Student("Jack Hazel", "123", 3, 4);
		System.out.println(s.getName());
		System.out.println(s.getStudentID());
	}

}
