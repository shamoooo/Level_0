import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {
	public static void main(String[] args) throws Exception {
		// 1. Make a new Robot
		Robot Kaley = new Robot();
		// 3. Put the robot's pen down
		Kaley.penDown();
		Kaley.setRandomPenColor();
		// 6. Make the robot move as fast as possible
		Kaley.setSpeed(10);
		// 5. Do everything below here 4 times
		for (int i = 0; i < 4; i++) {
			// 2. Move your robot 200 pixels
			Kaley.move(200);
			// 4. Turn the robot 90 degrees to the right (90 degrees)
			Kaley.turn(90);
		}
	}
}
