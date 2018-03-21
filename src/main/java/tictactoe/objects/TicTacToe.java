package tictactoe.objects;

import java.util.ArrayList;

public class TicTacToe {

	private ArrayList<Character> game; 
	
	public TicTacToe() {
		game = new ArrayList<Character>();
	}
	
	public void playX(Integer x) {
		game.add(x, 'X');
	}
	
	public void playO(Integer x) {
		game.add(x, 'O');
	}
	
}
