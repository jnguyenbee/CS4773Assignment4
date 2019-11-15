


public class Elevator implements ElevatorState{


	private ElevatorState firstFloor;
	private ElevatorState secondFloor;
	private ElevatorState thirdFloor;
	private ElevatorState state;
	
	public Elevator(){
		this.setElevatorFirstFloor(new ElevatorFloorOne(this));
		this.setElevatorSecondFloor(new ElevatorFloorTwo(this));
		this.setElevatorThirdFloor(new ElevatorFloorThree(this));
		
		this.state = firstFloor;
	}
	
	public void setElevatorState(ElevatorState state){
		this.state = state;
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

	public ElevatorState getElevatorFirstFloor() {		
		return firstFloor;
	}

	public void setElevatorFirstFloor(ElevatorState elevator) {
		this.firstFloor = elevator;
	}

	public ElevatorState getElevatorSecondFloor() {
		return secondFloor;
	}

	public void setElevatorSecondFloor(ElevatorState elevator) {
		this.secondFloor= elevator;
	}

	public ElevatorState getElevatorThirdFloor() {
		return thirdFloor;
	}

	public void setElevatorThirdFloor(ElevatorState elevator) {
		this.thirdFloor = elevator;
	}

	public ElevatorState getState() {
		return state;
	}

	public void setState(ElevatorState state) {
		this.state = state;
	}

}
