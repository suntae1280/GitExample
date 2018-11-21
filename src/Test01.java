public class Test01 {

	public static void main(String[] args) {

		
		Mythread2 my2 = new Mythread2();
		Thread my = new Thread(my2);
		
	
		
		my.start();
		for (int j = 0; true; j++) {
			System.out.println("Main Thread 가 일하는중 : " + j);
		}

	}
}
