package javagram;

// diagram methods in flow chart

import javagram.filters.*;

import java.io.File;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class Javagram {

	
	private static Filter getFilter() {
//		Filter getFilter() {
		Scanner s = new Scanner(System.in);	
//		int choice = 0;      // this results in an unending throw-error loop
		int choice = s.nextInt();

		while (choice < 1 || choice > 4) {
//			prompt change of choice
				System.out.println("Please choose a valid integer.");
				choice = s.nextInt();
			}
		
		// TODO - create some more filters, and add logic to return the appropriate one
			if (choice == 1) {
				System.out.println("Yo");
				return new BlueFilter();
			}
			if (choice == 2) {
				System.out.println("Aloha");
				return new GreenFilter();
			}
			if (choice == 3) {
				System.out.println("Hello");
				return new RedFilter();
			}
			if (choice == 4) {
				System.out.println("Güten Tog");
				return new NoFilter();
			}
			else {
			// re-prompt? - needed?
				
//			return new GrayScaleFilter();
//			return new GreenFilter();      // not really...you want to return the choice filter //////////////
				System.out.println("GAZPACHO?!");

			}
//		getFilter();
		return new NoFilter(); // make new filter class for return original pic
	}
	
	

	private static int displayFilterMenu(Scanner in) {
		
//		Scanner s = new Scanner(System.in);	
		int choice = 0;
//		int choice = s.nextInt();      // if you do this, the menu will not display at all
		System.out.println("Please choose a number from the coded options below:");
		System.out.println("1 = BlueFilter");
		System.out.println("2 = GreenFilter");
		System.out.println("3 = RedFilter");
		System.out.println("4 = NoFilter");
		
//		getFilter(); - redundant
		
////		do {
//			try {
////				while (choice )   // while choice is legal...
//				while (choice < 1 || choice > 4) {
//					getFilter();
//				}
////				return choice.nextInt();
//				return in.nextInt();
//			}
//			catch(InputMismatchException e) {
//				System.out.println("Please enter a valid integer");
//				return choice;
//			}
//		change choice value to 1, 2, or 3
//		if not, re-prompt change in choice value
//		///////////
//		}
		return 0;
	}
	
	
	
	public static void main(String[] args) {

		// Create the base path for images		
		String[] baseParts = {System.getProperty("user.dir"), "images"};
		String dir = String.join(File.separator, baseParts);
		String relPath = "";  // or = null
		Picture picture = null;
		Scanner in = new Scanner(System.in);
		
		// prompt user for image to filter and validate input
		do {
			
			String imagePath = "path not set";
			
			// try to open the file
			try {
				
				System.out.println("Image path (relative to " + dir + "):");
				relPath = in.next();
				
				String[] relPathParts = relPath.split(File.separator);
				imagePath = dir + File.separator + String.join(File.separator, Arrays.asList(relPathParts));
				
				picture = new Picture(imagePath);
				
			} catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}
			
		} while(picture == null);
		System.out.println("Okay, we've got the picture.");
		// TODO - prompt user for filter and validate input
//		do {
		displayFilterMenu(in);
//		} while(picture == picture);
//		System.out.println("Are we stuck?");

		// TODO - pass filter ID int to getFilter, and get an instance of Filter back 
//		GreenFilter filter = getFilter();			
		Filter filter = getFilter();

		// filter and display image
		Picture processed = filter.process(picture);        // why do I need this here if it's in Filter interface? - it's not the same
		processed.show();
		
		System.out.println("Image successfully filtered");
		
		
		// SAVING IMAGE...
		// save image, if desired
		
		System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
		String fileName = in.next();
//		String overwrite = in.next();        // this must be INSIDE the if .equals statement below to be waited for and considered by comp
		
		// TODO - if the user enters the same file name as the input file,
		//    confirm that they want to overwrite the original
		
//		if (fileName.equals("exit")) {           // for some reason, input needs to include "" to be accepted in program run up here...
//			System.out.println("Image not saved");
//		}
//		if (fileName.equals(current fileName)) { prompt confirmation of overwrite }
		
//		for saving without overwriting...
//		if (filename.equals("exit)) { x = "y";}...
//		else if (fileName.equals(relPath)) {
		if (fileName.equals(relPath)) {
//			System.out.println("Are you sure you want to overwrite original image? Type y or n.");  // there's no pause for input after this Q appears when there's no overwrite var introed afterwards...
			System.out.println("Are you sure you want to overwrite original image? Type 1 for yes or 2 for no.");
//			String overwrite = in.next();   // using String here is confused with the fileName (also an input String)
			int overwrite = in.nextInt();   // using int instead of String differentiates overwrite from fileName
//			if (overwrite == "y") {
			if (overwrite == 1) {
				System.out.println("Did you hear me? It was a yes.");
				String absFileName = dir + File.separator + fileName;
				processed.save(absFileName);
				System.out.println("Image saved to " + absFileName);
			} else if (overwrite == 2) {
//			} else if (overwrite == "n") {
				System.out.println("Image not saved");
			} else {                                          // if overwrite input is a String, InputMismatchException thrown
				System.out.println("You don't understand?");  // (op) I want it to try again...maybe put all this in a method and call the method again??
				System.out.println("Image not saved");
			}
		} 

//		System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
//		String fileName = in.next();
		
		
//		THIS IF IS VITAL FOR THE ABOVE COMMAND SUGGESTING "exit" to be able to follow through
		if (fileName.equals("exit")) {
			System.out.println("Image not saved");
		}
//		GIVEN CODE - IF YOU IGNORE THE OVERWRITE STATEMENTS, THE COMMENTED CODE BELOW WILL AUTOMATICALLY SAVE THE JPG
//		else {
//			String absFileName = dir + File.separator + fileName;
//		
////			if (absFileName == existing file name) ask to confirm overwrite
//			processed.save(absFileName);
//			System.out.println("Image saved to " + absFileName);
//		}	
		
		// close input scanner
		System.out.println("We end here.");
		in.close();
		System.out.println("Now what? It's still running...");  // the program doesn't stop until I "quit" from the Javagram file
//		System.out.println(in.next());       // this gives a "Scanner closed" illegal state exception error
	}            // this is the curly attached to the beginning of main...
	
}










	// TODO - refactor this method to accept an int parameter, and return an instance of the Filter interface
	// TODO - refactor this method to thrown an exception if the int doesn't correspond to a filter
//	private static GrayScaleFilter get Filter() {
	//	private static GreenFilter getFilter() {
