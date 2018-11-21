package test04;

import java.util.Random;

public class Horse extends Thread{
	
	private String name;
	
	public Horse(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		Random run = new Random();
		for(int i=0;i<100;i++)
		{
			System.out.println(this.name +"말 진행상황 "+ i);	
			try {
				Thread.sleep(run.nextInt(100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		System.out.println(this.name + " 말 도착!");
	}

}
