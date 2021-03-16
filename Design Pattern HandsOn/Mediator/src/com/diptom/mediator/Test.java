package com.diptom.mediator;

public class Test {

	public static void main(String[] args) {
		
		IChatMediator chatmediator = new ChatMediator();
		IUser b_user = new BasicUser(chatmediator,"Diptom");
		IUser p_user = new BasicUser(chatmediator,"Apratim");
		
		chatmediator.AddUser(p_user);
		chatmediator.AddUser(b_user);
		
		b_user.sendMessage();
		p_user.sendMessage();
	}

}
