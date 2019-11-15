package Elevator;

import ElevatorMediator.ElevatorConcreteMediator;
import ElevatorMediator.ElevatorMediator;

public class ElevatorFloorOne implements ElevatorState{

	Elevator elevator;
	ElevatorMediator temp;
	Boolean currentfloor;
	ElevatorMediator mediator;
	
	public ElevatorFloorOne(Elevator elevator)
	{
		mediator = new ElevatorConcreteMediator(elevator);
		this.elevator = elevator;
		this.setCurrentfloor(Boolean.TRUE);
		mediator.elevatorMove();
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
		System.out.println("*ding* The elevator arrives at Floor 2");
	}

	@Override
	public void press3() {
		// TODO Auto-generated method stub
		System.out.println("3 pressed ...at floor one");
		elevator.setElevatorState(elevator.getElevatorThirdFloor());
		System.out.println("*ding* The elevator arrives at Floor 3");
	}

	public Boolean getCurrentfloor() {
		return currentfloor;
	}

	public void setCurrentfloor(Boolean currentfloor) {
		this.currentfloor = currentfloor;
	}
}
