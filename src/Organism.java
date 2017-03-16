
public class Organism {
		
		int x, y;
		boolean alive;
		public Organism(int x, int y) {
			this.x = x;
			this.y = y;
			alive = true;
		}
		public boolean getAlive() {
			return alive;
		}
		public void setAlive(boolean set) {
			alive = set;
		}
}
