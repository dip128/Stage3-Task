package com.diptom.pattern.observer;

import java.util.ArrayList;

import java.util.List;

public class MessagePublisher implements Subject {

	private List<Observer> observers = new ArrayList<>();

	@Override

	public void attach(Observer o) {

		observers.add(o);

	}

	@Override

	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyUpdate(Message m) {
		for (Observer o : observers) {
			o.update(m);
		}
	}

	@Override
	public void changeState(State st,Message m) {
		//System.out.println("State is "+st.getState());
		st.setState(!st.getState());
		//System.out.println("State is "+st.getState());
		for(Observer o: observers) {
			o.statemsg(m);
		}
	}
}
