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
		System.out.println("1 pressed... ");
		temp.elevatorArrived(elevator);
	    //elevator.setElevatorState(elevator.getElevatorNoneHappen());
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
