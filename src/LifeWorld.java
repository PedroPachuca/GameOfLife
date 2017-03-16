import info.gridworld.grid.BoundedGrid;
import info.gridworld.world.World;


public class LifeWorld extends World {

	public LifeWorld(int rows, int cols) {
		super(new BoundedGrid(rows, cols));
	}
	public void display(Organism[][] grid) {
		// traverses the 2D array of ints and adds  things into the world corresponding
		// to the contents of gr.  When you add things to the world, they will show up
		// on the screen
		for(Organism[] arr: grid) {
			for(Organism curr: arr) {
				this.add(getRandomEmptyLocation(), curr);
			}
		}
		
	}
	
}
