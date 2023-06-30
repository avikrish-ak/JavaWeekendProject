package day09;

public class ImportMobile implements Mobile_China,Mobile_India{

	public static void main(String[] args) {
		ImportMobile im = new ImportMobile();
		im.battery_china();
		im.battery_india();
		im.cpu_china();
		im.cpu_india();
		

	}

	@Override
	public void cpu_india() {
		System.out.println("4-core");
		
	}

	@Override
	public void battery_india() {
		System.out.println("5000mah");
		
	}

	@Override
	public void cpu_china() {
	System.out.println("3-core");
		
	}

	@Override
	public void battery_china() {
		System.out.println("5000mah");
		
	}

	@Override
	public void network() {
		Mobile_China.super.network();
	}

}
