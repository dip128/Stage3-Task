package com.diptom.pattern.observer;

public class Message {
	final String messageContent;
	
	public String stateupfate="State Changed";

	public Message(String m) {
		this.messageContent = m;
	}

	public String getMessageContent() {
		return messageContent;
	}
	
	public String getStateMsg() {
		return stateupfate;
	}
}
