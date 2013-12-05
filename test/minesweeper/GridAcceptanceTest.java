package minesweeper;

import static minesweeper.GridTest.*;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class GridAcceptanceTest {

	@Test
	public void 모든_스퀘어_폭탄이_아닐_경우() {
		Grid grid = THREE_BY_THREE;
		grid.openSquare(Position.create(2, 2));
		View view = new View();
		String actual = view.render(grid);
		assertThat(actual, is("000\n000\n000\n"));
	}

}
