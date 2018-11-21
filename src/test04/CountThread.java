package test04;

public class CountThread  extends Thread{
	private Box box;
	
	public CountThread(Box box)
	{
		this.box = box;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i =0; i <100000000; i++) {
			box.plus();
			box.minus();
		}
	}

}
