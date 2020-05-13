package robo;

public class CharlieRobot extends BetaRobot{
	
	public CharlieRobot() {}
	public CharlieRobot(String name, String model) {
		super(name , model);
	}
	
	public boolean moveDownRight() {
		return verifyCharge() && super.moveDown() && super.moveRight();
	}
    public boolean moveDownLeft() {
    	return verifyCharge() && super.moveDown() && super.moveLeft();
	}
    public boolean moveUpRight() {
    	 return verifyCharge() && super.moveUp() && super.moveRight();
	}
    public boolean moveUpLeft() {
    	  return verifyCharge() && super.moveUp() && super.moveLeft();
	}

}
