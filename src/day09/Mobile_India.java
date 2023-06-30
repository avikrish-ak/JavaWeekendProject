package day09;

public interface Mobile_India {
	
	
	public void cpu_india();
	public void battery_india();
	
	default void network()
	{
		System.out.println("4G/5G");	
	}

}
