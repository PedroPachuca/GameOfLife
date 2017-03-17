import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;


public class LifeWorld extends World {

	public LifeWorld(int rows, int cols) {
		super(new BoundedGrid(rows, cols));
	}
	public void display(Organism[][] grid) {
		// traverses the 2D array of ints and adds  things into the world corresponding
		// to the contents of gr.  When you add things to the world, they will show up
		// on the screen
		for(int row = 0; row < grid.length; row++) {
			for(int col = 0; col < grid[row].length; col++) {
				this.add(new Location(row, col), grid[row][col].getAlive());
				
			}
		}
		this.show();
		
	}
	
}
