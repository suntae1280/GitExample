
public class MyThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; true; i++) {
			System.out.println("Mythread �� ���ϴ��� " + i);
		}
	}

}
