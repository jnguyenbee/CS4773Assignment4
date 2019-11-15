package Elevator;

import ElevatorMediator.ElevatorMediator;

public class ElevatorFloorOne implements ElevatorState{

	Elevator elevator;
	ElevatorMediator temp;

	public ElevatorFloorOne(Elevator elevator)
	{
		this.elevator = elevator;
	}

	@Override
	public void press1() {
		// TODO Auto-generated method stub
		System.out.println("Nothing happens");
	    elevator.setElevatorState(elevator.getElevatorFirstFloor());
	}

	@Override
	public void press2() {
		// TODO Auto-generated method stub
		System.out.println("2 pressed ...at floor one");
		elevator.setElevatorState(elevator.getElevatorSecondFloor());
	}

	@Override
	public void press3() {
		// TODO Auto-generated method stub
		System.out.println("3 pressed ...at floor one");
		elevator.setElevatorState(elevator.getElevatorThirdFloor());
	}

}
