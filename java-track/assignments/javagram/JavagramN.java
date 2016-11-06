package javagram;

import javagram.filters.*;

import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class JavagramN {

//	add in picture path routing
	
	public class FilterMenu {
		private ArrayList <Filter> filters;
		private Scanner s;
		
		public static void main(String[] args) {
			int x = 0;
			FilterMenu fm = new FilterMenu();
			do {
				x = fm.startMenu();
				fm.processInput(x);
			} while (x != 5);
		public FilterMenu() {
			s = new Scanner(System.in);
			filters = new ArrayList<Filter>();
		public int startMenu() {
			System.out.println("Welcome to the filter menu!");
			System.out.println("Here are your choices, listed below:");
			System.out.println("Please choose a valid integer to choose the filter you desire.");
			int choice = s.nextInt();
			while (choice < 0 || choice > 5) {
//				throw an error and reprompt:
				System.out.println("Please choose a valid integer.");
				choice = s.nextInt();
			}
			return choice;
			}
		public void processInput(int choice) {
			if (choice == 1) {
//				display BlueFilter
				return new BlueFilter();
			}
			else if (choice == 2) {
//				display GreenFilter
				return new GreenFilter();
			}
			else if (choice == 3) {
//				display RedFilter
				return new RedFilter();
			}
			else if (choice == 4) {
//				display GrayScaleFilter
				return new GrayScaleFilter();
			}
			else {
//				exit the program??
			}
//		private void displayFilter() {
			
//		}
		}
		}
		}
			
		
	}
	
	
	
	

		// TODO Auto-generated method stub

	

}
