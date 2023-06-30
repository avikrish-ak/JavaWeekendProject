package day09;

public interface Mobile_China {
	
	
	public void cpu_china();
	public void battery_china();
	
	default void network()
	{
		System.out.println("4G/5G");	
	}

}
