package test04;

public class Test {

	public static void main(String[] args) throws  InterruptedException{
		// TODO Auto-generated method stub
		System.out.println("경마게임 시작!");
		
		for(int i=3;i>0;i--) {
			System.out.println("시작카운트 ~ " +i);
			Thread.sleep(1000);
		}
		
		
		
		System.out.println("----출발----");
		new Horse("1번마").start();
		new Horse("2번마").start();
		new Horse("3번마").start();
		new Horse("4번마").start();
	}

}
