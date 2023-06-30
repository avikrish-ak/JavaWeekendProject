package day09;

public class Tata_Punch extends Car{

	public static void main(String[] args) {
		Tata_Punch tp = new Tata_Punch();
		tp.carWheels();
		tp.engine();

	}

	@Override
	void engine() {	
		System.out.println("1000cc");
	}

	@Override
	void performance() {
		System.out.println("16");
		
	}

	@Override
	void speed() {
		System.out.println("200 km/h");
		
	}
}
