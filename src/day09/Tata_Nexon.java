package day09;

public class Tata_Nexon extends Car{

	public static void main(String[] args) {
		Tata_Nexon tn = new Tata_Nexon();
		tn.engine();
		tn.carWheels();

	}

	@Override
	void engine() {	
		System.out.println("1100cc");
	}

	@Override
	void performance() {
		System.out.println("18");	
	}

	@Override
	void speed() {
		System.out.println("210 km/h");
		
	}

}
