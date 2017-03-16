import java.awt.Graphics;

import javax.swing.JPanel;


public class LifePanel extends JPanel {

	int[][] grid;
	public void displayGrid(int[][] gr) {
		// do something with gr.
		
		repaint();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		// tell g to draw lots of stuff :)
		if(grid == null)
			return;
		
	}
}
