package Elevator;

public class ElevatorFloorTwo implements ElevatorState{

	Elevator elevator;

	public ElevatorFloorTwo(Elevator elevator)
	{
		this.elevator = elevator;
	}

	@Override
	public void press1() {
		// TODO Auto-generated method stub
		System.out.println("1 pressed...at floor two ");
		elevator.setElevatorState(elevator.getElevatorFirstFloor());
	}

	@Override
	public void press2() {
		// TODO Auto-generated method stub
		System.out.println("Nothing happens");
	    elevator.setElevatorState(elevator.getElevatorSecondFloor());
	}

	@Override
	public void press3() {
		// TODO Auto-generated method stub
		System.out.println("3 pressed...at floor two ");
		elevator.setElevatorState(elevator.getElevatorThirdFloor());
	}

}
