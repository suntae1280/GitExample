package Homework;

public class Student {

	private String name;
	private String address;
	private int phone_num;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(int phone_num) {
		this.phone_num = phone_num;
	}
	
	public void printInfo() {
		System.out.println("�л� �̸� : " + this.name);
		System.out.println("�л� �ּ� : " + this.address);
		System.out.println("�л� ��ȣ: " + this.phone_num);
		
	}

}
