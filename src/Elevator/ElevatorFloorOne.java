package Elevator;

import ElevatorMediator.ElevatorMediator;
import Mediator.Button;

public class ElevatorFloorOne implements ElevatorState{

	Elevator elevator;
	ElevatorMediator temp;

	public ElevatorFloorOne(Elevator elevator)
	{
		this.elevator = elevator;
		
	}

	@Override
	public void press1() {
		System.out.println("1 pressed ");		
		elevator.getButton().pressClose();
		System.out.println("Nothing happens");
	    elevator.setElevatorState(elevator.getElevatorFirstFloor());
	}

	@Override
	public void press2() {
		System.out.println("2 pressed ");		
		elevator.getButton().pressClose();
		System.out.println("Going Up");
		System.out.println("*ding* The elevator arrives at Floor 2");
		System.out.println("Doors are opened");
		elevator.getButton().pressOpen();

		elevator.setElevatorState(elevator.getElevatorSecondFloor());
	}

	@Override
	public void press3() {
		System.out.println("3 pressed ");
		elevator.getButton().pressClose();
		System.out.println("Going Up");
		System.out.println("*ding* The elevator arrives at Floor 3");
		System.out.println("Doors are opened");
		elevator.getButton().pressOpen();

		elevator.setElevatorState(elevator.getElevatorThirdFloor());
	}
}
