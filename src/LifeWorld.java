import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class LifeWorld extends JPanel {
	JFrame frame = new JFrame();

	int rows, cols;
	Dimension dim;
	Organism[][] orgGrid;
	
	public LifeWorld(int rows, int cols, Organism[][] org) {
		this(new Dimension(800, 600), rows, cols, org);
	}
	public LifeWorld(Dimension dimension, int row, int col, Organism[][] org) {
			this.setPreferredSize(dimension);
			this.rows = row;
			this.cols = col;
			dim = dimension;
			setLayout(new GridLayout(rows, cols, 3, 3));
			this.orgGrid = org;
	}
	
	private void makeGrid(Organism[][] org) {
		this.orgGrid = org;
		addButtons(rows);
	}
	
	public void display(Organism[][] grid) {
		// traverses the 2D array of ints and adds  things into the world corresponding
		// to the contents of gr.  When you add things to the world, they will show up
		// on the screen
		System.out.println("Displaying");
		makeGrid(grid);
		frame.setContentPane(this);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
//      g.setColor(getBackground());
//      g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.RED);
        for (int i = 0; i <= rows * rows; i++) {
            if (i % rows == 0) {
                int coordx = getWidth() * i / rows*rows;
                int coordy = getHeight() * i / rows*rows;
                g.drawLine(coordx, 0, coordx, getHeight());
                g.drawLine(0, coordy, getWidth(), coordy);
            }
        }
    }

    private void addButtons(int t) {
    	this.removeAll();
        JButton grid;
        for (int y = 0; y < t; y++) {
            for (int x = 0; x < t; x++) {
                grid = new JButton(x + "," + y);
                grid.setText("");
                grid.setPreferredSize(new Dimension(55, 55));
                if(orgGrid[y][x].getAlive()) {
                	grid.setBackground(Color.yellow);
                }
                else {
                	grid.setBackground(Color.black);
                }
                add(grid);

            }
        }
    }

	
}
