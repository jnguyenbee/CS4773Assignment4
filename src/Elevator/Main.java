package Elevator;

import Mediator.Button;

public class Main {

	public static void main(String[] args) {
		Elevator elevator = new Elevator();
		
		elevator.press2();
		elevator.press1();
		elevator.press3();
		elevator.press3();
		elevator.press1();
		elevator.press1();
		elevator.press2();
		elevator.press1();
		elevator.press3();
		elevator.press3();

		elevator.press3();

		elevator.press3();

		 
//		Button b1 = new Button();
//		b1.press();
//		b1.press();
	}
}
