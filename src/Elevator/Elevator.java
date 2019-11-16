
package Elevator;

import Mediator.Button;

public class Elevator implements ElevatorState{

	private ElevatorState state;
	private ElevatorFloorOne firstFloor;
	private ElevatorFloorTwo secondFloor;
	private ElevatorFloorThree thirdFloor;
	private Button button;

	public Elevator(){
		this.firstFloor = new ElevatorFloorOne(this);
		this.secondFloor = new ElevatorFloorTwo(this);
		this.thirdFloor = new ElevatorFloorThree(this);

		this.state = firstFloor;
		this.button = new Button();
	}

	public void setElevatorState(ElevatorState newElevatorState){
		state = newElevatorState;
	}

	public ElevatorState getElevatorFirstFloor() {
		return firstFloor;
	}

	public ElevatorState getElevatorSecondFloor() {
		return secondFloor;
	}
  
	public ElevatorState getElevatorThirdFloor() {
		return thirdFloor;
	}
	public ElevatorState getState() {
		return state;
	}

	public void setState(ElevatorState newElevatorState) {
		this.state = newElevatorState;
	}

	@Override
	public void press1() {
		
		state.press1();
	}

	@Override
	public void press2() {
		state.press2();
		
	}
	
	@Override
	public void press3() {
		state.press3();
	}

	public Button getButton() {
		return this.button;
	}

}
