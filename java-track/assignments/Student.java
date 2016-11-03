
public class Student {

//	ATTRIBUTES
	private String firstName;
	private String lastName;
//	private String name;
	private int ID;
	private int credits;
//	private double gpatotal;
	private double gpa;
	private double qualityTotal;
	
	
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
//	instantiate Student obj - this one is to match the params in the test doc
	public Student(String firstName, String lastName, int ID) {  // , int credits, double gpatotal) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ID = ID;
//		this.credits = credits;
//		this.gpatotal = gpatotal;
	}
	
	
//	CONSTRUCTOR
//	instantiate Student obj - this one instantiates all attributes including credits and gpa
	public Student(String firstName, String lastName, int ID, int credits, double gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ID = ID;
		this.credits = credits;
		this.gpa = gpa;
		this.qualityTotal = credits * gpa;
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
		return firstName + " " + lastName;
	}
	
//	get Student ID
	public int getStudentID() {
		return ID;
	}
	
//	get Student credits
	public int getCredits() {
		return credits;
	}
	
//	get Student GPA
	public double getGPA() {
		return gpa;
	}
	
	
//	add toString() method
//    to print name and ID
//	public String toString() {
//		return "firstName " + "lastName, " + ID;
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
//	public void submitGrade(double d, int i) {       // this is what Eclipse gave me
//	public double submitGrade(double grade, int credits) {
//		gpa = (credits * grade) / credits;
		
//	public double submitGrade(double grade, int credits) {
//		double sum = (gpa * credits) + (this.gpa * this.credits);
//		gpa = sum / credits;
//		// don't forget to round //////////
//		return gpa;
//	}
	
	
	public double submitGrade(double grade, int sCredits) {
		double quality = sCredits * grade;
		qualityTotal += quality;
		credits += sCredits;
		gpa = Math.round((qualityTotal / credits) * 1000.0) / 1000.0;
		return gpa;
	}
	
	
//	 use arrays to simulate number of credits, and grade...?
//	 return .product (sum) of quality scores and divide by sum of credits = gpa total
	
	
	
	
////	computeTuition() method
//	public Object computeTuition() {
//		totalPaid
//
//		return null;
//	}
	
//  computeTuition() method
	public double computeTuition() {
		double costPerCredit = Math.round((20000.00 / 15) * 100.0) / 100.0;
		double need = 0;
		int leftovers = 0;
		
		if (credits >= 15) {
			need = 20000.0;
			leftovers = credits - 15;
		}
		else {
			need = 0;
			leftovers = credits;
		}
		
		double totalPaid = need + (leftovers * costPerCredit);
//		double totalPaid = credits * costPerCredit;
		return totalPaid;
	}
	
//	if (credits < 15) {
//		costPerCredit calc
//	}
	

	
//	createLegacy() method
	public Student createLegacy(Student s, Student ss) {

		Student bb = new Student(s.getName(), ss.getName(), s.getStudentID() + ss.getStudentID());

		bb.firstName = s.getName();
		bb.lastName = ss.getName();
		
		bb.ID = s.getStudentID() + ss.getStudentID();
		
//		est GPA = average of parents' GPA
		bb.gpa = (s.getGPA() + ss.getGPA()) / 2;
		
		
//		est number of credits = max credits b/w parents
//		   if P1 credits > P2 credits, then child credits = P1 credits
//		   if P1 credits < P2 credits, then child credits = P2 credits 
		
//		s.getCredits();
//		ss.getCredits();
		if (s.getCredits() > ss.getCredits()) {
			bb.credits = s.credits;
		}
		else {
			bb.credits = ss.credits;
		}
		
		
		return bb;
	}
	
///////// there's something wrong with the JU test RE: bb.getName() method...
	
	
//	public String getName() {
//		return bb.firstName + " " + bb.lastName;
//	}
	
	
//	toString() method
//	return "Name of Student: " + this.name + ", " + "Student ID # " + this.ID;
	public String toString() {
//		return "Name of Student: " + this.name + ", " + "Student ID # " + this.ID;
		return this.firstName + " " + this.lastName + ", ID #: " + this.ID;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * template
		 * 
		 */
//		S1Rect rectangle = new S1Rect(10, 20);
		
		Student s = new Student("Jack", "Hazel", 123);
		System.out.println(s.getName());
		System.out.println(s.getStudentID());
	}


}
