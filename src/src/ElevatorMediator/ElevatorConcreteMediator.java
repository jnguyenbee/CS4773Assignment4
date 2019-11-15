package ElevatorMediator;

import Elevator.Elevator;
import Elevator.ElevatorFloorOne;
import Elevator.ElevatorState;

public class ElevatorConcreteMediator implements ElevatorMediator{

	ElevatorFloorOne one;
	
	public ElevatorConcreteMediator(Elevator elevator) {
		// TODO Auto-generated constructor stub
		if( elevator == null)
			System.out.print("hello");
	}

	@Override
	public void elevatorMove() {
		// TODO Auto-generated method stub
	//	System.out.println("movin");
	//	if(one.getCurrentfloor())
	//		System.out.println("hello");
		
	}
	

}
