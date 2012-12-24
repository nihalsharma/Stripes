package com.marsrovers.code;

public class Dimensions {

	int last_x;
	int last_y;
	int present_x;
	int present_y;
	Direction direction;

	public Dimensions(int present_x, int present_y, Direction direction) {

		this.present_x = present_x;
		this.present_y = present_y;
		this.direction = direction;

	}

	public Dimensions() {
	}

	public int getLast_x() {
		return last_x;
	}

	public void setLast_x(int last_x) {
		this.last_x = last_x;
	}

	public int getLast_y() {
		return last_y;
	}

	public void setLast_y(int last_y) {
		this.last_y = last_y;
	}

	public int getPresent_x() {
		return present_x;
	}

	public void setPresent_x(int present_x) {
		this.present_x = present_x;
	}

	public int getPresent_y() {
		return present_y;
	}

	public void setPresent_y(int present_y) {
		this.present_y = present_y;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Dimensions move(int last_x, int last_y, int present_x,
			int present_y, Direction direction, String movement)
			throws IllegalMoveException {
		
		int i = 0;
		int length = movement.length();
		while (i < length) {
			char c = movement.charAt(i);

			if (c == 'R') {
				int value = direction.ordinal();
				value = ((value == 3) ? value = -1 : value);
				direction = Direction.values()[value + 1];
			} else if (c == 'L') {
				int value = direction.ordinal();
				value = ((value == 0) ? value = 4 : value);
				direction = Direction.values()[value - 1];
			} else if (c == 'M') {

				if (direction == Direction.N) {
					present_y = ((present_y == last_y) ? (present_y = last_y)
							: present_y + 1);
				}
				if (direction == Direction.E) {
					present_x = ((present_x == last_x) ? (present_x = last_x)
							: present_x + 1);
				}
				if (direction == Direction.S) {
					present_y = ((present_y == 0) ? (present_y = 0)
							: present_y - 1);
				}

				if (direction == Direction.W) {
					present_x = ((present_x == 0) ? (present_x = 0)
							: present_x - 1);
				}

			}

			else {
				throw new IllegalMoveException();
			}

			i++;
		}

		return new Dimensions(present_x, present_y, direction);
	}

}
