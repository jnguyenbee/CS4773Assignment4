package ElevatorMediator;

import Elevator.Elevator;

public class ElevatorConcreteMediator implements ElevatorMediator{


	@Override
	public void elevatorDoorClose(Elevator elevator, String direction, String floor) {
		// TODO Auto-generated method stub
		System.out.println("Doors are closed ");
	}

	@Override
	public void elevatorDoorOpen(Elevator elevator) {
		// TODO Auto-generated method stub
		System.out.println("Doors are open ");
	}

	@Override
	public void elevatorArrived(Elevator elevator, String floor) {
		// TODO Auto-generated method stub
		System.out.println("*ding* The elevator arrives at Floor " + floor );

	}



}
