
import java.io.File;
import java.util.Scanner;

import javax.swing.JFrame;


public class LifeAsWeKnowIt {
	
	private int displayType = 1;
	private int rows;

	private int cols;
	int[][] grid;// this is how you declare a 2D array of int.  What if you wanted 
				 // a 2D array of String?  
	
	JFrame frame = new JFrame("Life!");// to be used if displayType is not 1 or 2
	
	LifeWorld world;// Gridworld world.  This was part of the APCS curriculum until 
	                // 2015 Exam.  It is a nice class for displaying things that are
					// typically displayed in grid fashion.
	
	
	LifePanel panel;// this is a type of JPanel, and thus has all functionality of one.
	 				// I have provided this class for you.  It has a couple of functions
					// but you can add more, if you like.
	
	public static void main(String[] args) {
		new LifeAsWeKnowIt().start();

	}

	

	private void start() {
		int displayType = promptDisplay();
		
		loadLife();
		show();
		for(int steps= 0; steps < 10; steps++) {
			
			step();// advances to the next generation
			show();// displays current gen
			pause();// pauses... may change according to the display type
		}
	}

	private int promptDisplay() {
		// TODO Auto-generated method stub
		return 1;
	}

	private void pause() {
		if(this.displayType==1) {
			System.out.println("Hit enter to continue");
			new Scanner(System.in).nextLine();
		}
		// otherwise, use the buttons in the other interface
	}

	private void step() {
		// takes the organisms from one generation to the next, instantaneously
		
	}

	private void show() {
		if(displayType == 1) {
			dispConsole();
		}
		else if(this.displayType==2) {
			displayGridWorld();
		}
		else {
			displayCool();
		}
		
	}

	private void displayCool() {
		// checks to see if the LifePanel is null.  If so, makes a new one and adds it 
		// to the Jframe, then asks the JFrame to setVisible(true)  
		// Then, asks the LifePanel to display the grid;
		
	}

	private void displayGridWorld() {
		// checks to see if the world is null, first.  If so, makes a world.  
		// simply ask the LifeWorld to display the contents of gr
		
		
	}

	private void dispConsole() {
		// go through the 2D array, displaying the life or not
		
	}

	private void loadLife() {
		// inputs the file containing info about the grid.  This file contains the size
		// (rows and cols) of the grid, as well as the locations of the organisms.
		
		File f = getFile();
		Scanner scan = null;
		try {
			scan = new Scanner(f);
		}
		catch(Exception e) {
			System.out.println("Ouch!  Problem with file!! "+e);
		}
		if(scan == null)
			loadLife();
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		this.rows = rows;
		this.cols = cols;
		while(scan.hasNext()) {
			System.out.println("Still something to scan...");
		}
	}

	private File getFile() {
		// You can substitute other approaches of acquiring a file
		return new File("life100.txt");
	}

}