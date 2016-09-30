
public class Baseball_Player {

	private String name;
	private int jerseyNum;
//	private type of hitter - right, left, or both - String (or double-boolean)
	private String hitter;
	private int hits;
	private int RBIs;
	private int numGames;
	private int runs;
	private int totRBIs;
	
	
	/*
	 * template
	 * 
	 */
	// start Savings Account - instantiate Savings Account object
//		public SavingsAccount(Integer balance, double interest_rate) {
//			this.balance = balance;
//			this.interest_rate = interest_rate;
//		}
	
//  CONSTRUCTOR:	
//	instantiate baseball player obj
	public Baseball_Player(String name, int jerseyNum, String hitter) {
		this.name = name;
		this.jerseyNum = jerseyNum;
//		private type of hitter - right, left, or both
		this.hitter = hitter;
//		make defaults (all 0s) for quantitative attributes:		
		this.hits = 0;
		this.RBIs = 0;
		this.numGames = 0;
		this.runs = 0;
		this.totRBIs = 0;
	}
		
// METHODS	

//	get name
	public String getName() {
		String name = this.name;
		return name;
	}
	
	
//	get jersey number
	public int getJersey() {
		int jerseyNum = this.jerseyNum;
		return jerseyNum;
	}
	
	
//	which side hitter? right, left, or both?
//	if (this.hitter == right) {
//		return right;
//	}
//	else if (this.hitter == left) {
//		return left;
//	}
//	else if (this.hitter == right AND this.hitter == left) {
//		return both;
//	}
	public String getHitter() {
		String hitter = this.hitter;
		return hitter;
	}
	
	
//	get number of hits
	public int getHits() {
		int hits = this.hits;
		return hits;
	}
	
//	get number of RBIs earned
	public int getRBIs() {
		int RBIs = this.RBIs;
		return RBIs;
	}	
	
	
//	get number of games played
	public int getNumGames() {
		int numGames = this.numGames;
		return numGames;
	}
	
	
// somehow diff from above single-game totals?
//	get number of all runs from all games played
	public int getRuns() {
		int runs = // for each game, getRuns(), add them tog, store in runs
				// getRuns()
		return runs;
	}
	
	
// somehow diff from above single-game totals?	
//	get number of all RBIs earned from all games played
	public int getTotRBIs() {
		int totRBIs = // for each game, getRBIs() and add them together, save in totRBIs
				// getRBIs()
		return totRBIs;
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
		Baseball_Player basePl = new Baseball_Player("Jorge", 42, "lefty");
		System.out.println(basePl.getName());
		System.out.println(basePl.getJersey());
		System.out.println(basePl.getHitter());
//		Don't need to enter quantitative data into params above unless...
//		  ...it's different from the instantiate default (0)
		System.out.println(basePl.getHits());
		System.out.println(basePl.getRBIs());
		System.out.println(basePl.getNumGames());
//		System.out.println(basePl.getRuns());
//		System.out.println(basePl.getTotRBIs());
	}

}