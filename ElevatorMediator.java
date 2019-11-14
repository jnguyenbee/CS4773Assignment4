package ElevatorMediator;

import Elevator.Elevator;

public interface ElevatorMediator {

	public void elevatorDoorClose(Elevator elevator);
	public void elevatorDoorOpen(Elevator elevator);
	public void elevatorArrived(Elevator elevator);
}
