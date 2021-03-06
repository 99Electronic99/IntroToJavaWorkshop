package day1.robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot bob = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		bob.setSpeed(10);

		// 5. Set the pen width to 5
		bob.setPenWidth(5);

		// 6. Do steps #7 to #8 four times...
		for (int i = 0; i < 4; i++) {

			// 7. Set the pen color to random
			bob.setRandomPenColor();

			// 8. Turn the robot 90 degrees to the right
			bob.turn(90);

			// 1. Call the drawSquare() method
			drawSquare();
		}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		for (int i = 0; i < 4; i++) {

			bob.penDown();
			bob.move(200);
			bob.turn(90);
		}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
