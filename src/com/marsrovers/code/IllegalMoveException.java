package com.marsrovers.code;

public class IllegalMoveException extends Exception {
	
	private static final long serialVersionUID = 1L;

	private String message = "Illegal Movement";
	
	public IllegalMoveException() {
		System.out.println(message);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}

}
