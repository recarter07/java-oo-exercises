
public class Course{

	private String name;
	private double credits;
	private int remainingSeats;
	private Student [] roster;
//	private String roster;      // roster is array of Student objs
	

	
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
	public Course(String name, double credits, int totalSeats/*, int remainingSeats*/) {
		this.name = name;
		this.credits = credits;
//		this.remainingSeats = remainingSeats;
		this.remainingSeats = totalSeats;
//		this.roster = roster;
		this.roster = new Student[totalSeats];
//		this.roster = new Student[remainingSeats];
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
//	public int getSeatsLeft() {
//		return seatsLeft;
//	}
	
	public Object getRemainingSeats() {
		return remainingSeats;
	}
	
	
//	///////////
//	get Course roster []
//	public String getRoster() {  // should be array of Student objs
//		return roster;
//	}
	
	
//	OTHER METHODS
//	addStudent() method
//	public boolean addStudent(Student s2) {
//		if (this.remainingSeats > 0 && this.roster.contains(s2)) {
//			return false;
//		}
////		for ()
//		else if (this.remainingSeats == 0) {
//			return false;
//		}
//		else {
//			return true;
//		}
//	}
	
	
//	   already defined above:
//	this.roster = new Student[totalSeats];
	
	public boolean addStudent(Student s) {
		if (this.remainingSeats == 0) {
			return false;
		}
		for (int i = 0; i < this.roster.length; ++i) {
//			if this index is not empty, compare the names
			if (this.roster[i] != null) {
				if (s.getName() == this.roster[i].getName()) {
				return false;
				}
			}
			else {
//			add the student s to the roster at index i
				this.roster[i] = s;
				this.remainingSeats = this.remainingSeats - 1;
				return true;
			}
		}
		return true;
	}
	

//	
//	for (int i = 0; i < roster.length; ++i) {
//		if (roster[i] != null) {
//			if (s.getName() == roster[i].getName()) {
//			return false;
//			}
//			else {
//				
//			}
//		} else {
//			
//		}
//		
//	}
//	
//	
//	
//	addStudent() method alt version:
//	public boolean addStudent(Student s2) {
//		if (this.remainingSeats > 0 && this.roster.contains)
//	}
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////
//	generateRoster() method
	public String generateRoster() {
//		while (there are students still left to be named)
//		while (i < this.roster.length) {  }
		String ros = "";
		for (int i = 0; i < this.roster.length; ++i) {
			// if this index is full:
			if (this.roster[i] != null) {
				ros += this.roster[i].getName() + " ";	
			}
			else {
//			break out of the for loop
				break;
			}
		}
		return ros;
	}

	
	
//	averageGPA() method
	public double averageGPA() {
		double averageGPA = 0;
		double allGPA = 0;
//		double gpa = this.roster[i].getGPA();
//		   template:
//		this.roster = new Student[totalSeats];
//		this.full = new Student[totalSeats - remainingSeats];
//		this.full = totalSeats - remainingSeats;
		int full = this.roster.length - this.remainingSeats;

//		this.remainingSeats = totalSeats;
//		this.roster = roster;
//		this.roster = new Student[totalSeats];
		
//		while (roster.length > 0) {
		for (int i = 0; i < full; ++i) {
			double gpa = roster[i].getGPA();
			allGPA = allGPA + gpa;
		}
		
		averageGPA = allGPA / full;
		
//		getGPA() for seats - getRemainingSeats()
//		averageGPA = (sum of all getGPA()s) / getGPA().length
		
		return averageGPA;
	}
	
	
	
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
		
		Course co = new Course ("Herstory", 3.5, 9);
		System.out.println(co.getName());
		System.out.println(co.getCredits());
		System.out.println(co.getRemainingSeats());
//		System.out.println(co.getRoster());
		
		
	}



}






//generateRoster() method




//averageGPA() method
//public double averageGPA() {
//	double averageGPA = 0;
//	double allGPA = 0;
//	for (int i = 0; i < roster.length; ++i) {
//		double allGPA += gpa;
//	}
//	averageGPA = allGPA / roster.length;
//	
////	getGPA() for seats - getRemainingSeats()
////	averageGPA = (sum of all getGPA()s) / getGPA().length
//	
//	return averageGPA;
//}

