package Elevator;

public class ElevatorFloorThree implements ElevatorState{

	Elevator elevator;
	
	public ElevatorFloorThree(Elevator elevator)
	{
		this.elevator = elevator;
	}
	

	@Override
	public void press1() {
		// TODO Auto-generated method stub
		System.out.println("1 pressed... ");
	}

	@Override
	public void press2() {
		// TODO Auto-generated method stub
		System.out.println("2 pressed... ");
	}

	@Override
	public void press3() {
		// TODO Auto-generated method stub
		System.out.println("3 pressed... ");
	}

}
