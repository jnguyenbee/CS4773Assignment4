package Elevator;

import ElevatorMediator.ElevatorMediator;

public class ElevatorFloorTwo implements ElevatorState{
	
	Elevator elevator;
	Boolean currentfloor;
	private ElevatorMediator mediator;
	
	public ElevatorFloorTwo(Elevator elevator)
	{
		this.elevator = elevator;
		this.setCurrentfloor(Boolean.TRUE);
	}
	
	@Override
	public void press1() {
		// TODO Auto-generated method stub
		System.out.println("1 pressed...at floor two ");
		elevator.setElevatorState(elevator.getElevatorFirstFloor());
		System.out.println("*ding* The elevator arrives at Floor 1");
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
		   System.out.println("*ding* The elevator arrives at Floor 3");
	}
	
	public Boolean getCurrentfloor() {
		return currentfloor;
	}

	public void setCurrentfloor(Boolean currentfloor) {
		this.currentfloor = currentfloor;
	}

}
