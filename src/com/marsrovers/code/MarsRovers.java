package com.marsrovers.code;

import java.util.Scanner;

public class MarsRovers {

	public static void main(String[] args) throws IllegalMoveException {

		Dimensions dim = new Dimensions();
		Scanner sc = new Scanner(System.in);

		System.out
				.println("Enter the inputs in 3 lines in order specified- highest coordinates, current position of the rover, movement string...");

		dim.last_x = sc.nextInt();
		dim.last_y = sc.nextInt();
		dim.present_x = sc.nextInt();
		dim.present_y = sc.nextInt();
		dim.setDirection(Direction.valueOf(sc.next().toUpperCase()));

		String movementString = sc.next();

		dim = dim.move(dim.last_x, dim.last_y, dim.present_x, dim.present_y,
				dim.direction, movementString);

		System.out.println("The final position is - " + dim.present_x + " "
				+ dim.present_y + " " + dim.direction.toString());
	}

}
