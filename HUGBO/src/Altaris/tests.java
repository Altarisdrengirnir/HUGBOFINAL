package Altaris;

import static org.junit.Assert.*;

import org.junit.Test;


public class tests
{
	@Test
	public void testNew() throws Exception
	{
		TicTacToe ttt = new TicTacToe();
		//			  012345678
		assertEquals("---------", ttt.toString());
		assertEquals('X', ttt.turn);
	}
	
	
	
	
}
