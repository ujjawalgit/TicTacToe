package com.game;

public class TicTacToeGame {

    /*creating board with empty spaces to play  game*/
    private static char[] createBoard() {
        char[] board = new char[10];
        for (int i = 1; i < 10; i++) {
            board[i] = ' ';
        }
        return board;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to  TicTacToeGame");
        /*createBoard method will create board with empty spaces*/
        char[] board = createBoard();
    }
}