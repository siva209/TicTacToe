package com.tictactoe;

import java.util.Scanner;

public class TicTacToe {
	static char[] board = new char[10];
	static char player = ' ';
	static char computer = ' ';

	public static void main(String[] args) {
		char[]board=createboard();
		System.out.println("Welcome to TicTacToe");

		player = inputOption();
		showBoard();
		computer = player == 'X' ? 'O' : 'X';
		System.out.println(player + " is player " + computer + " is computer");

	}

	/* UC1 create board */
	private static char[] createboard() {
		System.out.println("welcome tictac game");
		char[] board = new char[10];
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
		return board;
	}

	/* Uc2  choosing letters for user and computer */
	private static char inputOption() {
		char player = 'X';
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Select either X or O");
			player = scan.next().toUpperCase().charAt(0);
			if (player == 'X' || player == 'O') {
				return player;
			} else {
				System.out.println("Invalid choice,Enter again");
				continue;
			}
		}
	}

	/* Uc3 Display the board */
private static void showBoard() {
	for (int i = 1; i < board.length; i = i + 3) {
		System.out.println("|" + board[i] + " |" + board[i + 1] + " |" + board[i + 2] + " |");
		System.out.println("-----------");
	}
}
}