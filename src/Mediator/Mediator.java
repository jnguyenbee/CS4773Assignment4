package Mediator;

public class Mediator {
	private Door door;
	
	public Mediator ()
	{
		door = new Door();
	}
	public void pressClose() {
		if (door.isOpen()) {
			System.out.println("Doors are closed");
			door.close();
		}
		else
			door.close();
	}
	
	public void pressOpen() {
		if (door.isOpen()) {
			door.open();
		}
		else
			door.open();
	}
	
	public void start() {
		door.open();
	}
	
	public void stop() {
		door.close();
	}
}
