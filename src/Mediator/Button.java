package Mediator;

public class Button {
    private Mediator mediator;
 
    // constructor, getters and setters
 
    public Button () {
    	mediator = new Mediator();
    }
    public void pressClose() {
        mediator.pressClose();
    }
    public void pressOpen() {
    	mediator.pressOpen();
    }
    
    
}