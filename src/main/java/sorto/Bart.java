//Author: alcides Sorto
//id Num: 2405
//class: CST 338
//description: this is a Bart object that can only return the roshambo value value of rock.
//date: 11/02/2014

package sorto;

public class Bart extends Player{


	public Bart(){
		this.setName("Bart");
		this.setRoshValue("Rock");
	}

	@Override
	public String generateRhoshambo() {

		return this.getRoshValue();

	}

}
