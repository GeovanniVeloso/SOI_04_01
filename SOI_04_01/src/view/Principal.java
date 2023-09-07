package view;

import controller.threadId;

public class Principal {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			
			Thread thId = new threadId(i);
			thId.start();
		}

	}

}
