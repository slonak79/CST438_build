package sorto;


import static org.junit.Assert.*;

import org.junit.Test;

import sorto.RoshamboApp;

public class whoWinTest {

	@Test
	public void equalTest() {

		assertEquals(0, RoshamboApp.whoWin("rock","rock"));
		assertEquals(0, RoshamboApp.whoWin("paper","paper"));
		assertEquals(0, RoshamboApp.whoWin("scissors","scissors"));
	}

	@Test
	public void simpsonKidWinTest() {

		assertEquals(1, RoshamboApp.whoWin("Scissors","Paper"));
		assertEquals(1, RoshamboApp.whoWin("Rock","Scissors"));

	}

	@Test
	public void playerWinTest() {

		assertEquals(2, RoshamboApp.whoWin("papaer","Scissors"));
		assertEquals(2, RoshamboApp.whoWin("Scissors","Rock"));

	}

}
