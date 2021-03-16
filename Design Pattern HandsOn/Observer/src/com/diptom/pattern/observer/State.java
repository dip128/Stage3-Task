package com.diptom.pattern.observer;

public class State {
	
	private boolean state;
	
	public State(boolean state) {
		this.state = state;
	}
	
	public boolean getState() {
		return this.state;
	}
	
	public void setState(boolean st) {
		this.state=st;
	}

}
