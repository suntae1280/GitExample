package test04;

public class Box {
	
	private int number =0;
	
	synchronized public void plus() {
		number++;
		if(number>3) {
			System.out.println("3���� Ŀ�� ! "+ number);
		}
	}
	
	synchronized public void minus() {
		number--;
		if(number<0)
		{
			System.out.println("0���� �۾���! " + number);
		}
	}

}
