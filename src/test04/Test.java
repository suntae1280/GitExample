package test04;

public class Test {

	public static void main(String[] args) throws  InterruptedException{
		// TODO Auto-generated method stub
		System.out.println("�渶���� ����!");
		
		for(int i=3;i>0;i--) {
			System.out.println("����ī��Ʈ ~ " +i);
			Thread.sleep(1000);
		}
		
		
		
		System.out.println("----���----");
		new Horse("1����").start();
		new Horse("2����").start();
		new Horse("3����").start();
		new Horse("4����").start();
	}

}
