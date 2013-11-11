package board;

import junit.framework.TestCase;

public class BoardTest extends TestCase {

	private Grid board = new Grid();

	public void testCreate() throws Exception {
		board.init(1, 1);
		assertTrue(board.getState(0, 0) == false);
	}

	public void testSetMine() throws Exception {
		board.init(1, 1);
		board.setMine(1);
		assertTrue(board.getState(0, 0) == true);
	}

}