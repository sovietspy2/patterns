package creational.factorymethod;

public class Ship implements Transport {

	@Override
	public void deliver() {
		System.out.println("Delivering by ship");
	}
  
}