package javagram;

// diagram methods in flow chart

import javagram.filters.*;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Javagram {

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
		
		// TODO - prompt user for filter and validate input
		do {
			
//			display filter menu
//			make choice for filter via int (1 - 3)
//			1 = BlueFilter
//			2 = GreenFilter
//			3 = RedFilter
			
		}
		
		
		
		// TODO - pass filter ID int to getFilter, and get an instance of Filter back 
//		GreenFilter filter = getFilter();			
		Filter filter = getFilter();

		// filter and display image
		Picture processed = filter.process(picture);        // why do I need this here if it's in Filter interface?
		processed.show();
		
		System.out.println("Image successfully filtered");
		
		// save image, if desired
		
		System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
		String fileName = in.next();
		
		// TODO - if the user enters the same file name as the input file, confirm that they want to overwrite the original
		
//		if (fileName.equals(current fileName)) { prompt confirmation of overwrite }
		
		if (fileName.equals("exit")) {
			System.out.println("Image not saved");
		} else {
			String absFileName = dir + File.separator + fileName;
//			if (absFileName == existing file name) ask to confirm overwrite
			processed.save(absFileName);
			System.out.println("Image saved to " + absFileName);
		}	
		
		// close input scanner
		in.close();
	}
	
	// TODO - refactor this method to accept an int parameter, and return an instance of the Filter interface
	// TODO - refactor this method to thrown an exception if the int doesn't correspond to a filter
//	private static GreenFilter getFilter() {
	private static Filter getFilter() {
		
		
//	private static int displayFilterMenu(Scanner in) {
		
		int choice = 0;
		System.out.println("Please choose a number from the coded options below:");
		System.out.println("1 = BlueFilter");
		System.out.println("2 = GreenFilter");
		System.out.println("3 = RedFilter");
		
//		do {
//			try {
////				return choice.nextInt();
//				return in.nextInt();
//			}
//			catch (InputMismatchException e) {
//				System.out.println("Please enter a valid integer");
//				return 0;
//			} while (choice == 0);
		
//		change choice value to 1, 2, or 3
//		if not, re-prompt change in choice value
//		///////////
	
//		}
		
		
		while (choice < 1 || choice > 3) {
//		prompt change of choice
		
		// TODO - create some more filters, and add logic to return the appropriate one
		if (choice == 1) {
			return new BlueFilter();
		}
		if (choice == 2) {
			return new GreenFilter();
		}
		if (choice == 3) {
			return new RedFilter();
		}
		else {
			// re-prompt
		}
		}
//		return new GreenFilter();      // not really...you want to return the choice filter //////////////
//		return new Filter();
		

	}
//	for saving without overwriting...
//	if (filename.equals("exit)) { x = "y";}...
	
}