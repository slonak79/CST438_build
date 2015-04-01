//Author: alcides Sorto
//id Num: 2405
//class: CST 338
//description: this is a Lisa object that can return rohambo values.
//date: 11/02/2014

package sorto;

import java.util.Random;

public class Lisa extends Player{

	private String[] choices = {"Rock","Paper","Scissors"};

	public Lisa(){

		this.setName("Lisa");


	};

	@Override
	public String generateRhoshambo() {
		Random rand = new Random();
		int numChoice = rand.nextInt(3);

		switch(numChoice){
			case 0:
				this.setRoshValue(choices[numChoice]);

				break;
			case 1:
				this.setRoshValue(choices[numChoice]);
				break;
			case 2:
				this.setRoshValue(choices[numChoice]);
				break;
			default:
				break;
		}


		return this.getRoshValue();
	}



}
