package com.marsrovers.test;

import static org.junit.Assert.*;

import java.awt.Dimension;

import org.junit.Test;

import com.marsrovers.code.Dimensions;
import com.marsrovers.code.Direction;
import com.marsrovers.code.IllegalMoveException;

public class DimensionsTest {

	private Dimensions dimension;
	
	public DimensionsTest() {
		dimension = new Dimensions();
	}

	@Test
	public void shouldInitialize() {
		assertNotNull(dimension);
	}

	// test the exception condition
	@Test
	public void shouldThrowExceptionOnIllegalMovementString() {
		
		Direction d = Direction.N;
		String illegalMovementString = "MSFD";
		try {
			dimension.move(5, 5, 1, 2, d, illegalMovementString);
		} catch (IllegalMoveException ex) {
			assertEquals("Illegal Movement", ex.getMessage());
		}
	}

	@Test
	public void shouldGiveFinalCoordinates(){
		Direction d = Direction.E;
		String movementString = "MMRMMRMRRM";
		try {

			dimension.setDirection(d);
			dimension.setLast_x(5);
			dimension.setLast_y(5);
			dimension.setPresent_x(3);
			dimension.setPresent_y(3);
			dimension = dimension.move(5, 5, 3, 3, d, movementString);
		} catch (IllegalMoveException ex) {
			assertEquals("Illegal Movement", ex.getMessage());
		}

		assertEquals(dimension.getPresent_x(), 5);
		assertEquals(dimension.getPresent_y(), 1);
		assertEquals(dimension.getDirection(), Direction.E);
	}

}
