package teitactoe;

import java.util.Scanner;

public class TicTacToe {
	public static final int X=1, O=-1 , EMPTY = 0;
	private int board[][]=new int[3][3];
	private int player; 
	
	public TicTacToe() {
		clearBoard();
	}
	
	public void clearBoard() {
		for (int i=0; i<3;i++)
			for (int j=0; j<3;j++)
				board[i][j]=0;
		player = X;
	}
	
	public void putMark(int i, int j) throws IllegalArgumentException{
		if (i<0 || i>2 || j<0 || j>2)
			throw new IllegalArgumentException("Invalid indices");
		if (board[i][j]!=EMPTY)
			throw new IllegalArgumentException("position not empty");
		board[i][j]=player;
		player = -player;
	}
	
	public boolean isWin(int mark) {
		return (board[0][0]+board[0][1]+board[0][2]==3*mark || board[1][0]+board[1][1]+board[1][2]==3*mark || board[2][0]+board[2][1]+board[2][2]==3*mark || board[0][0]+board[1][0]+board[2][0]==3*mark || board[0][1]+board[1][1]+board[2][1]==3*mark || board[0][2]+board[1][2]+board[2][2]==3*mark || board[0][0]+board[1][1]+board[2][2]==3*mark || board[0][2]+board[1][1]+board[2][0]==3*mark);
	}
	
	public int winner() {
		if (isWin(X)) return X;
		else if (isWin(O)) return O;
		else return 0;
	}
	
	public String print() {
		String output="";
		for (int i=0; i<3;i++)
		{
			
			for (int j=0; j<3;j++)
				switch (board[i][j]) {
				case X: output += "|X";
				break;
				case O: output += "|O";
				break;
				case EMPTY: output += "| ";
				}
				
			output += "|\n";
		}
		return output;
	}
	

	public void Play() {
		
		while (true) {
			System.out.println(this.print());
			System.out.print("choose the location: ");
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter the row");
			
			int row = in.nextInt();
			
			System.out.println("enter the column");
			int column = in.nextInt();
			
			this.putMark(row, column);
			
			
			if (this.isWin(X) || this.isWin(O) || board.length == 9) {
				System.out.println("Tie");
				break;
			}
			
		}
	}

}
