
public class Rect {

private double length, width;
	
/*
 * template
 * 
 */
// start Savings Account - instantiate Savings Account object
//	public SavingsAccount(Integer balance, double interest_rate) {
//		this.balance = balance;
//		this.interest_rate = interest_rate;
//	}

//	CONSTRUCTOR:
// 	instantiate Rect obj
	public Rect(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
// OTHER METHODS

//	get area
	public double getArea() {
		double area = this.length * this.width;
		return area;
	}
	
//	get perimeter	
	public double getPerim() {
		double perim = (2 * this.length) + (2 * this.width);
		return perim;
	}

	
/////////////////////////////	
	
	/*
	 * template
	 * 
	 */
//	this. vs other. (this one vs that one)		
//	if two savings accounts, merged:
//	public void merge(SavingsAccount other) {
//		this.balance = this.balance + other.getBalance();
//		other.remove(other.getBalance());
//	}	
	
//	is it smaller than another rect? - other.	
	public boolean isSmaller(Rect otherR) {
		if (this.getArea() < otherR.getArea()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
/////////////////////////////	
	
	
//	is it a square?	
	public boolean isSquare() {
		if (this.length == this.width) {
			return true;
		}
		else {
			return false;
		}
	}

	
	/*
	 * template
	 * 
	 */
//	public static void main(String[] args) {
//		variable name = new instanciater (balance in cents, interest rate);
//		SavingsAccount my_account = new SavingsAccount(100, 0.5);
//		System.out.println(my_account.getBalance());
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect rectangle = new Rect(10, 20);
		System.out.println(rectangle.length);
		System.out.println(rectangle.width);
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getPerim());
//		test for whether this rect is smaller than another by area		
		System.out.println(rectangle.isSquare());
	
	}

}