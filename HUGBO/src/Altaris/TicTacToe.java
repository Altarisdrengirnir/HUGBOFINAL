package Altaris;

public class TicTacToe
{
	private final int GRIDLINE = 3;
	public char grid[];
	public char turn;
	//Initial empty grid.
	public TicTacToe()
	{
		//           012345678
		this.grid = "---------".toCharArray();
		this.turn = 'X';
	}
	
	public String toString()
	{
		return new String(grid);
	}
	
	public static void main(String[] args)
	{
		TicTacToe ttt = new TicTacToe();
		for(int j = 0; j < ttt.GRIDLINE; j++)
		{
			for(int i = 0; i < ttt.GRIDLINE; i++)
			{
				System.out.print(ttt.grid[i]);
			}
			System.out.println();
		}
	}
	

}
