package ElevatorMediator;

import Elevator.Elevator;

public interface ElevatorMediator {

	public void elevatorDoorClose(Elevator elevator, String direction, String floor);
	public void elevatorDoorOpen(Elevator elevator);
	public void elevatorArrived(Elevator elevator, String floor);
}
