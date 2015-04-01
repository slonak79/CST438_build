//Author: alcides Sorto
//id Num: 2405
//class: CST 338
//description: this is an abstract object that creates teh base for a roshambo player
//date: 11/02/2014



package sorto;

public abstract class Player {
	private String name;
	protected String roshValue;


	public abstract String generateRhoshambo();


	public void setRoshValue(String rosh) {
		this.roshValue = rosh;
	}

	public String getRoshValue(){
		return this.roshValue;
	};

	public String getName() {
		return this.name;
	}


	public void setName(String name) {
		this.name = name;
	}


}
