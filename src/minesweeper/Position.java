package minesweeper;

import java.util.ArrayList;

public interface Position {
	
	public abstract int getX();
	public abstract int getY();
	public abstract ArrayList<Position> getNeighbors(int row, int col);

}
