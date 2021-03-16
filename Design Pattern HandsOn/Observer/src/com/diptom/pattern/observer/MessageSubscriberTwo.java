package com.diptom.pattern.observer;

public class MessageSubscriberTwo implements Observer

{

	@Override
	public void update(Message m) {

		System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());

	}

	@Override
	public void statemsg(Message m) {
		
		System.out.println("MessageSubscriberThree :: " + m.getStateMsg());
		
	}
}