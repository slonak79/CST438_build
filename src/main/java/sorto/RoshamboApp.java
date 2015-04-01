//Author: alcides Sorto
//id Num: 2405
//class: CST 338
//description: this file allows a user to play roshambo versus two computer players, Bart and Lisa.
//date: 11/02/2014

package sorto;

import java.util.Scanner;

public class RoshamboApp {


	public static void main(String[] args) {
		Bart b = new Bart();
		Lisa l = new Lisa();
		String playerName = "";
		String[] pChoice = {"Rock","Paper","Scissors"};
		String letterChoice = "z";
		String versusPlayer = "";
		int winner = 0;
		String lisaChoice = "";
		String continuar = "n";


		Scanner in = new Scanner(System.in);

		System.out.print("Enter your name:   ");
		playerName = in.nextLine();

		System.out.printf("\nHi, %s\n", playerName);

		////////////loop starts here ///////////////////

		System.out.print("\nWould you like to play Bart or Lisa? (B/L) :   "    );
		versusPlayer = in.nextLine().toLowerCase();
////////////loop starts here ///////////////////
		do{
		System.out.print("\nRock, Paper, Scissors? (R/P/S) :   "    );
		letterChoice = in.nextLine().toLowerCase();

		if(letterChoice.equals("r")){
			letterChoice = pChoice[0];
		}
		else if(letterChoice.equals("p")){
			letterChoice = pChoice[1];

		}
		else{
			letterChoice = pChoice[2];
		}


		if(versusPlayer.equals("b")){

				winner = whoWin(b.getRoshValue(),letterChoice);

				switch(winner){
					case 0:
						System.out.printf("%s: %s",playerName,letterChoice);
						System.out.printf("\n%s: %s","Bart","rock");
						System.out.print("\nDraw!");
						break;
					case 1:
						System.out.printf("%s: %s",playerName,letterChoice);
						System.out.printf("\n%s: %s","Bart","rock");
						System.out.println("\nBart wins!");
						break;
					case 2:
						System.out.printf("%s: %s",playerName,letterChoice);
						System.out.printf("\n%s: %s","Bart","rock");
						System.out.printf("\n%s wins!\n", playerName);
						break;
					default:
						break;
				}


		}
		else{
			lisaChoice = l.generateRhoshambo();
			winner = whoWin(lisaChoice,letterChoice);

			switch(winner){
				case 0:
					System.out.printf("%s: %s",playerName,letterChoice);
					System.out.printf("\n%s: %s","Lisa",lisaChoice);
					System.out.println("\nDraw!");
					break;
				case 1:
					System.out.printf("%s: %s",playerName,letterChoice);
					System.out.printf("\n%s: %s","Lisa",lisaChoice);
					System.out.println("\nLisa wins!\n");
					break;
				case 2:
					System.out.printf("%s: %s",playerName,letterChoice);
					System.out.printf("\n%s: %s","Lisa",lisaChoice);
					System.out.printf("\n%s wins!\n", playerName);
					break;
				default:
					break;
				}


			}

			System.out.print("\nPlay again? (Y/N) : ");
			continuar = in.nextLine().toLowerCase();

		}while(continuar.equals("y"));

		System.out.println("\nBye!");

	}


	public static int whoWin(String SimpsonKids, String player){


		if(SimpsonKids.equals(player)){
			return 0;
		}
		else if(SimpsonKids.equals("Scissors") && player.equals("Paper")){
			return 1;
		}
		else if(SimpsonKids.equals("Rock") && player.equals("Scissors") ){
			return 1;
		}
		else{
			return 2;
		}
	}


}
