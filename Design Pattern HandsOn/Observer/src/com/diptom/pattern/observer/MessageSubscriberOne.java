package com.diptom.pattern.observer;

public class MessageSubscriberOne implements Observer

{

	@Override

	public void update(Message m) {

		System.out.println("MessageSubscriberOne :: " + m.getMessageContent());

	}

	@Override
	public void statemsg(Message m) {
		
		System.out.println("MessageSubscriberOne :: " + m.getStateMsg());
		
	}

}