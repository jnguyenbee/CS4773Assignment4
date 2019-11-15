package Elevator;

import ElevatorMediator.ElevatorConcreteMediator;
import ElevatorMediator.ElevatorMediator;

public class ElevatorFloorThree implements ElevatorState{

	Elevator elevator;
	
	public ElevatorFloorThree(Elevator elevator)
	{
		this.elevator = elevator;
	}
	

	@Override
	public void press1() {
		// TODO Auto-generated method stub
		System.out.println("1 pressed...at floor three");
		elevator.setElevatorState(elevator.getElevatorFirstFloor());
		System.out.println("*ding* The elevator arrives at Floor 2");
	}

	@Override
	public void press2() {
		// TODO Auto-generated method stub
		System.out.println("2 pressed...at floor three");
		elevator.setElevatorState(elevator.getElevatorSecondFloor());
		System.out.println("*ding* The elevator arrives at Floor 2");
	}

	@Override
	public void press3() {
		// TODO Auto-generated method stub
		System.out.println("Nothing happens");
	    elevator.setElevatorState(elevator.getElevatorThirdFloor());
	
	}

}
