package com.marsrovers.code;

public enum Direction {

	N("N"),	E("E"), S("S"),W("W");
	
	
	private Direction(String direction) {
        this.direction = direction;
    }
	
	public String direction;
	
	
	public String getDirection() {
		return direction;
	}


	public void setDirection(String direction) {
		this.direction = direction;
	}


	@Override
    public String toString() {
        // TODO Auto-generated method stub
        return direction;
    }
}
