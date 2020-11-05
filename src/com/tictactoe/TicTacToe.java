package com.tictactoe;

import java.util.Scanner;

public class TicTacToe {
	static char[] board = new char[10];
	static char player = ' ';
	char computer = ' ';

	public static void main(String[] args) {

		char computer = ' ';
		System.out.println("Welcome to TicTacToe");

		player = selectXorO();
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
	private static char selectXorO() {
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

}
