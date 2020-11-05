package com.tictactoe;

public class TicTacToe {
	public static void main(String[] args) {
		char[]board=createboard();
	}

	/* UC1 create board */
	private static char[]createboard(){
		System.out.println("welcome tictac game");
		char []board=new char[10];
		for(int i=1;i<10;i++) {
			board[i]=' ';
		}
		return board;
	}

}
