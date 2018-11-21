package test04;

public class Test01 {
	public static void main(String[] args) {
		
		Box b = new Box();
		CountThread t1 = new CountThread(b);
		CountThread b2 = new CountThread(b);
		
		t1.start();
		b2.start();
	}

}
