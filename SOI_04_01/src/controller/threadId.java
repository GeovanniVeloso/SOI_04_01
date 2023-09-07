package controller;

public class threadId extends Thread {
	
	private int id;

	public threadId(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		id = (int)getId();
		System.out.println("#"+id);
	}

}
