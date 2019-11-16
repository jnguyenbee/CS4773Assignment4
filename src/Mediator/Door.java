package Mediator;

public class Door {
	private boolean stateOpen;
	
	public Door() {
		stateOpen = true;
	}
	
	public boolean isOpen() {
		return stateOpen;
	}
	
	public void open() {
		stateOpen = true;
	}
	
	public void close() {
		stateOpen = false;
	}
}
