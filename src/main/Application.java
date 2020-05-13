package main;

import robo.AbstractRobot;
import robo.RobotFactory;
import tests.SimpleTest;
import tests.ChargeTest;
import tests.DiagonalWalkTest;

public class Application {
        public static void main(String[] args) {
		
     	AbstractRobot robo = RobotFactory.getRobot("Alpha","Bob");
		AbstractRobot robo1 = RobotFactory.getRobot("Beta","Jack");
		AbstractRobot robo2 = RobotFactory.getRobot("Charlie","Optimus");
		
		System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase(robo));
        System.out.printf("Simple test passed %d%%\n", ChargeTest.chargeTest(robo1));
        System.out.printf("Simple test passed %d%%\n", DiagonalWalkTest.diagonalTest(robo2));
		

	}
}
