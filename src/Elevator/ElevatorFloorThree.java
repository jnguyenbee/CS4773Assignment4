package Elevator;
import Mediator.Button;


public class ElevatorFloorThree implements ElevatorState{

	Elevator elevator;
	public ElevatorFloorThree(Elevator elevator)
	{
		this.elevator = elevator;
	}

	@Override
	public void press1() {
		// TODO Auto-generated method stub
		System.out.println("1 pressed ");
		elevator.getButton().pressClose();
		System.out.println("Going Down");
		System.out.println("*ding* The elevator arrives at Floor 1");
		System.out.println("Doors are opened");
		elevator.getButton().pressOpen();

		elevator.setElevatorState(elevator.getElevatorFirstFloor());
	}

	@Override
	public void press2() {
		// TODO Auto-generated method stub
		System.out.println("2 pressed ");
		elevator.getButton().pressClose();
		System.out.println("Going down");
		System.out.println("*ding* The elevator arrives at Floor 2");
		System.out.println("Doors are opened");
		elevator.getButton().pressOpen();

		elevator.setElevatorState(elevator.getElevatorSecondFloor());
	}

	@Override
	public void press3() {
		System.out.println("3 pressed ");
		elevator.getButton().pressClose();
		System.out.println("Nothing happens");
	    elevator.setElevatorState(elevator.getElevatorThirdFloor());
	}

}
